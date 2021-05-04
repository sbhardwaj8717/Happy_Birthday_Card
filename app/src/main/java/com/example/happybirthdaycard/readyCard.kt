package com.example.happybirthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ready_card.*

class readyCard : AppCompatActivity() {

    companion object{
        const val Name_Extra = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ready_card)

        val getName = intent.getStringExtra(Name_Extra)
        name.setText("Happy Birthday \n$getName ..!")
    }

    fun saveToGallary(view: View) {


        val share = Intent(Intent.ACTION_SEND)
        share.type="image/jpeg"
        share.putExtra(Intent.EXTRA_TEXT, "bhaii cake dekio kssa lgra")
        val chooser = Intent.createChooser(share, imageView.toString())
        startActivity(chooser)
        Toast.makeText(this,"Bro this button is not currently working..\uD83D\uDE05",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"Surely I will fix it shortly when I'll learn how to fix it...",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"And also one more thing bro...",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"press back to go to home screen. Thank you\uD83D\uDE42",Toast.LENGTH_LONG).show()
    }

}