package com.example.autocapture.faceautocapture

import android.graphics.Bitmap

data class FaceAutoCaptureResult(
    val bitmap: Bitmap,
    val faceAutoCaptureResult: com.innovatrics.dot.face.autocapture.FaceAutoCaptureResult,
)
