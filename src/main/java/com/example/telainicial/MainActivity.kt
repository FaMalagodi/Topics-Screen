package com.example.telainicial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setGreeting()
    }

    private fun setGreeting() {
        val greetingTextView = findViewById<TextView>(R.id.text_categorias)

        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)

        val greeting = when {
            hour in 6..11 -> "Bom dia"
            hour in 12..17 -> "Boa tarde"
            else -> "Boa noite"
        }

        // Atualizar o texto do TextView
        greetingTextView.text = "$greeting, usuário"
    }
}