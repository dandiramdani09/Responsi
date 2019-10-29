package com.example.responsi5170411365;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    // kuranglebih seperti yang sebelumnya namun terdapat perbedaan dengan yang sebelumnya yaitu untuk mengisi data pada database, sekarang untuk mengambil data
    EditText edtUsername, edtPassword;
    Button buttonLogin,buttonRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.editUsername);
        edtPassword = findViewById(R.id.editPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegister = findViewById(R.id.buttonRegister);


        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();


                if(username.equals("") || username.trim().isEmpty() || password.equals("") || password.trim().isEmpty() ) {
                    Toast.makeText(LoginActivity.this,"Username Password harus diisi",Toast.LENGTH_LONG).show();
                }
                else
                {

                        Intent mIntent = new Intent(getApplicationContext(),
                                MainActivity.class);
//                        memberikan extra data username
                        mIntent.putExtra("username",username);
//                        berpindah activity
                        startActivity(mIntent);
                    }


                    }


        });


        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}