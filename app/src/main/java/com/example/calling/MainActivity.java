package com.example.calling;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.day01.R;


public class MainActivity extends Activity {


    //声明控件对象
    private EditText et_phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//设置显示的视图
        setContentView(R.layout.callphoneactivity);

//查找视图中的控件
        et_phone = (EditText)findViewById(R.id.et_phone);

    }

    /**
     * 拨号的实现
     * @param v
     */
    public void callPhone(View v){
//获取输入的电话号码
        String phone = et_phone.getText().toString();

        if(!TextUtils.isEmpty(phone)){

            Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+phone));

//执行意图
            startActivity(intent);

        }else{

            Toast.makeText(this, "请输入手机号码", Toast.LENGTH_LONG).show();

        }
    }

}