package com.impulse.classes.service.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import com.impulse.classes.service.entity.BatchEntity;
import java.util.*;
@Service
public class BatchService {
	private static final String COLLECTION_NAME = "batches";

	public Map<String, String> saveBatch(BatchEntity batchEntity) {
		Firestore dbFireStore = FirestoreClient.getFirestore();
		dbFireStore.collection(COLLECTION_NAME).document(batchEntity.getBatchId()).set(batchEntity);
		 HashMap<String, String> map = new HashMap<>();
		map.put("status", "successful");
		return map;
	}
	
	public Map<String, String> deleteBatch(String batchId) {
		Firestore db = FirestoreClient.getFirestore();
		db.collection(COLLECTION_NAME).document(batchId).delete();
		 HashMap<String, String> map = new HashMap<>();
		    map.put("status", "successful");
		return map;
	}

	public List<BatchEntity> getAllBatches() {
		List<BatchEntity> be = new ArrayList<>();
		try {
			Firestore dbFireStore = FirestoreClient.getFirestore();
			// asynchronously retrieve all documents
			ApiFuture<QuerySnapshot> future = dbFireStore.collection("batches").get();
			// future.get() blocks on response
			List<QueryDocumentSnapshot> documents;
			documents = future.get().getDocuments();
			for (QueryDocumentSnapshot document : documents) {

				be.add(document.toObject(BatchEntity.class));
				System.out.println(document.getId() + " => " + document.toObject(BatchEntity.class));
			}

		} catch (InterruptedException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
			return be;
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return be;
		}
		return be;

	}
}
