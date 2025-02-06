package com.example.autocapture.magnifeyeliveness

import com.innovatrics.dot.image.BitmapFactory
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

typealias SdkMagnifEyeLivenessResult = com.innovatrics.dot.face.liveness.magnifeye.MagnifEyeLivenessResult

class CreateUiResultUseCase(
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
) {

    suspend operator fun invoke(sdkMagnifEyeLivenessResult: com.example.autocapture.magnifeyeliveness.SdkMagnifEyeLivenessResult): com.example.autocapture.magnifeyeliveness.MagnifEyeLivenessResult = withContext(dispatcher) {
        com.example.autocapture.magnifeyeliveness.MagnifEyeLivenessResult(
            bitmap = BitmapFactory.create(sdkMagnifEyeLivenessResult.bgrRawImage),
        )
    }
}
