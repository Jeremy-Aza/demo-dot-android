package com.example.autocapture.faceautocapture

data class FaceAutoCaptureState(
    val isProcessing: Boolean = false,
    val result: FaceAutoCaptureResult? = null,
    val errorMessage: String? = null,
)
