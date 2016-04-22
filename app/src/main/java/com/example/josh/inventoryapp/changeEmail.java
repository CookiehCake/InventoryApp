package com.example.josh.inventoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class changeEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_email);

        final EditText FirstEmail = (EditText) (findViewById(R.id.editText5));
        final EditText SecondEmail = (EditText) (findViewById(R.id.editText6));

        //button to change email
        Button ChangeEmail;
        ChangeEmail = (Button) findViewById(R.id.button6);
        ChangeEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (FirstEmail == SecondEmail) {
                    //confirms two emails are the same, need code here to change email on the server
                }
            }
        });

        //cancel button
        Button GoBack;
        GoBack = (Button) findViewById(R.id.button7);
        GoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(changeEmail.this, accountSettings.class));

            }
        });



    }






}
