package com.example.vangtichai;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private long amount = 0;

    private TextView tvAmount;

    private final int[] denominations = {
            500, 100, 50, 20, 10, 5, 2, 1
    };

    private final int[] countViewIds = {
            R.id.count500,
            R.id.count100,
            R.id.count50,
            R.id.count20,
            R.id.count10,
            R.id.count5,
            R.id.count2,
            R.id.count1
    };

    private final int[] buttonIds = {
            R.id.btn0,
            R.id.btn1,
            R.id.btn2,
            R.id.btn3,
            R.id.btn4,
            R.id.btn5,
            R.id.btn6,
            R.id.btn7,
            R.id.btn8,
            R.id.btn9
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAmount = findViewById(R.id.tvAmount);

        if (savedInstanceState != null) {
            amount = savedInstanceState.getLong("amount", 0);
        }

        for (int digit = 0; digit <= 9; digit++) {
            final int number = digit;

            Button button = findViewById(buttonIds[digit]);

            button.setOnClickListener(v -> appendDigit(number));
        }

        Button clearButton = findViewById(R.id.btnClear);

        clearButton.setOnClickListener(v -> {
            amount = 0;
            updateDisplay();
        });

        updateDisplay();
    }

    private void appendDigit(int digit) {
        // Prevent excessively large input.
        if (amount > 99999999L) {
            return;
        }

        amount = amount * 10 + digit;
        updateDisplay();
    }

    private void updateDisplay() {
        tvAmount.setText("Taka: " + amount);

        long remaining = amount;

        for (int i = 0; i < denominations.length; i++) {
            long count = remaining / denominations[i];

            TextView countView = findViewById(countViewIds[i]);
            countView.setText(String.valueOf(count));

            remaining = remaining % denominations[i];
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putLong("amount", amount);
        super.onSaveInstanceState(outState);
    }
}
