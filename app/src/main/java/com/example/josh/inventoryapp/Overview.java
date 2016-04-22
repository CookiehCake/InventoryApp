package com.example.josh.inventoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;
import android.view.View.OnClickListener;

public class Overview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        //loads account setting activity
        ImageButton Account_Settings;
        Account_Settings = (ImageButton) findViewById(R.id.imageView4);
        Account_Settings.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Overview.this, accountSettings.class));
            }
        });

        //loads Inventory_Management activity
        ImageButton Inventory_Management;
        Inventory_Management = (ImageButton) findViewById(R.id.imageView5);
        Inventory_Management.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) { //need to set to change to inventory management pane
                startActivity(new Intent(Overview.this, accountSettings.class));
            }
        });

        //loads Item_Management activity
        ImageButton Item_Management;
        Item_Management = (ImageButton) findViewById(R.id.imageView6);
        Item_Management.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) { //need to set to change to item management pane
                startActivity(new Intent(Overview.this, accountSettings.class));
            }
        });

        //loads member management activity
        ImageButton Member_Management;
        Member_Management = (ImageButton) findViewById(R.id.imageView7);
        Member_Management.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) { //need to set to change to member management pane
                startActivity(new Intent(Overview.this, accountSettings.class));
            }
        });

        Button Member_Search;
        Member_Search = (Button) findViewById(R.id.button);
        Member_Search.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) { //need code here to search for the member entered in textField with ID textView5

                //member search code here
                //could also store the textField data and pass to memberSearch activity and run search on load. (Less variables to pass to other activity)

                startActivity(new Intent(Overview.this, memberSearch.class));
            }
        });

    }
}
