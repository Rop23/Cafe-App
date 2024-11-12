package com.example.cafeapp

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private var mOrderMessage: String = ""
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        //Display a Toast message
        fun displayToast(message: String){
            Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
        }

        //Show a message that the donut image was clicked
        fun showDonutOrder(view: View){
          mOrderMessage = "You ordered a donut."
          displayToast(mOrderMessage)
        }

        //Show a message that the ice cream sandwich image was clicked
        fun showIceCreamOrder(view: View){
            mOrderMessage = "You ordered an ice cream sandwich."
            displayToast(mOrderMessage)
        }

        //Show a message that the froyo image was clicked
        fun showFroyoOrder(view: View){
            mOrderMessage = "You ordered a Froyo."
            displayToast(mOrderMessage)
        }

        //
        fun startOrder(view: View){
            Snackbar.make(view, "Not yet implemented Order functionality", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
        }

    }
}