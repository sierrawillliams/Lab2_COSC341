package com.example.l2_q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button confirm;
    EditText studentNumber, lastName, firstName;
    RadioGroup gender;
    RadioButton male, female;
    Spinner divisionAns;
    CheckBox robot;
    boolean isCheck;
    String selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentNumber = findViewById(R.id.studentNumber);
        lastName = findViewById(R.id.lastName);
        firstName = findViewById(R.id.firstName);
        gender = findViewById(R.id.gender);
        divisionAns = findViewById(R.id.division);
        robot = findViewById(R.id.robot);
        confirm = findViewById(R.id.submit);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        List<String> division_2 = new ArrayList<String>();
        division_2.add("COSC");
        division_2.add("DATA");
        division_2.add("MATH");

        ArrayAdapter<String> da = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, division_2);
        da.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        divisionAns.setAdapter(da);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String studentNum = studentNumber.getText().toString();
                String lastN = lastName.getText().toString();
                String firstN = firstName.getText().toString();
                String division = divisionAns.getSelectedItem().toString();

                Intent intent_2 = getIntent();
                if (studentNum.length() != 8) {
                    Toast.makeText(MainActivity.this, "Input an 8 digit number!", Toast.LENGTH_SHORT).show();

                } else if (lastN.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Input last name!", Toast.LENGTH_SHORT).show();

                } else if (firstN.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Input first name!", Toast.LENGTH_SHORT).show();

                } else {

                    Bundle bundle = new Bundle();
                    Intent intent = new Intent(MainActivity.this, Activity2.class);

                    if (robot.isChecked()) {
                        isCheck = true;
                    } else {
                        isCheck = false;
                    }

                    bundle.putString("studentNum", studentNum);
                    bundle.putString("lastName", lastN);
                    bundle.putString("firstName", firstN);
                    bundle.putString("division", division);

                    if (male.isChecked()) {
                        selected = male.getText().toString();
                    } else if (female.isChecked()) {
                        selected = female.getText().toString();
                    }
                    bundle.putString("gender", selected);

                    if (isCheck) {
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                }
            }
        });

    }


}