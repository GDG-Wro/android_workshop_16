package pl.gdg.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    fun onGoClick(view: View) {
        findViewById<TextView>(R.id.label).text = "Going!"
    }
}