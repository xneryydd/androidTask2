package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 对应 XML: activity_main.xml

        // 跳转到 FirstActivity
        findViewById(R.id.btn_to_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("mainActivity", "跳转按钮被点击了");
                startActivity(new Intent(MainActivity.this, FirstActivity.class));
            }
        });
    }
}
