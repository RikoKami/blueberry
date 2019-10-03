package com.example.blueberry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
//        Picasso
//            .get()
//            .load("logoblueberry.png")
//            .into(imageView)
        imageView.setImageResource(R.drawable.logoblueberry)
    }

    override fun onResume() {
        super.onResume()
        toast("Resume")
    }

    override fun onStart() {
        super.onStart()
        toast("FIRST BLOOD!")
    }

    fun toast(text:String) = Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

    override fun onRestart() {
        super.onRestart()
        toast("Reiniciando")
    }

    override fun onPause() {
        super.onPause()
        toast("Pause")
    }

    override fun onDestroy() {
        super.onDestroy()
        toast("Destruindo")
    }
}
