package com.example.l2_q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    Button done;
    TextView studentNum, name, divis, gend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        studentNum = findViewById(R.id.studentNumber);
        name = findViewById(R.id.name);
        divis = findViewById(R.id.division);
        gend = findViewById(R.id.gender);
        done = findViewById(R.id.done);

        Bundle bundle = getIntent().getExtras();

        String studentNumber = bundle.getString("studentNum");
        String lastN = bundle.getString("lastName");
        String firstN = bundle.getString("firstName");
        String gender = bundle.getString("gender");
//        int gender = bundle.getInt("gender");
        String division = bundle.getString("division");

        studentNum.setText("Student Number: " + studentNumber);
        name.setText("Name: " + firstN + " " + lastN);
        gend.setText("Gender: " + gender);
        divis.setText("Division " + division);


        done.setOnClickListener(view -> {
            Intent intent = new Intent(Activity2.this, MainActivity.class);
            startActivity(intent);

        });
    }

}