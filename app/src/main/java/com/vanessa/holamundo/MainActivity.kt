package com.vanessa.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1: Button = findViewById(R.id.buttoningresar)
        boton1.setOnClickListener { ingresarNombre() }
    }

    private fun ingresarNombre() {

        val campoNombre: EditText = findViewById(R.id.editTextTextPersonName)
        var nombre=campoNombre.text

        Toast.makeText(this, "Bienveni@ $nombre", Toast.LENGTH_LONG).show()
    }
}