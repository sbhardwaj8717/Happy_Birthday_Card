package com.example.happybirthdaycard

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_ready_card.*
import java.util.jar.Manifest

class readyCard : AppCompatActivity() {

    companion object{
        const val Name_Extra = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ready_card)

        val getName = intent.getStringExtra(Name_Extra)
        admiKaNamm.setText("Happy Birthday $getName ..!")
    }

    fun saveToGallary(view: View) {


        val share = Intent(Intent.ACTION_SEND)
        share.type="image/jpeg"
        share.putExtra(Intent.EXTRA_TEXT, "bhaii cake dekio kssa lgra")
        val chooser = Intent.createChooser(share, imageView.toString())
        startActivity(chooser)
        Toast.makeText(this,"bhaii abii yeh kam ni krra button...",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"thode time bad jb mere se aa jayega krna tb kr duga pakka",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"or hann bhai ek batt or...",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"press back to go to home screen. Thank you",Toast.LENGTH_LONG).show()
    }

}