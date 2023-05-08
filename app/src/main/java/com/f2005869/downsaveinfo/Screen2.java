package com.f2005869.downsaveinfo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

public class Screen2 extends AppCompatActivity {

    //string to receive the message
    String receivedMessage;

    //variable to connect in receivedMessageXML in layout
    TextView showMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        showMessage = findViewById(R.id.receivedMessageXML);

        //recovery the message
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        String receivedMessage = (String) bd.get("sentMessage");

        //show message in screen
        showMessage.setText(receivedMessage);
    }
}