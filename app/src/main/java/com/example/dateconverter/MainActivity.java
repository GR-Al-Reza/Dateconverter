package com.example.dateconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText day_text,month_text,year_text;
    private Button calculate_button,cancel_button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        day_text=findViewById(R.id.day_id);
        month_text=findViewById(R.id.month_id);
        year_text=findViewById(R.id.year_id);
         calculate_button=findViewById(R.id.calculate_button_id);
         cancel_button=findViewById(R.id.cancel_button_id);
         textView=findViewById(R.id.result_id);


        calculate_button.setOnClickListener(this);
        cancel_button.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.cancel_button_id) {
            day_text.setText("");
            month_text.setText("");
            year_text.setText("");
            textView.setText("");
        }

        try {


                   String number1 = day_text.getText().toString();
                   String number2 = month_text.getText().toString();
                   String number3 = year_text.getText().toString();
                   //converting number string to double
                   double num1 = Double.parseDouble(number1);
                   double num2 = Double.parseDouble(number2);
                   double num3 = Double.parseDouble(number3);
                   if (v.getId() == R.id.calculate_button_id) {

                       int y, m, d;

                       d = (int) num1;
                       m = (int) num2;
                       y = (int) num3;

                       int yd;
                       yd = y - 1900;
                       int l;
                       l = yd / 4;
                       int c = 0;
                       if (m == 1) {
                           c = 1;
                       } else if (m == 2) {
                           c = 4;
                       } else if (m == 3) {
                           c = 4;
                       } else if (m == 4) {
                           c = 0;
                       } else if (m == 5) {
                           c = 2;
                       } else if (m == 6) {
                           c = 5;
                       } else if (m == 7) {
                           c = 0;
                       } else if (m == 8) {
                           c = 3;
                       } else if (m == 9) {
                           c = 6;
                       } else if (m == 10) {
                           c = 1;
                       } else if (m == 11) {
                           c = 4;
                       } else if (m == 12) {
                           c = 6;
                       }
                       int s;
                       s = yd + l + c + d;
                       int r = s % 7;
                       if (r == 0) {
                           textView.setText("The day of this date is: saturday");

                       } else if (r == 1) {

                           textView.setText("The day of this date is: Sunday");
                       } else if (r == 2) {
                           textView.setText("The day of this date is: Monday");
                       } else if (r == 3) {
                           textView.setText("The day of this date is: Tuesday");
                       } else if (r == 4) {
                           textView.setText("The day of this date is: Wednesday");
                       } else if (r == 5) {
                           textView.setText("The day of this date is: Thursday");
                       } else if (r == 6) {
                           textView.setText("The day of this date is: Friday");
                       }

                   }

               }
               catch (Exception e)
               {
                   Toast.makeText(MainActivity.this,"Please enter value",Toast.LENGTH_SHORT).show();
               }


    }

    }
