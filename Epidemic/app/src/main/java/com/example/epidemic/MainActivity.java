package com.example.epidemic;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText  name ;
    EditText  password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        name =findViewById(R.id.loginname);
        password =findViewById(R.id.loginpassword);
        findViewById(R.id.zhaomima).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ZhaoActivity.class));
            }
        });
        findViewById(R.id.zhuce).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,RegisterActivity.class);
                startActivityForResult(intent,1);
            }
        });


        findViewById(R.id.loginbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteHelper sqLiteHelper =new SQLiteHelper(MainActivity.this);
                User usertest =sqLiteHelper.find(name.getText().toString());
        /*        Log.e("text2",name.getText().toString());
                Log.e("text2",usertest.getPassword());*/

                if (usertest.getName().equals(name.getText().toString())&&usertest.getPassword()
                        .equals(password.getText().toString())){
                    Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, ItemActivity.class));
                }else {
                    Toast.makeText(MainActivity.this,"登录失败",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode ==1&&resultCode==2){
            String name1 =data.getStringExtra("name");
            String password1 =data.getStringExtra("password");
            Log.e("123",name1);
            name.setText(name1);
            password.setText(password1);
        }
    }
}


