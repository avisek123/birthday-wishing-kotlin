package com.example.mykotlin

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

    }

    fun createBirthdayCard(view: View) {
        val name = editTextTextPersonName3.editableText.toString()
        val intent = Intent(this, BirthdayActivity::class.java)
        intent.putExtra("name",name)
        startActivity(intent);

    }
}