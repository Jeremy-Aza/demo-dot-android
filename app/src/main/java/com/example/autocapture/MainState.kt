package com.example.autocapture

data class MainState(
    val isProcessing: Boolean = false,
    val errorMessage: String? = null,
)
