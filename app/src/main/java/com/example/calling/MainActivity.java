package com.example.calling;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

import com.lauking.callph.R;

public class MainActivity extends Activity {
    private Button bt;
    private EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {                  super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// 取得资源
        bt = (Button) findViewById(R.id.bt1);
        et = (EditText) findViewById(R.id.et1);
        // 增加事件响应
        bt.setOnClickListener(new Button.OnClickListener() {
            @Override

            public void onClick(View v) {

                // 取得输入的电话号码串
                String inputStr = et.getText().toString();
// 如果输入不为空创建打电话的Intent
                if (inputStr.trim().length() != 0) {
                    Intent phoneIntent = new Intent(

                            "android.intent.action.CALL", Uri.parse("tel:"

                            + inputStr));

                    // 启动
                    startActivity(phoneIntent);
                }

// 否则Toast提示一下

                else {

                    Toast.makeText(MainActivity.this, "不能输入为空",

                            Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}