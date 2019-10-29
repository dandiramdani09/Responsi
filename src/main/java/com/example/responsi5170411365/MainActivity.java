package com.example.responsi5170411365;

import android.content.Intent;
import android.support.v4.app.INotificationSideChannel;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //membuat variable untuk menyimpan komponen TextView
    TextView txtHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mengambil komponen dari layout dengan id txtHello
        txtHello = findViewById(R.id.txtHello);


        Intent i = getIntent();


        String username = i.getStringExtra("username");


        txtHello.setText("Hello ,"+username);
    }
}