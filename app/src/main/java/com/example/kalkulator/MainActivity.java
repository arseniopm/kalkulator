package com.example.kalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstNumber, etSecondNumber;
    private RadioGroup operationGroup;
    private Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstNumber = findViewById(R.id.et_first_number);
        etSecondNumber = findViewById(R.id.et_second_number);
        operationGroup = findViewById(R.id.operation_group);
        btnCalculate = findViewById(R.id.btn_calculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etFirstNumber.getText().toString());
                double num2 = Double.parseDouble(etSecondNumber.getText().toString());
                double result = 0;

                int selectedOperation = operationGroup.getCheckedRadioButtonId();
                if (selectedOperation == R.id.rb_addition) {
                    result = num1 + num2;
                } else if (selectedOperation == R.id.rb_subtraction) {
                    result = num1 - num2;
                } else if (selectedOperation == R.id.rb_multiplication) {
                    result = num1 * num2;
                } else if (selectedOperation == R.id.rb_division) {
                    result = num1 / num2;
                }

                // Mengirim hasil ke activity lain
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.putExtra("RESULT", result);
                intent.putExtra("NIM", "12345678");
                intent.putExtra("NAME", "Nama Mahasiswa");
                startActivity(intent);
            }
        });
    }
}
