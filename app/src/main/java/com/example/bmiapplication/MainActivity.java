package com.example.bmiapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edt_weight,edt_heightF, edt_heightI;
        Button btncalculate;
        TextView txtResult ;

        edt_weight = findViewById(R.id.edt_weight);
        edt_heightF = findViewById(R.id.edt_heightF);
        edt_heightI = findViewById(R.id.edt_heightI);
        txtResult= findViewById(R.id.txtView);
        btncalculate = findViewById(R.id.btncalculate);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt = Integer.parseInt(edt_weight.getText().toString());
                int htf = Integer.parseInt(edt_heightF.getText().toString());
                int hti = Integer.parseInt(edt_heightI.getText().toString());

                int totalIn = htf*12 + hti;
                double totalCm = totalIn * 2.53;

                double total1M = totalCm / 100;

                double bmi = wt/(total1M*total1M);

                if(bmi>25){
                    txtResult.setText("You are over weight");
                } else if (bmi<18) {
                    txtResult.setText("Your are under weight");

                }else{
                    txtResult.setText("You are healthy");
                }

            }
        });









    }
}