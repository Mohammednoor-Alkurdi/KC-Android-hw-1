package com.example.yourgrade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Test = findViewById(R.id.TEST);
        TextView instractions = findViewById(R.id.ins);
        TextView Attendance = findViewById(R.id.Att);
        TextView Subject = findViewById(R.id.sub);
        TextView Homework = findViewById(R.id.HW);
        TextView MidTerms = findViewById(R.id.MT);
        TextView Final = findViewById(R.id.F);
        TextView FGV = findViewById(R.id.FGV);
        TextView FG = findViewById(R.id.FG);

        LinearLayout dc3 = findViewById(R.id.dc3);
        FrameLayout dc1 = findViewById(R.id.dc1);
        LinearLayout dc2 = findViewById(R.id.dc2);

        EditText AttV = findViewById(R.id.AttV);
        EditText SV = findViewById(R.id.SV);
        EditText HWV = findViewById(R.id.HWV);
        EditText FV = findViewById(R.id.FV);
        EditText MTV = findViewById(R.id.MTV);

        Button CAL = findViewById(R.id.CAL);
        Button RE = findViewById(R.id.RE);


        CAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(AttV.getText().toString());

                int num3 = Integer.parseInt(HWV.getText().toString());
                int num4 = Integer.parseInt(FV.getText().toString());
                int num5 = Integer.parseInt(MTV.getText().toString());

                int result = num1 + num5 + num3 + num4;

                FGV.setText(String.valueOf(result));

                if (result>=50) {
                    Test.setText("  You Passed ! ");

                } else if (result<50) {

                    Test.setText("    You Failed  ");
                }





                RE.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        AttV.setText(null);
                        AttV.dispatchDisplayHint(View.VISIBLE);

                        SV.setText(null);
                        SV.dispatchDisplayHint(View.VISIBLE);

                        HWV.setText(null);
                        HWV.dispatchDisplayHint(View.VISIBLE);

                        FV.setText(null);
                        FV.dispatchDisplayHint(View.VISIBLE);

                        MTV.setText(null);
                        MTV.dispatchDisplayHint(View.VISIBLE);

                        FGV.setText(null);

                        Test.setText(null);

                    }
                });

            }
        });
    }
}



