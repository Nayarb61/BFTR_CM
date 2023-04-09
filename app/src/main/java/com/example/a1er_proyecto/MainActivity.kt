package com.example.a1er_proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.btnAction)
        val saludo = findViewById<TextView>(R.id.tvSaludo)

        boton.setOnClickListener{
            Log.d("LOGTAG", "FUNCIONANDO BOTON")
        }

        saludo.setOnClickListener{
            Log.d("LOGTAG", "FUNCIONANDO PANTALLA")
        }
    }
}

