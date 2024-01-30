package com.example.sporz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.RadioButton
import android.widget.TextView

class gunlukharcanilankalori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gunlukharcanilankalori)
        var dakika = findViewById<EditText>(R.id.dakika)
        var harcanilankalori = findViewById<TextView>(R.id.harcanilankalori)
        var toplamkalori = findViewById<TextView>(R.id.toplamkalori)
        var topla = findViewById<Button>(R.id.topla)
        var hesapla = findViewById<Button>(R.id.hesapla)
        var home = findViewById<ImageView>(R.id.home)
        var kosu = findViewById<RadioButton>(R.id.kosu)
        var yuruyus = findViewById<RadioButton>(R.id.yuruyus)
        var yuzme = findViewById<RadioButton>(R.id.yuzme)
        var bisikletsurme = findViewById<RadioButton>(R.id.bisikletsurme)
        var temizle = findViewById<Button>(R.id.temizle)

        temizle.setOnClickListener {
            dakika.text = null
            harcanilankalori.text = null
            toplamkalori.text = null

        }


        home.setOnClickListener {
            var gecis = Intent(this, anabasliklar::class.java)
            startActivity(gecis)
            finish()
        }
        var toplamSonuc = 0

        topla.setOnClickListener {
            val sonuc = harcanilankalori.text.toString().toDoubleOrNull() ?: 0.0
            toplamSonuc += sonuc.toInt()
            toplamkalori.text = "Toplam Harcanılan Kalori :  $toplamSonuc"
        }
        hesapla.setOnClickListener {

            if (kosu.isChecked) {
                val girilendakika = dakika.text.toString()
                var girilendakikaislemi = girilendakika.toDouble()
                val sonuc = girilendakikaislemi * (960 / 60)
                harcanilankalori.text = sonuc.toString()

            }
            else if (yuruyus.isChecked){
                val girilendakika = dakika.text.toString()
                var girilendakikaislemi = girilendakika.toDouble()
                val sonuc = girilendakikaislemi * (400 / 60)
                harcanilankalori.text = sonuc.toString()

            }
            else if (yuzme.isChecked) {
                val girilendakika = dakika.text.toString()
                var girilendakikaislemi = girilendakika.toDouble()
                val sonuc = girilendakikaislemi * (800 / 60)
                harcanilankalori.text = sonuc.toString()
            }
            else if (bisikletsurme.isChecked){
                val girilendakika = dakika.text.toString()
                var girilendakikaislemi = girilendakika.toDouble()
                val sonuc = girilendakikaislemi * (700 / 60)
                harcanilankalori.text = sonuc.toString()
            }
        }





    }
}