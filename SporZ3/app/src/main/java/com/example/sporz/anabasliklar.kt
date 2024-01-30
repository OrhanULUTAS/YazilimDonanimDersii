package com.example.sporz

import android.content.Intent
import android.media.ImageWriter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView

class anabasliklar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anabasliklar)
        var button = findViewById<Button>(R.id.button)
        var text = findViewById<TextView>(R.id.textView)
        var resim = findViewById<ImageView>(R.id.resim)
        object : CountDownTimer(100000,500){
            override fun onTick(p0: Long) {
                var a=p0.toInt()
                a=a/100
                if (a % 2 == 0){
                    text.visibility= View.VISIBLE
                    resim.visibility= View.VISIBLE
                }
                else{
                    text.visibility= View.INVISIBLE
                    resim.visibility= View.INVISIBLE
                }

            }

            override fun onFinish() {
                text.visibility= View.VISIBLE
                resim.visibility= View.VISIBLE

            }

        }.start()
        button.setOnClickListener{
            var acilirmenu = PopupMenu(this,button)
            acilirmenu.menuInflater.inflate(R.menu.popupmenu,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.vucutkitleindeksi ->{
                        val gecis=Intent(applicationContext,vucutkitleindeksi::class.java)
                        startActivity(gecis)
                        true
                    }
                    R.id.gunlukalinmasigerekenkalori ->{
                        val gecis=Intent(applicationContext,gunlukalinmasigerekenkalori::class.java)
                        startActivity(gecis)
                        true
                    }
                    R.id.harcanılankalori -> {
                        val gecis =
                            Intent(applicationContext, gunlukharcanilankalori::class.java)
                        startActivity(gecis)
                        true
                    }
                    R.id.besinkalorisi -> {
                        val gecis =
                            Intent(applicationContext, hangibesinkackalori::class.java)
                        startActivity(gecis)
                        true
                    }
                    R.id.sporhareketleri ->{
                        val gecis=Intent(applicationContext,sporhareketleri::class.java)
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
