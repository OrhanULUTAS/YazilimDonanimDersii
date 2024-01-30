package com.example.sporz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class vucutkitleindeksi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vucutkitleindeksi)
        var kilo = findViewById<EditText>(R.id.kilo)
        var boy = findViewById<EditText>(R.id.boy)
        var hesapla = findViewById<Button>(R.id.hesapla)
        var home = findViewById<ImageView>(R.id.home)
        var yazılacaksonuc = findViewById<TextView>(R.id.sonuc)
        var temizle = findViewById<Button>(R.id.temizle)
        home.setOnClickListener {
            var gecis = Intent(this , anabasliklar::class.java)
            startActivity(gecis)
            finish()
        }

        hesapla.setOnClickListener {
            val girilenkilo = kilo.text.toString()
            val girilenboy = boy.text.toString()
            if (girilenkilo.isNotEmpty() && girilenboy.isNotEmpty()) {
                val hesaplanacakkilo = girilenkilo.toDouble()
                val hesaplanacakboy = girilenboy.toDouble() /100
                val sonuc = hesaplanacakkilo / (hesaplanacakboy*hesaplanacakboy)
                yazılacaksonuc.text = "Hesaplanan İndeks : %  ${sonuc.toInt()}"
                val message = "Sonuç : %  $sonuc"
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            }
        }
        temizle.setOnClickListener{
            kilo.text= null
            boy.text = null
            yazılacaksonuc.text = null


        }
    }
}