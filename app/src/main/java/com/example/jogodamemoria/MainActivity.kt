package com.example.jogodamemoria
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
class MainActivity : AppCompatActivity() { //herança de appcompactive no caso torna uma tela


    private lateinit var card1 : ImageView //lateinit atras a inicialização da variavel
    private lateinit var card2 : ImageView
    private lateinit var card3 : ImageView
    private lateinit var card4 : ImageView
    private lateinit var card5 : ImageView
    private lateinit var card6 : ImageView
    private lateinit var card7 : ImageView
    private lateinit var card8 : ImageView
    private lateinit var card9 : ImageView
    private lateinit var card10 : ImageView
    private lateinit var card11 : ImageView
    private lateinit var card12 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) { //oncreate, uma tela
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear)//setando a qual tela deve ser exibida
        //componentes() //chamando função
    }
    override fun onResume() {//apos o aplicativo executar
        super.onResume()
        componentes()
        gerenciadordeclicks()
        //card1.setOnClickListener {//ouvinte de evento
           // card1.setImageResource(R.drawable.candy)
        }
    private fun gerenciadordeclicks() {
        val listaDeImageView = listOf(card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12)
        val percImagens = arrayListOf("candy","castle","frank","frank","mummy","mummy","castle","frank","pumpkin","cauldron","cauldron","pumpkin","cauldron")
        var contactor = 0
        for (imagensViews in listaDeImageView){
            imagensViews.setOnClickListener {
                when(percImagens[contactor]){
                    "frank" -> imagensViews.setImageResource(R.drawable.frank)
                    "castle" -> imagensViews.setImageResource(R.drawable.castle)
                    "candy" -> imagensViews.setImageResource(R.drawable.candy)
                    "mummy" -> imagensViews.setImageResource(R.drawable.mummy)
                    "cauldron" -> imagensViews.setImageResource(R.drawable.cauldron)
                    "pumpkin" -> imagensViews.setImageResource(R.drawable.pumpkin)
                }
                contactor++
            }
    }
    }

    private fun componentes(){
        card1 = findViewById(R.id.image1)
        card2 = findViewById(R.id.image2)
        card3 = findViewById(R.id.image3)
        card4 = findViewById(R.id.image4)
        card5 = findViewById(R.id.image5)
        card6 = findViewById(R.id.image6)
        card7 = findViewById(R.id.image7)
        card8 = findViewById(R.id.image8)
        card9 = findViewById(R.id.image9)
        card10 = findViewById(R.id.image10)
        card11 = findViewById(R.id.image11)
        card12 = findViewById(R.id.image12)

    }

}