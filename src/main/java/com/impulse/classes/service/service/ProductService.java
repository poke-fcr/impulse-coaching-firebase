package com.impulse.classes.service.service;

import org.springframework.stereotype.Service;

import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.impulse.classes.service.entity.Product;

@Service
public class ProductService {

	private static final String COLLECTION_NAME = "products";

	public String saveProduct(Product product) {
		Firestore dbFireStore = FirestoreClient.getFirestore();
		dbFireStore.collection(COLLECTION_NAME).document(product.getName()).set(product);
		return "Successful";
	}
	
}
