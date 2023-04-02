package lt.arturas.homework_03_28

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val TAG = "kotlin_variables_tag"
    lateinit var my_name_text: EditText
    lateinit var my_fuel_price: EditText
    lateinit var my_number_of_letters: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //onclick listener function
        on_click_listener_event()


    }
    fun homework_name_word_count(name:String){
        val nameCount: Int = name.length
        my_number_of_letters.setText("The name contains $nameCount symbols")
        Log.i(TAG, "homework_nameWordCount: $nameCount")

    }

    fun on_click_listener_event(){
        my_name_text = findViewById(R.id.nameEditText)
        my_fuel_price = findViewById(R.id.fuelPriceEditText)
        my_number_of_letters = findViewById(R.id.numberOfLettersTextView)

        val okButton: Button = findViewById(R.id.okButton)

        okButton.setOnClickListener {
            val message: String = my_name_text.text.toString()
            Log.i(TAG, "onCreate: Name: $message")
            homework_name_word_count(message)
        }
    }
}