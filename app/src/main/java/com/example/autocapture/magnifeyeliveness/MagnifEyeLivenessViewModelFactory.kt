package com.example.autocapture.magnifeyeliveness

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MagnifEyeLivenessViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return com.example.autocapture.magnifeyeliveness.MagnifEyeLivenessViewModel(com.example.autocapture.magnifeyeliveness.CreateUiResultUseCase()) as T
    }
}
