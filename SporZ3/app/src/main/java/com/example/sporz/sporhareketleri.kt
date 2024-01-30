package com.example.sporz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
class sporhareketleri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sporhareketleri)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            var acilirmenu = PopupMenu(this,button)
            acilirmenu.menuInflater.inflate(R.menu.sporbolgeleri,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.gogus ->{
                        val gecis= Intent(applicationContext,gogusbolgesi::class.java)
                        startActivity(gecis)
                        true
                    }
                    R.id.sırt ->{
                        val gecis= Intent(applicationContext,sirtbolgesi::class.java)
                        startActivity(gecis)
                        true
                    }
                    R.id.omuz ->{
                        val gecis= Intent(applicationContext,omuzbolgesi::class.java)
                        startActivity(gecis)
                        true
                    }
                    R.id.bacak ->{
                        val gecis= Intent(applicationContext,bacakbolgesi::class.java)
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