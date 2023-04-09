package com.example.a1er_proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity3 : AppCompatActivity() {

    private lateinit var tvSaludo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        tvSaludo = findViewById<TextView>(R.id.tvSaludo)
    }

    fun MyClick(view: View) {
        when(view.id){
            R.id.tvSaludo -> {
                tvSaludo.text = "Set Me"
            }

            R.id.btnAction ->{
                tvSaludo.text = "Free"
            }
        }
    }
}