package com.impulse.classes.service.firebase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import jakarta.annotation.PostConstruct;

@Service
public class FirebaseInitialization {

	@PostConstruct
	public void initializaFirebase() {

		FileInputStream serviceAccount;
		try {
			serviceAccount = new FileInputStream("serviceAccountKey.json");

			FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
					.setDatabaseUrl("https://mysql-6ebe8-default-rtdb.asia-southeast1.firebasedatabase.app").build();

			FirebaseApp.initializeApp(options);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
