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

class sirtbolgesi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sirtbolgesi)
        var button = findViewById<Button>(R.id.button)
        var hareketismi = findViewById<TextView>(R.id.textView5)
        var home = findViewById<ImageView>(R.id.home)
        var latpulldown = findViewById<GifImageView>(R.id.latpulldown)
        var seatedrow = findViewById<GifImageView>(R.id.seatedrow)
        var dumbbellrow = findViewById<GifImageView>(R.id.dumbbelrow)
        var bentoverbarbellrow = findViewById<GifImageView>(R.id.bentoverbarbellrow)
        var closegriplatpulldown = findViewById<GifImageView>(R.id.closegripdumbbellrow)
        var pullup = findViewById<GifImageView>(R.id.pullup)
        var backextansion = findViewById<GifImageView>(R.id.backextension)


            latpulldown.visibility= View.INVISIBLE
            seatedrow.visibility= View.INVISIBLE
            dumbbellrow.visibility= View.INVISIBLE
            bentoverbarbellrow.visibility= View.INVISIBLE
            closegriplatpulldown.visibility= View.INVISIBLE
            pullup.visibility= View.INVISIBLE
            backextansion.visibility= View.INVISIBLE
        home.setOnClickListener {
            var gecis = Intent(this, anabasliklar::class.java)
            startActivity(gecis)
            finish()
        }

        button.setOnClickListener{
            var acilirmenu = PopupMenu(this,button)
            acilirmenu.menuInflater.inflate(R.menu.sirtbolgesi,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.latpulldown ->{
                        hareketismi.text = "Lat Pull Down"
                        latpulldown.visibility= View.VISIBLE
                        seatedrow.visibility= View.INVISIBLE
                        dumbbellrow.visibility= View.INVISIBLE
                        bentoverbarbellrow.visibility= View.INVISIBLE
                        closegriplatpulldown.visibility= View.INVISIBLE
                        pullup.visibility= View.INVISIBLE
                        backextansion.visibility= View.INVISIBLE

                        true
                    }
                    R.id.seatedrow ->{
                        hareketismi.text = "Seated Row"
                        latpulldown.visibility= View.INVISIBLE
                        seatedrow.visibility= View.VISIBLE
                        dumbbellrow.visibility= View.INVISIBLE
                        bentoverbarbellrow.visibility= View.INVISIBLE
                        closegriplatpulldown.visibility= View.INVISIBLE
                        pullup.visibility= View.INVISIBLE
                        backextansion.visibility= View.INVISIBLE
                        true
                    }
                    R.id.dumbbelrow ->{
                        hareketismi.text = "Dumbbel Row"
                        latpulldown.visibility= View.INVISIBLE
                        seatedrow.visibility= View.INVISIBLE
                        dumbbellrow.visibility= View.VISIBLE
                        bentoverbarbellrow.visibility= View.INVISIBLE
                        closegriplatpulldown.visibility= View.INVISIBLE
                        pullup.visibility= View.INVISIBLE
                        backextansion.visibility= View.INVISIBLE
                        true
                    }
                    R.id.bentoverbarbellrow ->{
                        hareketismi.text = "Bent Over Barbell Row"
                        latpulldown.visibility= View.INVISIBLE
                        seatedrow.visibility= View.INVISIBLE
                        dumbbellrow.visibility= View.INVISIBLE
                        bentoverbarbellrow.visibility= View.VISIBLE
                        closegriplatpulldown.visibility= View.INVISIBLE
                        pullup.visibility= View.INVISIBLE
                        backextansion.visibility= View.INVISIBLE
                        true
                    }
                    R.id.closegriplatpulldown ->{
                        hareketismi.text = "Close Grip Lat Pull Down"
                        latpulldown.visibility= View.INVISIBLE
                        seatedrow.visibility= View.INVISIBLE
                        dumbbellrow.visibility= View.INVISIBLE
                        bentoverbarbellrow.visibility= View.INVISIBLE
                        closegriplatpulldown.visibility= View.VISIBLE
                        pullup.visibility= View.INVISIBLE
                        backextansion.visibility= View.INVISIBLE
                        true
                    }
                    R.id.pullup ->{
                        hareketismi.text = "Pull Up"
                        latpulldown.visibility= View.INVISIBLE
                        seatedrow.visibility= View.INVISIBLE
                        dumbbellrow.visibility= View.INVISIBLE
                        bentoverbarbellrow.visibility= View.INVISIBLE
                        closegriplatpulldown.visibility= View.INVISIBLE
                        pullup.visibility= View.VISIBLE
                        backextansion.visibility= View.INVISIBLE
                        true
                    }
                    R.id.backextension ->{
                        hareketismi.text = "Back Extension"
                        latpulldown.visibility= View.INVISIBLE
                        seatedrow.visibility= View.INVISIBLE
                        dumbbellrow.visibility= View.INVISIBLE
                        bentoverbarbellrow.visibility= View.INVISIBLE
                        closegriplatpulldown.visibility= View.INVISIBLE
                        pullup.visibility= View.INVISIBLE
                        backextansion.visibility= View.VISIBLE
                        true
                    }



                    else -> false
                }
            }
            acilirmenu.show()
        }

    }
}