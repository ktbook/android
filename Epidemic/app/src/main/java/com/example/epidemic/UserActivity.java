package com.example.epidemic;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserActivity extends AppCompatActivity {

    List<User> list;
    SQLiteHelper sqLiteHelper;
    User user;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent =new Intent();
                finish();
            }
        });
        initDate();
    }

    protected void initDate() {
        sqLiteHelper = new SQLiteHelper(this);
        showQueryDate();
    }

    private void showQueryDate() {
        if (list != null) {
            list.clear();
        }
        list = sqLiteHelper.query();
        Log.e("xinxi",list.get(0).getSex());
//        Log.e("xinxi",list.get(0).getName());
        //recycleView设置
        DividerItemDecoration mDivider = new
                DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        RecyclerView recyclerView = findViewById(R.id.rv);
        recyclerView.addItemDecoration(mDivider);

        //recyclerView布局设置
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //适配器设置
        MyAdapter myAdapter = new MyAdapter(list, UserActivity.this);
        recyclerView.setAdapter(myAdapter);
recyclerView.setRecyclerListener(new RecyclerView.RecyclerListener() {
    @Override
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder holder) {

    }
});
    }
}
