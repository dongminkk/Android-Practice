package com.example.practiceproblem3;
/* **********************************************
 * 프로젝트명 :  PracticeProblem3
 * 작성자 : 2017038093 김동민
 * 작성일 : 2023.04.02
 *프로그램 설명 :  4-9. 버튼에도 이미지가 들어가도록 할 수 있다. 다음과 같이 버튼을 클릭하면 이미지가 10도씩 회전되도록 프로젝트를 작성하라.
 ************************************************/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button rotateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        rotateButton = findViewById(R.id.rotateButton);

        rotateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setRotation(imageView.getRotation() + 10);
            }
        });
    }
}