package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private LinearLayout llName;
    private EditText edtName;
    private LinearLayout llAge;
    private EditText edtAge;
    private LinearLayout llMobile;
    private EditText edtMobile;
    private LinearLayout llEmail;
    private EditText edtEmail;
    private Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llName = (LinearLayout) findViewById(R.id.llName);
        edtName = (EditText) findViewById(R.id.edtName);
        llAge = (LinearLayout) findViewById(R.id.llAge);
        edtAge = (EditText) findViewById(R.id.edtAge);
        llMobile = (LinearLayout) findViewById(R.id.llMobile);
        edtMobile = (EditText) findViewById(R.id.edtMobile);
        llEmail = (LinearLayout) findViewById(R.id.llEmail);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        btnNext = (Button) findViewById(R.id.btnNext);

        //button click
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome:" + " " + edtName.getText().toString() + "\n"
                        + "Age :" + " " + edtAge.getText().toString() + "\n" + "Mobile:" + edtMobile.getText().toString() + "\n"
                        + "Email:" + edtEmail.getText().toString(), Toast.LENGTH_LONG).show();

                edtName.setText("");
                edtAge.setText("");
                edtMobile.setText("");
                edtEmail.setText("");
            }
        });


    }

}