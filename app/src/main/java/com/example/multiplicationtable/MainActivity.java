package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText n1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        n1=findViewById(R.id.editTextTextPersonName);
    }
    public void table(View view){
        int c=Integer.parseInt(n1.getText().toString());
        StringBuffer buffer=new StringBuffer();
        int ans;
        for(int i=1;i<=10;i++){
            ans=i*c;
            buffer.append(c+" X "+i+" = "+ans+" \n \n");

        }
        textView.setText("Multiplication Table of "+c+" : \n\n"+buffer);
    }
}