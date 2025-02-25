package com.example.autocapture.faceautocapture

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class FaceAutoCaptureViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return FaceAutoCaptureViewModel(CreateUiResultUseCase()) as T
    }
}
