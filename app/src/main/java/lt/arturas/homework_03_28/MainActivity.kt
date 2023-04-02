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
    lateinit var my_sum_positive_viewer: TextView
    lateinit var my_first_letter_viewer: TextView
    lateinit var my_result_of_substraction: TextView
    lateinit var my_still_positive: TextView
    lateinit var my_id_of__: TextView

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

    fun sum_fun(price:Int, price2: Float): Float{
        val sum : Float = price.toFloat() + price2
        my_sum_Viewer.setText("Sum of symbols and fuel price is $sum ")
        Log.i(TAG, "sum_fun: $sum ")
        return sum
    }

    fun if_positive_fun(value: Float){
        val arRezultatasTeigiamas  = (value >= 0)
        my_sum_positive_viewer.setText("Is sum positive? $arRezultatasTeigiamas")
        Log.i(TAG, "sum_fun: $arRezultatasTeigiamas ")
    }

    fun rest_of_tasks(name: String, vardoRaidziuSkaicius: Int){

        val vardoPirmojiRaide = name[0]
        my_first_letter_viewer.setText("First letter of the name is '$vardoPirmojiRaide' ")
        val result_of_sub = vardoRaidziuSkaicius - vardoPirmojiRaide.code.toInt()   ///uzduotis?
        my_result_of_substraction.setText("Result of subtraction $result_of_sub")
        val is_positive = result_of_sub >= 0
        my_still_positive.setText("Is sum still positive? $is_positive")
        val id_first_letter = vardoPirmojiRaide.code.toInt()
        my_id_of__.setText("The id of '$vardoPirmojiRaide' letter is $id_first_letter ")

        Log.i(TAG, "vardoPirmojiRaide: $vardoPirmojiRaide")
        Log.i(TAG, "result_of_sub: $result_of_sub")
        Log.i(TAG, "is_positive: $is_positive")
        Log.i(TAG, "id_first_letter: $id_first_letter")
    }

    fun on_click_listener_event(){
        my_name_text = findViewById(R.id.nameEditText)
        my_fuel_price = findViewById(R.id.fuelPriceEditText)
        my_number_of_letters = findViewById(R.id.numberOfLettersTextView)
        my_fuel_price_Viewer = findViewById(R.id.fuelPriceTextView)
        my_sum_Viewer = findViewById(R.id.sumTextView)
        my_sum_positive_viewer = findViewById(R.id.isSumPositiveTextView)
        my_first_letter_viewer = findViewById(R.id.firstLetterTextView)
        my_result_of_substraction = findViewById(R.id.subtractTextView)
        my_still_positive = findViewById(R.id.isStillPositiveTextView)
        my_id_of__ = findViewById(R.id.letterIdPositiveTextView)

        val okButton: Button = findViewById(R.id.okButton)

        okButton.setOnClickListener {
            val message: String = my_name_text.text.toString()
            val kuroKaina : Float = my_fuel_price.text.toString().toFloat()
            Log.i(TAG, "onCreate: Name: $message")
            val vardoRaidziuSkaicius  = homework_name_word_count(message)
            fuel_pricing(kuroKaina )
            val rezultatas = sum_fun(vardoRaidziuSkaicius , kuroKaina )
            if_positive_fun(rezultatas)
            rest_of_tasks(message, vardoRaidziuSkaicius)

        }
    }
}