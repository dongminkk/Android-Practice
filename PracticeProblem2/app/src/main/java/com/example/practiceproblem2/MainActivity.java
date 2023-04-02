package com.example.practiceproblem2;
/* **********************************************
 * 프로젝트명 :  PracticeProblem2
 * 작성자 : 2017038093 김동민
 * 작성일 : 2023.04.02
 *프로그램 설명 :  4-8 에디트텍스트에 키가 눌릴 때마다, 바뀐 글자가 Toast 메시지로 나오도록 프로젝트를 작성하라.
 ************************************************/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.edit_text);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String changedText = s.toString();
                Toast.makeText(getApplicationContext(), changedText, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}