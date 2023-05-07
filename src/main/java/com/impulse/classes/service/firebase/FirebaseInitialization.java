package com.impulse.classes.service.firebase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import jakarta.annotation.PostConstruct;

@Service
public class FirebaseInitialization {

	@PostConstruct
	public void initializaFirebase() {

		try {
//			File file = ResourceUtils.getFile("classpath:serviceAccountKey.json");
			InputStream serviceAccount = this.getClass().getResourceAsStream("/serviceAccountKey.json");
//			FileInputStream serviceAccount = new FileInputStream("/serviceAccountKey.json");
//			FileInputStream serviceAccount = new FileInputStream(file);
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
