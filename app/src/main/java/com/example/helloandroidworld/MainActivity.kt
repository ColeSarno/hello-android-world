package com.example.helloandroidworld
/* Name: Cole Sarno
 * Class: CMSY-168-N090 Mobile Design
 *  Description: Your First Git Repository
 *  Date: 10/27/2020
 */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Here is where I began editing the file
        //Creates a references to the EditText, TextView and Button that are in the layout XML
        //NewText references the EditText with an id of editText
        val NewText : EditText = findViewById(R.id.editText)
        //OldText references the TextView with an id of textView
        val OldText : TextView = findViewById(R.id.textView)
        //submit_btn references the Button with the id of button
        val submit_btn : Button = findViewById(R.id.button)

        //When the submit_btn is clicked, the following statement will execute
        submit_btn.setOnClickListener {
            //Sets the TextView OldText to display the name entered in the EditText
            OldText.setText("Hello, " + NewText.getText() + "!")
        }

    }

}