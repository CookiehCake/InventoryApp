package com.example.josh.inventoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inventoryManagement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory_management);

        //button to load item list activity
        Button ListInventory;
        ListInventory = (Button) findViewById(R.id.button8);
        ListInventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(inventoryManagement.this, inventoryList.class));
            }
        });

        //button to load item stock activity
        Button ChangeItem;
        ChangeItem = (Button) findViewById(R.id.button11);
        ChangeItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(inventoryManagement.this, stockItem.class));
            }
        });

        //button to load destroy item activity
        Button DestroyItem;
        DestroyItem = (Button) findViewById(R.id.button10);
        DestroyItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(inventoryManagement.this, destroyItem.class));
            }
        });

        //button to load destroy item activity
        Button StorageInspection;
        DestroyItem = (Button) findViewById(R.id.button10);
        DestroyItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //need to have load the Storage Inspection activity
                //startActivity(new Intent(inventoryManagement.this, destroyItem.class));
            }
        });

    }
}
