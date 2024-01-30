package com.example.sporz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView

class tatli : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tatli)

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

            acilirmenu.menuInflater.inflate(R.menu.tatli,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.bal ->{
                        button.text = "Bal"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 3.2
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Bal'ın kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.baklava ->{
                        button.text = "Baklava"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 4.325
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Baklava'nın kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.beyazseker -> {
                        button.text = "Beyaz Şeker"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 3.9
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Beyaz Şekeri'in kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.kakao -> {
                        button.text = "Kakao"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 4
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Kakao'nun kalorisi: $sonuc kaloridir."
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
                    R.id.böğürtlenreçeli -> {
                        button.text = "Böğürtlen Reçeli"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 2.7
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Böğürtlen Reçeli'nin kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.kayısıreçeli -> {
                        button.text = "Kayısı Reçeli"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 2.7
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar Kayısı Reçeli'nin kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.yaşpasta -> {
                        button.text = "Yaş Pasta"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 2.5
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Yaş Pasta'nın kalorisi: $sonuc kaloridir."
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