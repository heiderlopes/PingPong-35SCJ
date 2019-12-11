package br.com.heider.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.heider.pingpong.extensions.value
import kotlinx.android.synthetic.main.activity_player.*

class PlayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)


        btStart.setOnClickListener {botao ->
            startGame()
        }
    }

    private fun startGame() {
        val nextScreen =
            Intent(this, MainActivity::class.java)

        nextScreen.putExtra("HOME_NAME", etHome.value())
        nextScreen.putExtra("AWAY_NAME", etAway.value())

        startActivity(nextScreen)
        finish()
    }
}
