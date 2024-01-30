package com.example.sporz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu

class hangibesinkackalori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hangibesinkackalori)
        var button = findViewById<Button>(R.id.button)
        var home = findViewById<ImageView>(R.id.home)


        home.setOnClickListener {
            var gecis = Intent(this, anabasliklar::class.java)
            startActivity(gecis)
            finish()
        }

        button.setOnClickListener{
            var acilirmenu = PopupMenu(this,button)
            acilirmenu.menuInflater.inflate(R.menu.besinler,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.eturunleri ->{
                        val gecis= Intent(applicationContext,eturunleri::class.java)
                        startActivity(gecis)
                        true
                    }
                    R.id.baklagiller ->{
                        val gecis= Intent(applicationContext,baklagiller::class.java)
                        startActivity(gecis)
                        true
                    }
                    R.id.sebze -> {
                        val gecis =
                            Intent(applicationContext, sebze::class.java)
                        startActivity(gecis)
                        true
                    }
                    R.id.meyve -> {
                        val gecis =
                            Intent(applicationContext, meyve::class.java)
                        startActivity(gecis)
                        true
                    }
                    R.id.tatlı -> {
                        val gecis =
                            Intent(applicationContext, tatli::class.java)
                        startActivity(gecis)
                        true
                    }
                    R.id.kuruyemis -> {
                        val gecis =
                            Intent(applicationContext, kuruyemis::class.java)
                        startActivity(gecis)
                        true
                    }
                    R.id.yaglar -> {
                        val gecis =
                            Intent(applicationContext, yaglar::class.java)
                        startActivity(gecis)
                        true
                    }

                    else -> false
                }
            }
            acilirmenu.show()
        }
    }
}