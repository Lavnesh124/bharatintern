package com.example.temperaturconverter;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  EditText temp;
  TextView ans;
  Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temp=(EditText)findViewById(R.id.edtTemp);
        btn1=(Button)findViewById(R.id.btnCelToKel);
        btn2=(Button)findViewById(R.id.btnKelToCel);
        ans=(TextView)findViewById(R.id.textView);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(temp.getText().toString().isEmpty()){
                    ans.setText("Please give temperature");

                }
                else {
                    int p = parseInt(temp.getText().toString());
                    p += 273;
                    ans.setText(p + "" + " K");
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(temp.getText().toString().isEmpty()){
                    ans.setText("Please give temperature");

                }
                else {
                    int p = parseInt(temp.getText().toString());
                    p -= 273;
                    ans.setText(p + "" + " °C");
                }
            }
        });
    }
}