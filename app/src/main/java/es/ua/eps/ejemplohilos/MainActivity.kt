package es.ua.eps.ejemplohilos

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnThread = findViewById<Button>(R.id.btnThread)
        val btnAsyncTask = findViewById<Button>(R.id.btnAsyncTask)
        val btnCoroutine = findViewById<Button>(R.id.btnCoroutine)

        btnThread.setOnClickListener {
            startActivity(Intent(this, ThreadActivity::class.java))
        }

        btnAsyncTask.setOnClickListener {
            startActivity(Intent(this, AsyncTaskActivity::class.java))
        }

        btnCoroutine.setOnClickListener {
            startActivity(Intent(this, CoroutineActivity::class.java))
        }
    }
}
