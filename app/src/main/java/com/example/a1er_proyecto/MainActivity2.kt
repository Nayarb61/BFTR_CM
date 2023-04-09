package com.example.a1er_proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity(), View.OnClickListener { // ---:--- , representa la herencia y la interfaz se marca con una coma (,) despues de la herencia

    private lateinit var btnAction: Button      //inicializando las variables
    private lateinit var tvSaludo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnAction = findViewById<Button>(R.id.btnAction)
        tvSaludo = findViewById<TextView>(R.id.tvSaludo)

        btnAction.setOnClickListener(this)
        tvSaludo.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnAction ->   {
                tvSaludo.text = "Hype Boy"
            }
            R.id.tvSaludo -> {
                tvSaludo.text = "Attention"
            }
        }
    }
}