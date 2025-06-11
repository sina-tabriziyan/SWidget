package com.sina.library.audio

import java.io.File

interface IAudioRecorder {
    fun start(outputFile: File, fileName: String): String
    fun stop()
}