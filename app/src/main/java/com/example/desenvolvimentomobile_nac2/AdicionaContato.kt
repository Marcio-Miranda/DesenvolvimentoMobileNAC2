package com.example.desenvolvimentomobile_nac2

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_adiciona_contato.*

class AdicionaContato : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adiciona_contato)
        imageButton.setOnClickListener {
            finish();
        }
        button1.setOnClickListener {
            finish();
        }
    }
}
