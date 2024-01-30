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

class omuzbolgesi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_omuzbolgesi)
        var button = findViewById<Button>(R.id.button)
        var hareketismi = findViewById<TextView>(R.id.textView5)
        var home = findViewById<ImageView>(R.id.home)
        var overheadpress= findViewById<GifImageView>(R.id.overheadpress)
        var dumbbellshoulderpress= findViewById<GifImageView>(R.id.dumbbellshoulderpress)
        var dumbbelllateralraise= findViewById<GifImageView>(R.id.dumbbelllateralraise)
        var bentoverlateralraise= findViewById<GifImageView>(R.id.bentoverlateralraise)
        var barbelluprightrow= findViewById<GifImageView>(R.id.barbelluprightrow)
        var dumbbellfrontraise= findViewById<GifImageView>(R.id.dumbellfrontraises)
        var barbelfrontraise= findViewById<GifImageView>(R.id.barbellfrontraises)

        overheadpress.visibility= View.INVISIBLE
        dumbbellshoulderpress.visibility= View.INVISIBLE
        dumbbelllateralraise.visibility= View.INVISIBLE
        bentoverlateralraise.visibility= View.INVISIBLE
        barbelluprightrow.visibility= View.INVISIBLE
        dumbbellfrontraise.visibility= View.INVISIBLE
        barbelfrontraise.visibility= View.INVISIBLE



        home.setOnClickListener {
            var gecis = Intent(this, anabasliklar::class.java)
            startActivity(gecis)
            finish()
        }
        button.setOnClickListener{
            var acilirmenu = PopupMenu(this,button)
            acilirmenu.menuInflater.inflate(R.menu.omuzbolgesi,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.overheadpress ->{
                        hareketismi.text = "Overhead Press"
                        overheadpress.visibility= View.VISIBLE
                        dumbbellshoulderpress.visibility= View.INVISIBLE
                        dumbbelllateralraise.visibility= View.INVISIBLE
                        bentoverlateralraise.visibility= View.INVISIBLE
                        barbelluprightrow.visibility= View.INVISIBLE
                        dumbbellfrontraise.visibility= View.INVISIBLE
                        barbelfrontraise.visibility= View.INVISIBLE


                        true
                    }
                    R.id.dumbbellshoulderpress ->{
                        hareketismi.text = "Dumbell Shoulder Press"
                        overheadpress.visibility= View.INVISIBLE
                        dumbbellshoulderpress.visibility= View.VISIBLE
                        dumbbelllateralraise.visibility= View.INVISIBLE
                        bentoverlateralraise.visibility= View.INVISIBLE
                        barbelluprightrow.visibility= View.INVISIBLE
                        dumbbellfrontraise.visibility= View.INVISIBLE
                        barbelfrontraise.visibility= View.INVISIBLE


                        true
                    }
                    R.id.dumbbelllateralraise ->{
                        hareketismi.text = "Dumbbell Lateral Raise"
                        overheadpress.visibility= View.INVISIBLE
                        dumbbellshoulderpress.visibility= View.INVISIBLE
                        dumbbelllateralraise.visibility= View.VISIBLE
                        bentoverlateralraise.visibility= View.INVISIBLE
                        barbelluprightrow.visibility= View.INVISIBLE
                        dumbbellfrontraise.visibility= View.INVISIBLE
                        barbelfrontraise.visibility= View.INVISIBLE


                        true
                    }
                    R.id.bentoverlateralraise ->{
                        hareketismi.text = "Bent-Over Lateral Raise"
                        overheadpress.visibility= View.INVISIBLE
                        dumbbellshoulderpress.visibility= View.INVISIBLE
                        dumbbelllateralraise.visibility= View.INVISIBLE
                        bentoverlateralraise.visibility= View.VISIBLE
                        barbelluprightrow.visibility= View.INVISIBLE
                        dumbbellfrontraise.visibility= View.INVISIBLE
                        barbelfrontraise.visibility= View.INVISIBLE


                        true
                    }
                    R.id.barbelluprightrow ->{
                        hareketismi.text = "Barbell Upright Row"
                        overheadpress.visibility= View.INVISIBLE
                        dumbbellshoulderpress.visibility= View.INVISIBLE
                        dumbbelllateralraise.visibility= View.INVISIBLE
                        bentoverlateralraise.visibility= View.INVISIBLE
                        barbelluprightrow.visibility= View.VISIBLE
                        dumbbellfrontraise.visibility= View.INVISIBLE
                        barbelfrontraise.visibility= View.INVISIBLE


                        true
                    }
                    R.id.dumbellfrontraises ->{
                        hareketismi.text = "Dumbell Front Raise"
                        overheadpress.visibility= View.INVISIBLE
                        dumbbellshoulderpress.visibility= View.INVISIBLE
                        dumbbelllateralraise.visibility= View.INVISIBLE
                        bentoverlateralraise.visibility= View.INVISIBLE
                        barbelluprightrow.visibility= View.INVISIBLE
                        dumbbellfrontraise.visibility= View.VISIBLE
                        barbelfrontraise.visibility= View.INVISIBLE


                        true
                    }
                    R.id.barbellfrontraises ->{
                        hareketismi.text = "Barbell Front Raise"
                        overheadpress.visibility= View.INVISIBLE
                        dumbbellshoulderpress.visibility= View.INVISIBLE
                        dumbbelllateralraise.visibility= View.INVISIBLE
                        bentoverlateralraise.visibility= View.INVISIBLE
                        barbelluprightrow.visibility= View.INVISIBLE
                        dumbbellfrontraise.visibility= View.INVISIBLE
                        barbelfrontraise.visibility= View.VISIBLE


                        true
                    }



                    else -> false
                }
            }
            acilirmenu.show()
        }
    }
}