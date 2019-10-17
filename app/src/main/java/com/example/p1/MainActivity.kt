package com.example.p1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

// : = extends
class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView = Create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO : QWER
        //Java int x; vs Kotlin var x : Int
        //val = value and var = variable
        //findViewBiID = link UI to code
        val buttonDontClickMe : Button = findViewById(R.id.buttonDontClikcMe)
        buttonDontClickMe.setOnClickListener{ showMessage() }

    }
    private fun showMessage(){
        textViewMessage.setText(getString(R.string.warning_message))
    }
}
