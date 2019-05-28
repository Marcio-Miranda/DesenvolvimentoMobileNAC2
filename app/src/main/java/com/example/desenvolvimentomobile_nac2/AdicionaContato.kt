/*
Desenvolvimento Mobile - NAC2 - 5ECS
RM 74409 - Ana Flavia Carneiro
RM 74407 - Fabio Hellu
RM 73769 - Marcio Miranda
RM 75164 - Ricardo Rodrigues Silva
 */
package com.example.desenvolvimentomobile_nac2

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
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

        fun String.isValidEmail() =
            this.isNotEmpty() && android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()

        textInput2.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                val value = textInput2.text.toString()
                if (value.isValidEmail()){
                    textInput2.setTextColor(Color.parseColor("#000000"))
                    textInput2.setError(null)
                } else {
                    textInput2.setTextColor(Color.parseColor("#FF0000"))
                    textInput2.setError("E-mail inválido")
                }
            }
        })
    }
}
