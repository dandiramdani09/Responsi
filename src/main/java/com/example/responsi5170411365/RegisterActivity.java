package com.example.responsi5170411365;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {


    //membuat variable EditText
    EditText edtUsername, edtEmail, edtPassword, edtConfirmPassword;
    //membuat variable Button
    Button buttonRegister;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


//        mengambil komponen view yang ada pada res/layout
        edtUsername = findViewById(R.id.editUsername);
        edtEmail = findViewById(R.id.editEmail);
        edtPassword = findViewById(R.id.editPassword);
        edtConfirmPassword = findViewById(R.id.editConfirmPassword);
        buttonRegister = findViewById(R.id.buttonRegister);



// memberikan perintah onclicklistener pada button register
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                mengambil inputan yang telah diinputkan
                String username = edtUsername.getText().toString();
                String email = edtEmail.getText().toString();
                String password = edtPassword.getText().toString();
                String confirmpassword = edtConfirmPassword.getText().toString();

// validasi jika tidak kosong dan bukan space
                if(username.equals("") || username.trim().isEmpty() || email.equals("") || email.trim().isEmpty() || password.equals("") || password.trim().isEmpty() ) {
                    Toast.makeText(RegisterActivity.this,"Username Password harus diisi",Toast.LENGTH_LONG).show();
                }

// validasi jika email bukan format email
                else if(!(email.contains("@")))
                {
                    Toast.makeText(RegisterActivity.this, "Masukkan format email dengan benar", Toast.LENGTH_LONG).show();
                }
// validasi jika password tidak sama dengan confirm password
                else if(!password.equals(confirmpassword)){
                    Toast.makeText(RegisterActivity.this, "Confirm Password tidak sama", Toast.LENGTH_LONG).show();
                }else
                {

                    Toast.makeText(RegisterActivity.this,"Register berhasil",Toast.LENGTH_LONG).show();

// menutup activity
                    finish();
                }
            }
        });
    }
    //script halaman selanjutnya
}
