package com.migueldev.certificationpractice

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_core.*

class CoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_core)

        toastbutton.setOnClickListener {
            actionToastButtton()
        }

        snackbutton.setOnClickListener {
            actionSnackBarButton()
        }

        notificationbutton.setOnClickListener {
            actionNotification()
        }
    }

    private fun actionToastButtton(){
        Toast.makeText(this,"Mensaje de practica",Toast.LENGTH_LONG).show()
    }

    private fun actionSnackBarButton(){
        val mySnackbar=Snackbar.make(root_layout,"Mensaje de snack",Snackbar.LENGTH_INDEFINITE)
        mySnackbar.setAction("Undo",View.OnClickListener {
            mySnackbar.dismiss()
        })
        mySnackbar.show()
    }

    private fun actionNotification(){
        val CHANNEL_ID="notify"
        var builder= NotificationCompat.Builder(this,CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_mail)
            .setContentTitle("Tittle")
            .setContentText("Content text")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        with(NotificationManagerCompat.from(this)){
            notify(32,builder.build())
        }
    }




}