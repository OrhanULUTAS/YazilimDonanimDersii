package com.example.sporz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView

class meyve : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meyve)
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

            acilirmenu.menuInflater.inflate(R.menu.meyve,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.armut ->{
                        button.text = "Armut"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 114
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar adet orta boyut Armut'un kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.ayva ->{
                        button.text = "Ayva"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 98
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar adet orta boyut Ayva'nın kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.cilek -> {
                        button.text = "Çilek"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 0.81
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar adet kase (orta) Çilek'in kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.elma -> {
                        button.text = "Elma"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 52
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar adet orta boyut Elma'nın kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.erik-> {
                        button.text = "Erik"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 9
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar adet orta boyut Erik'in kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.mandalina -> {
                        button.text = "Mandalina"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 66
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar adet orta boyut Mandalina'nın kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.seftali -> {
                        button.text = "Şeftali"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 78
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar adet orta boyut Şeftali'nin kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.yesilüzüm -> {
                        button.text = "Yeşil Üzüm"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 159
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar kase (orta) Yeşil Üzüm'ün kalorisi: $sonuc kaloridir."
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