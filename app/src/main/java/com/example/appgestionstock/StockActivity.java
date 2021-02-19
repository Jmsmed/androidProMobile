package com.example.appgestionstock;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class StockActivity extends AppCompatActivity {

    private EditText Label, Quantity;

    private String label;
    private String qte;
    private DatabaseHelper dbHelper;

    FloatingActionButton add;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);

        add = findViewById(R.id.b_ajouter1);

        Label = findViewById(R.id.labelStockText);
        Quantity = findViewById(R.id.quntiteText);


        // initiate database object in main function
        dbHelper = new DatabaseHelper(this);

        configureBackButton();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create our activity
                // startActivity(new Intent(StockActivity.this, StockActivity.class));
                getData();
            }
        });


    }

    private void getData() {
        label = ""+ Label.getText().toString().trim();
        qte = ""+ Quantity.getText().toString().trim();

        long id = dbHelper.insertInfoArt(
                ""+Label,
                ""+Quantity);

        Toast.makeText(this, "Record added to id: "+id, Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onSupportNavigateUp(){
        // to moves the information to our mainactivity when we press the goBack button
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    private void configureBackButton(){
        Button backButton = (Button) findViewById(R.id.b_goBack1);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}
