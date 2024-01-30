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

class gogusbolgesi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gogusbolgesi)
        var button = findViewById<Button>(R.id.button)
        var benchpres= findViewById<GifImageView>(R.id.benchpress)
        var dumbelbenchpres = findViewById<GifImageView>(R.id.dumbelbenchpres)
        var declinedumbelpress = findViewById<GifImageView>(R.id.declinedumbelpress)
        var pushup = findViewById<GifImageView>(R.id.pushup)
        var inclinedumbelpress = findViewById<GifImageView>(R.id.inclinedumbelpres)
        var chestpresmachine = findViewById<GifImageView>(R.id.chestpresmachine)
        var cablefly = findViewById<GifImageView>(R.id.cablefly)
        var hareketismi = findViewById<TextView>(R.id.textView5)
        var home = findViewById<ImageView>(R.id.home)

        benchpres.visibility= View.INVISIBLE
        dumbelbenchpres.visibility= View.INVISIBLE
        declinedumbelpress.visibility= View.INVISIBLE
        pushup.visibility= View.INVISIBLE
        inclinedumbelpress.visibility= View.INVISIBLE
        chestpresmachine.visibility= View.INVISIBLE
        cablefly.visibility= View.INVISIBLE


        home.setOnClickListener {
            var gecis = Intent(this, anabasliklar::class.java)
            startActivity(gecis)
            finish()
        }




        button.setOnClickListener{
            var acilirmenu = PopupMenu(this,button)
            acilirmenu.menuInflater.inflate(R.menu.gogushareketleri,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.barbellbechpress ->{
                        hareketismi.text = "Barbel Bench Press"
                        dumbelbenchpres.visibility= View.INVISIBLE
                        declinedumbelpress.visibility= View.INVISIBLE
                        pushup.visibility= View.INVISIBLE
                        inclinedumbelpress.visibility= View.INVISIBLE
                        chestpresmachine.visibility= View.INVISIBLE
                        cablefly.visibility= View.INVISIBLE
                        benchpres.visibility= View.VISIBLE

                        true
                    }
                    R.id.dumbelbenchpres ->{
                        hareketismi.text = "Dumbel Bench Press"
                        benchpres.visibility= View.INVISIBLE
                        declinedumbelpress.visibility= View.INVISIBLE
                        pushup.visibility= View.INVISIBLE
                        inclinedumbelpress.visibility= View.INVISIBLE
                        chestpresmachine.visibility= View.INVISIBLE
                        cablefly.visibility= View.INVISIBLE
                        dumbelbenchpres.visibility= View.VISIBLE
                        true
                    }
                    R.id.declinedumbelpress ->{
                    hareketismi.text = "Decline Dumbell Press"
                        benchpres.visibility= View.INVISIBLE
                        dumbelbenchpres.visibility= View.INVISIBLE
                        pushup.visibility= View.INVISIBLE
                        inclinedumbelpress.visibility= View.INVISIBLE
                        chestpresmachine.visibility= View.INVISIBLE
                        cablefly.visibility= View.INVISIBLE
                        declinedumbelpress.visibility= View.VISIBLE
                    true
                }
                    R.id.pushup ->{
                        hareketismi.text = "Push Up"
                        benchpres.visibility= View.INVISIBLE
                        dumbelbenchpres.visibility= View.INVISIBLE
                        declinedumbelpress.visibility= View.INVISIBLE
                        inclinedumbelpress.visibility= View.INVISIBLE
                        chestpresmachine.visibility= View.INVISIBLE
                        cablefly.visibility= View.INVISIBLE
                        pushup.visibility= View.VISIBLE
                        true
                    }
                    R.id.inclinedumbelpres ->{
                        hareketismi.text = "İncline Dumbell Press"
                        benchpres.visibility= View.INVISIBLE
                        dumbelbenchpres.visibility= View.INVISIBLE
                        declinedumbelpress.visibility= View.INVISIBLE
                        pushup.visibility= View.INVISIBLE
                        chestpresmachine.visibility= View.INVISIBLE
                        cablefly.visibility= View.INVISIBLE
                        inclinedumbelpress.visibility= View.VISIBLE
                        true
                    }
                    R.id.chestpresmachine ->{
                        hareketismi.text = "Chest Press Machine"
                        benchpres.visibility= View.INVISIBLE
                        dumbelbenchpres.visibility= View.INVISIBLE
                        declinedumbelpress.visibility= View.INVISIBLE
                        pushup.visibility= View.INVISIBLE
                        inclinedumbelpress.visibility= View.INVISIBLE
                        cablefly.visibility= View.INVISIBLE
                        chestpresmachine.visibility= View.VISIBLE
                        true
                    }
                    R.id.cablefly ->{
                        hareketismi.text = "Cable Fly"
                        benchpres.visibility= View.INVISIBLE
                        dumbelbenchpres.visibility= View.INVISIBLE
                        declinedumbelpress.visibility= View.INVISIBLE
                        pushup.visibility= View.INVISIBLE
                        inclinedumbelpress.visibility= View.INVISIBLE
                        chestpresmachine.visibility= View.INVISIBLE
                        cablefly.visibility= View.VISIBLE
                        true
                    }



                    else -> false
                }
            }
            acilirmenu.show()
        }
    }
}