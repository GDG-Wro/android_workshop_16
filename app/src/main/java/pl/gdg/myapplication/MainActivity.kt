package pl.gdg.myapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    fun onGoClick(view: View) {
        findViewById<TextView>(R.id.label).text = "Going!"
    }
}