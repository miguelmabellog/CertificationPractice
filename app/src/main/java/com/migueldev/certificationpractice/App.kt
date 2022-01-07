package com.migueldev.certificationpractice

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()

    }

    private fun createNotificationChannel(){
        val CHANNEL_ID="notify"
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){
            val name="Channel_name"
            val description="Channel description"
            val importance= NotificationManager.IMPORTANCE_DEFAULT
            val channel= NotificationChannel(CHANNEL_ID,name,importance).apply {
                setDescription(description)
            }
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)



        }
    }
}