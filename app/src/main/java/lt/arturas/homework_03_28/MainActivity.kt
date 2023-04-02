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
    lateinit var my_fuel_price_Viewer: TextView
    lateinit var my_sum_Viewer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //onclick listener function
        on_click_listener_event()


    }
    fun homework_name_word_count(name:String): Int {
        val nameCount: Int = name.length
        my_number_of_letters.setText("The name contains $nameCount symbols")
        Log.i(TAG, "homework_nameWordCount: $nameCount")
        return nameCount
    }

    fun fuel_pricing(price:Float){
        my_fuel_price_Viewer.setText("Fuel price is $price Eur")
        Log.i(TAG, "fuel_pricing: $price")
    }

    fun sum_fun(price:Int, price2: Float){
        val sum: Float = price.toFloat() + price2
        my_sum_Viewer.setText("Sum of symbols and fuel price is $sum")
        Log.i(TAG, "sum_fun: $sum")
    }

    fun on_click_listener_event(){
        my_name_text = findViewById(R.id.nameEditText)
        my_fuel_price = findViewById(R.id.fuelPriceEditText)
        my_number_of_letters = findViewById(R.id.numberOfLettersTextView)
        my_fuel_price_Viewer = findViewById(R.id.fuelPriceTextView)
        my_sum_Viewer = findViewById(R.id.sumTextView)

        val okButton: Button = findViewById(R.id.okButton)

        okButton.setOnClickListener {
            val message: String = my_name_text.text.toString()
            val message2: Float = my_fuel_price.text.toString().toFloat()
            Log.i(TAG, "onCreate: Name: $message")
            val name_word_count = homework_name_word_count(message)
            fuel_pricing(message2)
            sum_fun(name_word_count, message2)
        }
    }
}