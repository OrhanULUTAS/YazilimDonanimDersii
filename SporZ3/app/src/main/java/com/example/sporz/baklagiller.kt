package com.example.sporz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView

class baklagiller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baklagiller)

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

            acilirmenu.menuInflater.inflate(R.menu.baklagiller,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.bamya ->{
                        button.text = "Bamya"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 0.84
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram  Bamya'nın kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.beyazfasulye ->{
                        button.text = "Beyaz Fasulye"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 3.36
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram  Beyaz Fasulye'in kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.bezelye -> {
                        button.text = "Bezelye"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 0.81
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram  Bezelye'nin kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.kırmızımercimek -> {
                        button.text = "Kırmızı Mercimek"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 3.29
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram  Kırmızı Mercimek'in kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.nohut-> {
                        button.text = "Nohut"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 3.64
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram  Nohut'un kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.soyafasülyesi -> {
                        button.text = "Soya Fasulyesi"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 1.47
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Soya Fasulyesi'nin kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.yerfıstıgı -> {
                        button.text = "Yer Fıstğı"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 5.67
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Yer Fıstğı'nın kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.yeşilfasülye -> {
                        button.text = "Yeşil Fasulye"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 0.31
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Yeşil Fasulye'nin kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.yeşilmercimek -> {
                        button.text = "Yeşil Mercimek"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 2.57
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Yeşil Mercimek'in kalorisi: $sonuc kaloridir."
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