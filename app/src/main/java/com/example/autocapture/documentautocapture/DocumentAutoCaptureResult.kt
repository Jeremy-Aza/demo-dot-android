package com.example.autocapture.documentautocapture

import android.graphics.Bitmap

data class DocumentAutoCaptureResult(
    val bitmap: Bitmap,
    val documentAutoCaptureResult: com.innovatrics.dot.document.autocapture.DocumentAutoCaptureResult,
)
