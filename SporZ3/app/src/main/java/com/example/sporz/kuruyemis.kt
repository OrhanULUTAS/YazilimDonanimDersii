package com.example.sporz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView

class kuruyemis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuruyemis)

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

            acilirmenu.menuInflater.inflate(R.menu.kuruyemis,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.antepfıstığı ->{
                        button.text = "Antep Fıstığı"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 5.9
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Antep Fıstığı'nın kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.aycekirdeği ->{
                        button.text = "Ay Çekirdeği"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 5.6
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Ay Çekirdeği'nin kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.badem -> {
                        button.text = "Badem"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 6
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Badem'in kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.ceviz -> {
                        button.text = "Ceviz"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 6.5
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Ceviz'in kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.fındık-> {
                        button.text = "Fındık"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 6.3
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram  Fındık'ın kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.kabakçekirdeği -> {
                        button.text = "Kabak Çekirdeği"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 6.1
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Kabak Çekirdeği'nin kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }
                    R.id.kaju -> {
                        button.text = "Kaju"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 6.1
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Kaju'nun kalorisi: $sonuc kaloridir."
                            } else {
                                bilgi.text = "Geçerli bir miktar giriniz."
                            }
                        }
                        true
                    }

                    R.id.yerfıstıgı -> {
                        button.text = "Yer Fıstığı"
                        hesapla.setOnClickListener {
                            val girilenMiktar = miktar.text.toString().toDoubleOrNull()

                            if (girilenMiktar != null) {
                                val kalori = 5.8
                                val sonuc = girilenMiktar * kalori
                                bilgi.text = "$girilenMiktar gram Yer Fıstığı'nın kalorisi: $sonuc kaloridir."
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