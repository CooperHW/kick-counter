package com.example.kick_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int score_a;
    private int score_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        score_a = 0;
        score_b = 0;


        // 取得ID為head的元件
        Button headButton = (Button) findViewById(R.id.head);
        // 按下head按鈕 觸發事件
        headButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {
                score_a += 3;
                // 取得ID為score的元件
                TextView result = (TextView) findViewById(R.id.score);
                result.setText(score_a + "");
            }
        });

        // 取得ID為head的元件
        Button bodyButton = (Button) findViewById(R.id.body);
        // 按下head按鈕 觸發事件
        bodyButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {
                score_a += 2;
                // 取得ID為score的元件
                TextView result = (TextView) findViewById(R.id.score);
                result.setText(score_a + "");
            }
        });
        // 取得ID為head的元件
        Button spinButton = (Button) findViewById(R.id.spin);
        // 按下head按鈕 觸發事件
        spinButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {
                score_a += 4;
                // 取得ID為score的元件
                TextView result = (TextView) findViewById(R.id.score);
                result.setText(score_a + "");
            }
        });

        Button spinheadButton = (Button) findViewById(R.id.spinhead);
        spinheadButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arge0) {

                score_a += 5;
                TextView result = (TextView) findViewById(R.id.score);
                result.setText(score_a + "");
            }
        });

        Button head2Button = (Button) findViewById(R.id.head2);
        head2Button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arge0) {

                score_b += 3;
                TextView result = (TextView) findViewById(R.id.score_2);
                result.setText(score_b + "");
            }
        });

        Button body2Button =(Button) (TextView) findViewById(R.id.body2);
        body2Button.setOnClickListener( new Button.OnClickListener(){
            public void onClick(View arge0){
                score_b += 2;
                TextView result =(TextView)findViewById(R.id.score_2);
                result.setText(score_b+"");
            }
        });
        Button spin2Button=(Button)(TextView)findViewById(R.id.spin2);
        spin2Button.setOnClickListener(new Button.OnClickListener(){
            public  void onClick(View arge0){
                score_b+=4;
                TextView result=(TextView)findViewById(R.id.score_2);
                result.setText(score_b+"");
            }
        });
        Button spinhead2Button=(Button)(TextView)findViewById(R.id.spinhead2);
        spinhead2Button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View arge0){
                score_b+=5;
                TextView result=(TextView)findViewById(R.id.score_2);
                result.setText(score_b+"");
            }
        });





    }}