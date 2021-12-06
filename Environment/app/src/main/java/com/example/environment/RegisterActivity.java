package com.example.environment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private String hobbys,sexselect;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final EditText name;
        final EditText phone;
        final EditText password;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhuce);

        name =findViewById(R.id.name);
        phone=findViewById(R.id.phone);
        password=findViewById(R.id.password);


        CheckBox shuttlecock = (CheckBox) findViewById(R.id.checkBox);
        CheckBox basketball = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox pingpong = (CheckBox) findViewById(R.id.checkBox3);
        shuttlecock.setOnCheckedChangeListener(this);
        basketball.setOnCheckedChangeListener(this);
        pingpong.setOnCheckedChangeListener(this);
        hobbys = new String();//存放选中的CheckBox的文本信息


        radioGroup = (RadioGroup) findViewById(R.id.sex);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override public void onCheckedChanged(
                    RadioGroup group, int checkedId) {
                //判断点击的是哪个RadioButton
                if (checkedId == R.id.sexb) {
                    sexselect="男";
                } else {
                    sexselect="女";
                }
            }
        });

        findViewById(R.id.zhucebutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteHelper sqLiteHelper =new SQLiteHelper(RegisterActivity.this);
                Log.e("sqlitebbb","332");
               sqLiteHelper.insertData(name.getText().toString(),phone.getText().toString(),password.getText().toString(),hobbys,sexselect);
                Log.e("idid",sexselect);

                Toast.makeText(RegisterActivity.this,"成功",Toast.LENGTH_SHORT).show();

                Intent intent =new Intent();
                intent.putExtra("name",name.getText().toString());
                intent.putExtra("password",password.getText().toString());
                setResult(2,intent);
                finish();
            }
        });
        findViewById(R.id.quxiao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("sex",sexselect);

            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        String motion = buttonView.getText().toString();
        if(isChecked){
            if (!hobbys.contains(motion)){
                hobbys = hobbys + motion;
            }
        }else {
            if (hobbys.contains(motion)) {
                hobbys = hobbys.replace(motion, "");
            }
        }
    }
}
