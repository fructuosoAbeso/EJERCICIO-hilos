package es.ua.eps.ejemplohilos

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CoroutineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temporizador)

        val tvCrono = findViewById<TextView>(R.id.tvCrono)
        var t = 10

        lifecycleScope.launch {
            while (t > 0) {
                tvCrono.text = "Contador: $t"
                delay(1000)
                t--
            }
            tvCrono.text = "Contador terminado"
        }
    }
}
