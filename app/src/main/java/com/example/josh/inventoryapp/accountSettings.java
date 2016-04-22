package com.example.josh.inventoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;


public class accountSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);

        //email changing button
        Button Change_Email;
        Change_Email = (Button) findViewById(R.id.emailButton);
        Change_Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(accountSettings.this, changeEmail.class));
            }
        });

        //password changing button
        Button Change_Pass;
        Change_Pass = (Button) findViewById(R.id.passwordButton);
        Change_Pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(accountSettings.this, changePassword.class));
            }
        });

        //logs the user out
        ImageButton Log_Out;
        Log_Out = (ImageButton) findViewById(R.id.imageButton);
        Log_Out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) { //need to run log out code

            }
        });
    }
}
