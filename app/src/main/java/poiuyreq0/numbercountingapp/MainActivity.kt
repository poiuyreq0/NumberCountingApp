package poiuyreq0.numbercountingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import poiuyreq0.numbercountingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val numberTextView = binding.numberTextView
        val resetButton = binding.resetButton
        val plusButton = binding.plusButton

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

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("number", number)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        number = savedInstanceState.getInt("number")
        binding.numberTextView.text = number.toString()
        super.onRestoreInstanceState(savedInstanceState)
    }
}