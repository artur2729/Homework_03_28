package lt.arturas.homework_03_28

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val TAG = "kotlin_variables_tag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val name = "Arturas"
        homework_nameWordCount(name)

        //get info for onClickListener
        val message = intent.getStringExtra("message_key")
        val myNameView: TextView = findViewById(R.id.nameEditText)
        val myFuelPriceView: TextView = findViewById(R.id.fuelPriceEditText)

        val okButton: Button = findViewById(R.id.okButton)

    }
    fun homework_nameWordCount(name:String){
        val nameCount: Int = name.length
        Log.i(TAG, "homework_nameWordCount: $nameCount")
    }
}