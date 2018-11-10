package com.example.android.project3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int points = 0;


    public void submitOrder(View view) {


        //Question 1
        //  @param raspunsCorect1 translated from Romanian language means correctAnswer & 1 is the number of it

        RadioButton correctAnswer1 = (RadioButton) findViewById(R.id.raspuns_eminem);
        boolean raspunsCorect1 = correctAnswer1.isChecked();
        if (raspunsCorect1) {
            points += 1;
        }

        //Question 2

        RadioButton correctAnswer2 = (RadioButton) findViewById(R.id.raspuns_detroit);
        boolean raspunsCorect2 = correctAnswer2.isChecked();
        if (raspunsCorect2) {
            points += 1;
        }

        //Question 3
        CheckBox correctAnswer3A = (CheckBox) findViewById(R.id.raspuns_future);
        CheckBox correctAnswer3B = (CheckBox) findViewById(R.id.raspuns_drDre);
        CheckBox correctAnswer3C = (CheckBox) findViewById(R.id.raspuns_snoopDogg);
        CheckBox correctAnswer3D = (CheckBox) findViewById(R.id.raspuns_2pac);
        if (correctAnswer3A.isChecked() && correctAnswer3B.isChecked() && !correctAnswer3C.isChecked() && !correctAnswer3D.isChecked()) {
            points += 2;
        }


        //*Question 4
        // Question answer : revival
        EditText nameOfAlbum = (EditText) findViewById(R.id.album_name);
        String albumName = nameOfAlbum.getText().toString();
        //this could be also implemented with equalsIgnoreCase but require more code
        if (albumName.equalsIgnoreCase("revival")) {
            points += 5;
        }

        //Question 5
        RadioButton correctAnswer5 = (RadioButton) findViewById(R.id.raspuns_5_corect);
        boolean raspunsCorect5 = correctAnswer5.isChecked();
        if (raspunsCorect5) {
            points += 1;
        }
        if (points == 0) {
            Toast.makeText(this, "I'm sorry, you\'re not an Em\' fan.", Toast.LENGTH_SHORT).show();
        } else if (points <= 7) {
            Toast.makeText(this, "Hey, you scored " + points + "/10, looks like \nyou know something about Marshall", Toast.LENGTH_LONG).show();
        } else if (points >= 8) {
            Toast.makeText(this, "Wow! You really love Eminem! \nYou scored " + points + "/10 points", Toast.LENGTH_LONG).show();
        }

        points = 0;

    }

}