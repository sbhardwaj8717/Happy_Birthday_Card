package com.example.happybirthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text ="Cake muze bi de dio..\npllzz\n\uD83D\uDE22\uD83D\uDE22"

    }



    fun btnDbGya(view: View) {
        val name: String = nameLikhLeYha.editableText.toString()
        if (name != "") {
            val intent = Intent(this, readyCard::class.java)
            intent.putExtra(readyCard.Name_Extra, name)
            startActivity(intent)
        }else{
            Toast.makeText(this,"abee yrr....namm to likh le phle kuch",Toast.LENGTH_LONG).show()
        }
    }
}