package com.example.sporz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class gunlukalinmasigerekenkalori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gunlukalinmasigerekenkalori)
        var home = findViewById<ImageView>(R.id.home)
        home.setOnClickListener {
            var gecis = Intent(this, anabasliklar::class.java)
            startActivity(gecis)
            finish()
        }
        var kilo = findViewById<EditText>(R.id.kilo)
        var boy = findViewById<EditText>(R.id.boy)
        var yas = findViewById<EditText>(R.id.yas)
        var sonuc = findViewById<TextView>(R.id.sonuc)
        var hesapla = findViewById<Button>(R.id.hesapla)
        var temizle = findViewById<Button>(R.id.temizle)
        var erkek = findViewById<RadioButton>(R.id.erkek)
        var kadın = findViewById<RadioButton>(R.id.kadın)
        var masabası = findViewById<RadioButton>(R.id.masabası)
        var hafifhareket = findViewById<RadioButton>(R.id.hafifhareket)
        var ortadüzey = findViewById<RadioButton>(R.id.ortadüzey)
        var yüksekdüzey = findViewById<RadioButton>(R.id.yüksekdüzey)


        hesapla.setOnClickListener {
            val girilenkilo = kilo.text.toString()
            val girilenboy = boy.text.toString()
            val girilenyas = yas.text.toString()
            if (girilenkilo.isNotEmpty() && girilenboy.isNotEmpty() && girilenyas.isNotEmpty()) {
                val hesaplanacakkilo = girilenkilo.toDouble()
                val hesaplanacakboy = girilenboy.toDouble()
                val hesaplanacakyas = girilenyas.toDouble()

                val erkekmetabolizma =
                    66.5 + (13.75 * hesaplanacakkilo) + (5 * hesaplanacakboy) - (4.67 * hesaplanacakyas)
                val kadınmetabolizma =
                    655.1 + (9.56 * hesaplanacakkilo) + (1.85 * hesaplanacakboy) - (4.67 * hesaplanacakyas)


                if (erkek.isChecked) {
                    val erkekmetabolizma =
                        66.5 + (13.75 * hesaplanacakkilo) + (5 * hesaplanacakboy) - (4.67 * hesaplanacakyas)
                    if (masabası.isChecked){
                        var kalori = erkekmetabolizma*1.2
                        sonuc.text = kalori.toString()

                    }else if (hafifhareket.isChecked){
                        var kalori = erkekmetabolizma*1.3
                        sonuc.text= kalori.toString()
                    }else if (ortadüzey.isChecked){
                        var kalori = erkekmetabolizma*1.4
                        sonuc.text= kalori.toString()
                    }else if (yüksekdüzey.isChecked){
                        var kalori = erkekmetabolizma * 1.5
                        sonuc.text = kalori.toString()
                    }
                }else if (kadın.isChecked){
                    val kadınmetabolizma =
                        655.1 + (9.56 * hesaplanacakkilo) + (1.85 * hesaplanacakboy) - (4.67 * hesaplanacakyas)
                    if (masabası.isChecked){
                        var kalori = kadınmetabolizma*1.2
                        sonuc.text = kalori.toString()
                    }else if (hafifhareket.isChecked){
                        var kalori = kadınmetabolizma*1.3
                        sonuc.text = kalori.toString()
                    }else if (ortadüzey.isChecked){
                        var kalori = kadınmetabolizma*1.4
                        sonuc.text = kalori.toString()
                    }else if (yüksekdüzey.isChecked){
                        var kalori = kadınmetabolizma*1.5
                        sonuc.text = kalori.toString()
                    }

                }







            }


        }
        temizle.setOnClickListener {
            kilo.text = null
            boy.text=null
            yas.text=null
            sonuc.text = null

        }
    }
}