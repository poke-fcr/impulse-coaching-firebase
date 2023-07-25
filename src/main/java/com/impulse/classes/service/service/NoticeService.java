package com.impulse.classes.service.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import com.impulse.classes.service.entity.NoticeEntity;

@Service
public class NoticeService {
	private static final String COLLECTION_NAME = "notices";
	public Map<String, String> saveNotice(NoticeEntity noticeEntity) {
		Firestore dbFireStore = FirestoreClient.getFirestore();
		dbFireStore.collection(COLLECTION_NAME).document(noticeEntity.getNoticeId()).set(noticeEntity);
		 HashMap<String, String> map = new HashMap<>();
		map.put("status", "successful");
		return map;
	}
	
	public Map<String, String> deleteNotice(String noticeId) {
		Firestore db = FirestoreClient.getFirestore();
		db.collection(COLLECTION_NAME).document(noticeId).delete();
		 HashMap<String, String> map = new HashMap<>();
		    map.put("status", "successful");
		return map;
	}

	public List<NoticeEntity> getAllNotices() {
		List<NoticeEntity> be = new ArrayList<>();
		try {
			Firestore dbFireStore = FirestoreClient.getFirestore();
			// asynchronously retrieve all documents
			ApiFuture<QuerySnapshot> future = dbFireStore.collection(COLLECTION_NAME).get();
			// future.get() blocks on response
			List<QueryDocumentSnapshot> documents;
			documents = future.get().getDocuments();
			for (QueryDocumentSnapshot document : documents) {

				be.add(document.toObject(NoticeEntity.class));
				System.out.println(document.getId() + " => " + document.toObject(NoticeEntity.class));
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
