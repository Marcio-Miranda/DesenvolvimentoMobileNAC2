/*
Desenvolvimento Mobile - NAC2 - 5ECS
RM 74409 - Ana Flavia Carneiro
RM 74407 - Fabio Hellu
RM 73769 - Marcio Miranda
RM 75164 - Ricardo Rodrigues Silva
 */
package com.example.desenvolvimentomobile_nac2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        floatingActionButton.setOnClickListener {
            val intent = Intent(this, AdicionaContato::class.java).also {
                startActivity(it)
            };
        }
    }
}
