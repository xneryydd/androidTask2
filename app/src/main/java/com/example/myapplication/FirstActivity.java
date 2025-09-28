package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first); // 对应 XML: activity_first.xml

        // 返回 MainActivity
        findViewById(R.id.btn_back_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // 返回上一个 Activity
            }
        });

        // 跳转到 SecondActivity
        findViewById(R.id.btn_to_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("firstActivity", "跳转按钮被点击了");
                startActivity(new Intent(FirstActivity.this, SecondActivity.class));
            }
        });
    }
}
