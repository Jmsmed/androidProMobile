package com.example.appgestionstock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureStockButton();
        configureOperationButton();
    }


    private void configureStockButton(){
        Button stockButton = (Button) findViewById(R.id.b_stock);
        stockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, StockActivity.class));
            }
        });
    }

    private void configureOperationButton(){
        Button operationButton = (Button) findViewById((R.id.b_operation));
        operationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, OperationActivity.class));
            }
        });
    }
}