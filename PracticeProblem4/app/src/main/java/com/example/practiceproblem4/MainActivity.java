package com.example.practiceproblem4;
/* **********************************************
 * 프로젝트명 :  PracticeProblem4
 * 작성자 : 2017038093 김동민
 * 작성일 : 2023.04.02
 *프로그램 설명 :  계산기 만들기
 ************************************************/

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void onButtonClick(View view) {
        int num1, num2;
        switch (view.getId()) {
            case R.id.btn0:
                editTextInput("0");
                break;
            case R.id.btn1:
                editTextInput("1");
                break;
            case R.id.btn2:
                editTextInput("2");
                break;
            case R.id.btn3:
                editTextInput("3");
                break;
            case R.id.btn4:
                editTextInput("4");
                break;
            case R.id.btn5:
                editTextInput("5");
                break;
            case R.id.btn6:
                editTextInput("6");
                break;
            case R.id.btn7:
                editTextInput("7");
                break;
            case R.id.btn8:
                editTextInput("8");
                break;
            case R.id.btn9:
                editTextInput("9");
                break;
            case R.id.btnPlus:
                num1 = getNumFromEditText1();
                num2 = getNumFromEditText2();
                textViewResult.setText(String.valueOf(num1 + num2));
                break;
            case R.id.btnMinus:
                num1 = getNumFromEditText1();
                num2 = getNumFromEditText2();
                textViewResult.setText(String.valueOf(num1 - num2));
                break;
            case R.id.btnMultiply:
                num1 = getNumFromEditText1();
                num2 = getNumFromEditText2();
                textViewResult.setText(String.valueOf(num1 * num2));
                break;
            case R.id.btnDivide:
                num1 = getNumFromEditText1();
                num2 = getNumFromEditText2();
                if (num2 == 0) {
                    Toast.makeText(this, "0으로 나눌수 없다", Toast.LENGTH_SHORT).show();
                    return;
                }
                textViewResult.setText(String.valueOf(num1 / num2));
                break;
            case R.id.btnClear:
                editText1.setText("");
                editText2.setText("");
                textViewResult.setText("");
                break;
            case R.id.btnEquals:
// do nothing
                break;
        }
    }

    private void editTextInput(String str) {
        EditText editText = getSelectedEditText();
        if (editText == null) {
            Toast.makeText(this, "먼저 에디트텍스트를 선택하세요", Toast.LENGTH_SHORT).show();
            return;
        }
        String currentText = editText.getText().toString();
        editText.setText(currentText + str);
    }

    private int getNumFromEditText1() {
        String str = editText1.getText().toString();
        if (str.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(str);
    }

    private int getNumFromEditText2() {
        String str = editText2.getText().toString();
        if (str.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(str);
    }

    private EditText getSelectedEditText() {
        if (editText1.hasFocus()) {
            return editText1;
        } else if (editText2.hasFocus()) {
            return editText2;
        } else {
            return null;
        }
    }
}

