package com.example.autocapture.io

import java.io.File

interface ResourceCopier {

    fun copyToFile(resourceId: Int, destinationFile: File)
}
