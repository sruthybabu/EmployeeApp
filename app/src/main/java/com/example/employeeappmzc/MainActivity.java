package com.example.employeeappmzc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
AppCompatButton b1;
String getEmpCode, getEmpName, getDesignation, getSalary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.empcode);
        ed2=(EditText) findViewById(R.id.empname);
        ed3=(EditText) findViewById(R.id.desig);
        ed4=(EditText) findViewById(R.id.sal);
        b1=(AppCompatButton) findViewById(R.id.subbut);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEmpCode=ed1.getText().toString();
                getEmpName=ed2.getText().toString();
                getDesignation=ed3.getText().toString();
                getSalary=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getEmpCode, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getEmpName, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getDesignation, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getSalary, Toast.LENGTH_LONG).show();
            }
        });
    }
}