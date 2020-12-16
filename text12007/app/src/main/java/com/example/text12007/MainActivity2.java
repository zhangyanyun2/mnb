package com.example.text12007;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView3);
        Intent intent=getIntent();
        String username=intent.getStringExtra("username");
        String password=intent.getStringExtra("password");
        textView.setText("获取的值是：\n用户名名"+username+"\n密码："+password);
        }

    }
}