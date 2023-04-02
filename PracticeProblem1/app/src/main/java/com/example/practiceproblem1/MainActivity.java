package com.example.practiceproblem1;
/* **********************************************
 * 프로젝트명 :  PracticeProblem1
 * 작성자 : 2017038093 김동민
 * 작성일 : 2023.04.02
 *프로그램 설명 :  4-7 에디트텍스트에 키가 눌릴 때마다, 바뀐 글자가 Toast 메시지로 나오도록 프로젝트를 작성하라.
 ************************************************/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox myCheckBox1 = findViewById(R.id.checkBox);
        CheckBox myCheckBox2 = findViewById(R.id.checkBox2);
        CheckBox myCheckBox3 = findViewById(R.id.checkBox3);

        Button myButton = findViewById(R.id.button);

        myCheckBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myButton.setEnabled(true);
                } else {
                    myButton.setEnabled(false);
                }
            }
        });

        myCheckBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myButton.setClickable(true);
                } else {
                    myButton.setClickable(false);
                }
            }
        });

        myCheckBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myButton.setRotation(45);
                } else {
                    myButton.setRotation(0);
                }
            }
        });


    }
}