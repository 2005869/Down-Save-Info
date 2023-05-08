package com.f2005869.downsaveinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Receive an input for the user
    private EditText insertedMessage;

    //message to send
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect variable insertMessage with EditText in xml
        insertedMessage = findViewById(R.id.editTextXML);
    }

    //method to send message to next screen
    public void nextScreen(View v){
        //attr insertMessage to message and convert to string
        message = insertedMessage.getText().toString();

        //create an Intent to send message to next screen
        Intent myIntent = new Intent(this, Screen2.class);

        //use method putExtra to send the message
        myIntent.putExtra(name="sentMessage", message);

        //open next screen
        startActivity(myIntent);
    }
}