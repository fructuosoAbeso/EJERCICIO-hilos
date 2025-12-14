package es.ua.eps.ejemplohilos

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temporizador)

        val tvCrono = findViewById<TextView>(R.id.tvCrono)
        var t = 10

        Thread {
            while (t > 0) {
                runOnUiThread {
                    tvCrono.text = "Contador: $t"
                }
                Thread.sleep(1000)
                t--
            }
            runOnUiThread {
                tvCrono.text = "Contador terminado"
            }
        }.start()
    }
}
