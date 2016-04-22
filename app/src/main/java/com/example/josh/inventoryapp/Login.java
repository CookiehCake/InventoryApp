package com.example.josh.inventoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //button to login
        Button LoginButton;
        LoginButton = (Button) findViewById(R.id.loginButton);
        LoginButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //need to implement login verification here, placeholder code
                startActivity(new Intent(Login.this, Overview.class));
            }
        });

        //button to for forgot email
        Button ForgotEmailButton;
        ForgotEmailButton = (Button) findViewById(R.id.passwordButton);
        ForgotEmailButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //forgot email activity
            }
        });


    }
}
