package com.asid.social.data

import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage

object FirebaseConfig {
    fun init() {
        FirebaseApp.initializeApp(null)
    }

    fun firestore(): FirebaseFirestore = FirebaseFirestore.getInstance()
    fun storage(): FirebaseStorage = FirebaseStorage.getInstance()
}
