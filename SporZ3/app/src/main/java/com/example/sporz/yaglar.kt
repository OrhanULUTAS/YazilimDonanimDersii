package com.example.sporz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView

class yaglar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yaglar)

        var button = findViewById<Button>(R.id.button)
        var miktar = findViewById<EditText>(R.id.miktar)
        var bilgi = findViewById<TextView>(R.id.bilgi)
        var hesapla = findViewById<Button>(R.id.hesapla)
        var home = findViewById<ImageView>(R.id.home)


        home.setOnClickListener {
            var gecis = Intent(this, anabasliklar::class.java)
            startActivity(gecis)
            finish()
        }

        button.setOnClickListener{
            var acilirmenu = PopupMenu(this,button)

            acilirmenu.menuInflater.inflate(R.menu.yaglar,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.zeytinyagı ->{
                        button.text = "Zeytin Yağı (Tatlı Kaşığı)"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 44
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar tatlı kaşıgı Zeytin Yağı'nın kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.tereyagı ->{
                        button.text = "Tere Yağı (Tatlı Kaşığı)"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 44
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar tatlı kaşığı Tere Yağı'nın kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.margarin -> {
                        button.text = "Margarin (Tatlı Kaşığı)"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 44
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar tatlı kaşığı Margarin'in kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.aycickyagı -> {
                        button.text = "Ayçicek Yağı (Tatlı Kaşığı)"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 44
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar tatlı kaşıgı Ayçiçek Yağı'nın kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.susamyagı-> {
                        button.text = "Susam Yağı (Tatlı Kaşığı)"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 44
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar tatlı kaşığı Susam Yağı'nın kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }

                    else -> false
                }
            }
            acilirmenu.show()
        }
    }
}