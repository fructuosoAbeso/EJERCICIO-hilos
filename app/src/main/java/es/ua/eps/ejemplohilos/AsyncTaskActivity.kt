package es.ua.eps.ejemplohilos

import android.os.AsyncTask
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AsyncTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temporizador)

        val tvCrono = findViewById<TextView>(R.id.tvCrono)
        ContadorTask(tvCrono).execute(10)
    }

    private class ContadorTask(val tvCrono: TextView) : AsyncTask<Int, Int, Unit>() {
        override fun doInBackground(vararg params: Int?): Unit {
            var t = params[0] ?: 10
            while (t > 0) {
                publishProgress(t)
                Thread.sleep(1000)
                t--
            }
        }

        override fun onProgressUpdate(vararg values: Int?) {
            tvCrono.text = "Contador: ${values[0]}"
        }

        override fun onPostExecute(result: Unit?) {
            tvCrono.text = "Contador terminado"
        }
    }
}
