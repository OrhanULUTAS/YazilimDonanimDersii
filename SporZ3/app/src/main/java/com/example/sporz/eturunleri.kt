package com.example.sporz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView

class eturunleri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eturunleri)
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

            acilirmenu.menuInflater.inflate(R.menu.eturunleri,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.danaantrikot ->{
                        button.text = "Dana antrikot"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 1.6
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Dana Antrikot'un kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.danabiftek ->{
                        button.text = "Dana Biftek"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 1.85
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Dana Biftek'in kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.danabonfile -> {
                        button.text = "Dana Bonfile"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 1.68
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Dana Bonfile'nin kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.danasucuk -> {
                        button.text = "Dana Sucuk"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 4.45
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Dana Sucuk'un kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.tavukbut -> {
                        button.text = "Tavuk But"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 2.21
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Tavuk But'un kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.tavukgögüs -> {
                        button.text = "Tavuk Göğüs"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 1.65
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Tavuk Göğsü'nün kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.tavukkıyma -> {
                        button.text = "Tavuk Kıyma"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 1.43
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Tavuk Kıyma'nın kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.hamsi -> {
                        button.text = "Hamsi"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 2.25
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Hamsi'nin kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.levrek -> {
                        button.text = "Levrek"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 2.79
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Levrek'in kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.tonbalığı -> {
                        button.text = "Ton Balığı"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 1.84
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Ton Balığı'nın kalorisi: $sonuc kaloridir."
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