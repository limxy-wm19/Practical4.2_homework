package com.example.practical42_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox chocolate, sprinkles, crushed_nuts, cherries, orio_cookie_crumbles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeUI();
    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();

    }


    public void onSubmit(View view) {
        String message = "Toppings: ";

        if (chocolate.isChecked())
            message = message + getString(R.string.chocolate_syrup) + " ";

        if (sprinkles.isChecked())
            message = message + getString(R.string.sprinkles) + " ";

        if (crushed_nuts.isChecked())
            message = message + getString(R.string.crushed_nuts) + " ";

        if (cherries.isChecked())
            message = message + getString(R.string.cherries) + " ";

        if (orio_cookie_crumbles.isChecked())
            message = message + getString(R.string.orio_cookie_crumbles) + " ";
        displayToast(message);
    }
    public void initializeUI(){
        chocolate = findViewById(R.id.chocolate);
        sprinkles = findViewById(R.id.sprinkles);
        crushed_nuts = findViewById(R.id.crushed_nuts);
        cherries = findViewById(R.id.cherries);
        orio_cookie_crumbles = findViewById(R.id.orio_cookie_crumbles);
    }
}