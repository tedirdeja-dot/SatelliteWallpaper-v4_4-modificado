package com.satellite.wallpaper

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class UnlockReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_BOOT_COMPLETED) {
            // El arranque solo vuelve a activar el listener; no descarga la imagen.
            UnlockService.start(context)
        }
    }
}
