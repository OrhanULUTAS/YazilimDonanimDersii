package com.example.sporz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import pl.droidsonroids.gif.GifImageView

class bacakbolgesi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bacakbolgesi)
        var button = findViewById<Button>(R.id.button)
        var hareketismi = findViewById<TextView>(R.id.textView5)
        var home = findViewById<ImageView>(R.id.home)
        var legpress= findViewById<GifImageView>(R.id.legpress)
        var squat= findViewById<GifImageView>(R.id.squat)
        var legextansion= findViewById<GifImageView>(R.id.legextension)
        var legcurl= findViewById<GifImageView>(R.id.legcurl)
        var lunges= findViewById<GifImageView>(R.id.lunges)
        var bulgariansplitsquat= findViewById<GifImageView>(R.id.bulgariansplitsquat)
        var calfraise= findViewById<GifImageView>(R.id.calfraise)

        legpress.visibility= View.INVISIBLE
        squat.visibility= View.INVISIBLE
        legextansion.visibility= View.INVISIBLE
        legcurl.visibility= View.INVISIBLE
        lunges.visibility= View.INVISIBLE
        bulgariansplitsquat.visibility= View.INVISIBLE
        calfraise.visibility= View.INVISIBLE



        home.setOnClickListener {
            var gecis = Intent(this, anabasliklar::class.java)
            startActivity(gecis)
            finish()
        }
        button.setOnClickListener{
            var acilirmenu = PopupMenu(this,button)
            acilirmenu.menuInflater.inflate(R.menu.bacakbolgesi,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.legpress ->{
                        hareketismi.text = "Leg Press"
                        legpress.visibility= View.VISIBLE
                        squat.visibility= View.INVISIBLE
                        legextansion.visibility= View.INVISIBLE
                        legcurl.visibility= View.INVISIBLE
                        lunges.visibility= View.INVISIBLE
                        bulgariansplitsquat.visibility= View.INVISIBLE
                        calfraise.visibility= View.INVISIBLE


                        true
                    }
                    R.id.squat ->{
                        hareketismi.text = "Squat"
                        legpress.visibility= View.INVISIBLE
                        squat.visibility= View.VISIBLE
                        legextansion.visibility= View.INVISIBLE
                        legcurl.visibility= View.INVISIBLE
                        lunges.visibility= View.INVISIBLE
                        bulgariansplitsquat.visibility= View.INVISIBLE
                        calfraise.visibility= View.INVISIBLE


                        true
                    }
                    R.id.legextension ->{
                        hareketismi.text = "Leg Extansion"
                        legpress.visibility= View.INVISIBLE
                        squat.visibility= View.INVISIBLE
                        legextansion.visibility= View.VISIBLE
                        legcurl.visibility= View.INVISIBLE
                        lunges.visibility= View.INVISIBLE
                        bulgariansplitsquat.visibility= View.INVISIBLE
                        calfraise.visibility= View.INVISIBLE


                        true
                    }
                    R.id.legcurl ->{
                        hareketismi.text = "Leg Curl"
                        legpress.visibility= View.INVISIBLE
                        squat.visibility= View.INVISIBLE
                        legextansion.visibility= View.INVISIBLE
                        legcurl.visibility= View.VISIBLE
                        lunges.visibility= View.INVISIBLE
                        bulgariansplitsquat.visibility= View.INVISIBLE
                        calfraise.visibility= View.INVISIBLE


                        true
                    }
                    R.id.lunges ->{
                        hareketismi.text = "Lunges"
                        legpress.visibility= View.INVISIBLE
                        squat.visibility= View.INVISIBLE
                        legextansion.visibility= View.INVISIBLE
                        legcurl.visibility= View.INVISIBLE
                        lunges.visibility= View.VISIBLE
                        bulgariansplitsquat.visibility= View.INVISIBLE
                        calfraise.visibility= View.INVISIBLE


                        true
                    }
                    R.id.bulgariansplitsquat ->{
                        hareketismi.text = "Bulgarian Split Squat"
                        legpress.visibility= View.INVISIBLE
                        squat.visibility= View.INVISIBLE
                        legextansion.visibility= View.INVISIBLE
                        legcurl.visibility= View.INVISIBLE
                        lunges.visibility= View.INVISIBLE
                        bulgariansplitsquat.visibility= View.VISIBLE
                        calfraise.visibility= View.INVISIBLE

                        true
                    }
                    R.id.calfraise ->{
                        hareketismi.text = "Calf Raise"
                        legpress.visibility= View.INVISIBLE
                        squat.visibility= View.INVISIBLE
                        legextansion.visibility= View.INVISIBLE
                        legcurl.visibility= View.INVISIBLE
                        lunges.visibility= View.INVISIBLE
                        bulgariansplitsquat.visibility= View.INVISIBLE
                        calfraise.visibility= View.VISIBLE


                        true
                    }



                    else -> false
                }
            }
            acilirmenu.show()
        }
    }
}