package com.example.kmpsample

import android.content.res.Resources
import android.os.Build
import android.util.Log
import kotlin.math.round

actual class Platform {
    actual val osName: String
        get() = "Android"
    actual val osVersion: String
        get() = "${Build.VERSION.SDK_INT}"
    actual val deviceModel: String
        get() = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            Build.SOC_MANUFACTURER
        } else {
            Build.MANUFACTURER
        }.plus(" ${Build.MODEL}")
    actual val density: Int
        get() = round(Resources.getSystem().displayMetrics.density).toInt()

    actual fun logSystem(){
        Log.d("Kethu", "logSystem: $osName  $osVersion  $deviceModel  $density")
    }
}