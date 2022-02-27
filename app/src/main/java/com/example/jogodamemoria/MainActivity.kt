package com.example.jogodamemoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var card1 : ImageView? = null
    var card2 : ImageView? = null
    var card3 : ImageView? = null
    var card4 : ImageView? = null
    var card5 : ImageView? = null
    var card6 : ImageView? = null
    var card7 : ImageView? = null
    var card8 : ImageView? = null
    var card9 : ImageView? = null
    var card10 : ImageView? = null
    var card11 : ImageView? = null
    var card12 : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        componentes()
    }
    fun componentes(){
        card1 = findViewById(R.id.image1)
        card2 = findViewById(R.id.image2)
        card3 = findViewById(R.id.image3)
        card4 = findViewById(R.id.image4)
        card5 = findViewById(R.id.image5)
        card6 = findViewById(R.id.image6)
        card7 = findViewById(R.id.image7)
        card8 = findViewById(R.id.image8)



    }
}