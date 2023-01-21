package poiuyreq0.numbercountingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val plusButton = findViewById<Button>(R.id.plusButton)

        var number: Int = 0

        resetButton.setOnClickListener {
            number = 0
            numberTextView.text = number.toString()
            Log.i("onClick", "reset number = $number")
        }

        plusButton.setOnClickListener {
            number++
            numberTextView.text = number.toString()
            Log.i("onClick", "plus number = $number")
        }
    }
}