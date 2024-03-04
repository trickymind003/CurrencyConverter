package com.college.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 Task1
import java.util.Locale;

import com.college.converter.databinding.ActivityMainBinding;

main
/*
    TODOs:
    In groups of 4, complete the following tasks, 1 for each team member:
    1. Extract all the strings into the strings.xml file and use them in the layout and the activity
    2. Change the theme of the app to a NoActionBar theme and modify the primary colors
    3. Add Log messages at the entry/exit of onCreate() and convertCurrency methods. Level should be Info
    4. Add ViewBinding to the project

    ** Each task must be done in a separate branch and merged to the main branch
    after completion using a Pull Request.
    ** Each task must be done by a different team member.
*/
public class MainActivity extends AppCompatActivity {
    static private final Float CONVERSION_RATE = 0.80F;
Task1
=======
    ActivityMainBinding binding;
  main

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        // Log entry message for onCreate
        Log.i("MainActivity", "onCreate method called");

        Button buttonConvert = findViewById(R.id.convertButton);

Task1
        // Using method reference
        buttonConvert.setOnClickListener(this::convertCurrency);

        buttonConvert.setOnClickListener(view -> {
            convertCurrency(view);
        });
 main
    }

    // Method with the same signature as OnClickListener's onClick method
    public void convertCurrency(View view) {
Task1
        // Your existing implementation

        // Log entry message for convertCurrency
        Log.i("MainActivity", "convertCurrency method called");
 main
        EditText inputView = findViewById(R.id.entryId);
        TextView resultView = findViewById(R.id.resultId);

        String inputAmount = inputView.getText().toString();

        if (!inputAmount.isEmpty()) {
            Float inputAmountDecimal = Float.valueOf(inputAmount);
            Float resultFloat = inputAmountDecimal * CONVERSION_RATE;

 Task1
            String resultText = String.format(Locale.getDefault(), "%.2f%s",
                    resultFloat, getString(R.string.result_euros_Suffix));

            resultView.setText(resultText);

resultView.setText(resultFloat + " Euros");
 main
        }

        // Log exit message for convertCurrency
        Log.i("MainActivity", "convertCurrency method finished");
    }
}
