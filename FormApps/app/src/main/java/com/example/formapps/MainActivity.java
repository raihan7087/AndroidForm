package com.example.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (EditText) findViewById(R.id_input_name);
        EditText inputEmail = (EditText) findViewById(R.id_input_email);
        EditText inputPhone = (EditText) findViewById(R.id_input_phone);
        EditText inputPassword = (EditText) findViewById(R.id_input_password);

        Button btnSave = (Button) findViewById(R.id.in_button_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("--Nama--", inputName.getText().toString());
                Log.d("--Email--", inputEmail.getText().toString());
                Log.d("--Phone--", inputPhone.getText().toString());
                Log.d("--Password--", inputPassword.getText().toString());
            }
        });

    }
}