package com.example.application

import android.annotation.SuppressLint
import android.opengl.Visibility
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class futbol : AppCompatActivity(), View.OnClickListener {
    lateinit var btnronaldo: Button
    lateinit var btnmessi: Button
    lateinit var btnbekham: Button
    lateinit var back: ImageView
    lateinit var nextimage: ImageView
    lateinit var progresbar: ProgressBar
    lateinit var textname: TextView
    lateinit var ronaldo: ImageView


    val ronaldoimages = arrayOf(R.drawable.icronaldo1, R.drawable.icronaldo2, R.drawable.icronaldo3)
    val messiimages = arrayOf(R.drawable.icmessi1, R.drawable.icmessi2, R.drawable.icmessi3)
    val bakhamimages = arrayOf(R.drawable.icbekham1, R.drawable.icbekham2, R.drawable.icbekham3)

    var userId = 1
    var imagePosition = 0

    @SuppressLint("MissinginflateId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.futbol)

        btnronaldo = findViewById(R.id.btnronaldo)
        btnmessi = findViewById(R.id.btnmessi)
        btnbekham = findViewById(R.id.btnbekham)
        back = findViewById(R.id.back)
        nextimage = findViewById(R.id.nextimage)
        progresbar = findViewById(R.id.progresbar)
        textname = findViewById(R.id.textname)
        ronaldo = findViewById(R.id.ronaldo)

        btnronaldo.setOnClickListener(this)
        btnmessi.setOnClickListener(this)
        btnbekham.setOnClickListener(this)
        nextimage.setOnClickListener(this)
        back.setOnClickListener(this)


    }

    override fun onClick(v: View?) {

        when (v) {

            btnronaldo -> {
                userId = 1
                imagePosition = 0
                progresbar.visibility = View.VISIBLE
                checkVisibility()
                Thread {
                    Thread.sleep(1000)
                    runOnUiThread {
                        ronaldo.setImageResource(R.drawable.icronaldo1)
                        textname.text = "Ronaldo"
                        progresbar.visibility = View.INVISIBLE
                    }
                }.start()
            }

            btnmessi -> {
                userId = 2
                imagePosition = 0
                progresbar.visibility = View.VISIBLE
                checkVisibility()
                Thread {
                    Thread.sleep(1000)
                    runOnUiThread {

                        ronaldo.setImageResource(R.drawable.icmessi1)
                        textname.text = "Messi"
                        progresbar.visibility = View.INVISIBLE
                    }


                }.start()

            }

            btnbekham -> {

                userId = 3
                imagePosition = 0
                progresbar.visibility = View.VISIBLE
                checkVisibility()
                Thread {
                    Thread.sleep(1000)
                    runOnUiThread {

                        ronaldo.setImageResource(R.drawable.icbekham1)
                        textname.text = "Bekham"
                        progresbar.visibility = View.INVISIBLE
                    }

                }.start()


            }

            nextimage -> {
                if (imagePosition != 2) imagePosition++
                selectImage()
            }

            back -> {

                if (imagePosition != 0) imagePosition--
                selectImage()
            }


        }

    }

    private fun checkVisibility() {

        when (imagePosition) {

            0 -> {

                back.visibility = View.INVISIBLE
                nextimage.visibility = View.VISIBLE

            }

            1 -> {

                back.visibility = View.VISIBLE
                nextimage.visibility = View.VISIBLE
            }

            2 -> {

                back.visibility = View.VISIBLE
                nextimage.visibility = View.INVISIBLE
            }
        }
    }

    private fun selectImage() {

        checkVisibility()
        when (userId) {

            1 -> ronaldo.setImageResource(ronaldoimages[imagePosition])
            2 -> ronaldo.setImageResource(messiimages[imagePosition])
            3 -> ronaldo.setImageResource(bakhamimages[imagePosition])
        }
    }
}






