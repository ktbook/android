package com.example.epidemic.ui.notifications;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.epidemic.Info;
import com.example.epidemic.InfoAdapter;
import com.example.epidemic.R;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NotificationsFragment extends Fragment {
    private View root;
    private NotificationsViewModel notificationsViewModel;
    private InfoAdapter adapter;             // 列表的适配器
    public static final int MSG_GOODS_OK = 1; // 获取数据
    private NotificationsFragment.MHandler mHandler;
    // 内网接口
//        public static final String WEB_SITE = "http://192.168.20.1:8080/goods";
//        // 商品列表接口
//        public static final String REQUEST_GOODS_URL = "/city.json";
    private RecyclerView rv_list;
    private Context context;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
         root = inflater.inflate(R.layout.activity_info, container, false);
        context=root.getContext();
        mHandler = new NotificationsFragment.MHandler();
        init();
        initData();
        return root;
    }
    private void init() {
        DividerItemDecoration mDivider = new
                DividerItemDecoration(root.getContext(),DividerItemDecoration.VERTICAL);
        rv_list = root.findViewById(R.id.rv2);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        rv_list.addItemDecoration(mDivider);

        rv_list.setLayoutManager(manager);
        adapter = new InfoAdapter(context);
        rv_list.setAdapter(adapter);
    }
    private void initData() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url("http://apis.juhe.cn/springTravel/hsjg?key=" +
                "22ab8c169cb013fe4a6db55320a65a7b&city_id=10097").build();
        Call call = okHttpClient.newCall(request);
        Log.e("wdpeg","112");
        // 开启异步线程访问网络
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.e("wdpeg","114");
                String res = response.body().string(); // 获取商品数据
                Message msg = new Message();
                msg.what = MSG_GOODS_OK;
                msg.obj = res;
                mHandler.sendMessage(msg);
            }
            @Override
            public void onFailure(Call call, IOException e) {
            }
        });
    }
    /**
     * 事件捕获
     */
    class MHandler extends Handler {
        @Override
        public void dispatchMessage(Message msg) {
            super.dispatchMessage(msg);
            Log.e("wdpeg","114");
            switch (msg.what) {
                case MSG_GOODS_OK:
                    if (msg.obj != null) {
                        Log.e("wdpeg","111");
                        String vlResult = (String) msg.obj;
                        // 解析获取的JSON数据
                        //Log.e("wdpeg",vlResult);
                        List<Info.ResultBean.DataBean> Infos = getinfoList(vlResult);
                        // Log.e("wdpeg",petsInfos.get(0).getCoverURL());
                        adapter.setData(Infos);
                    }
                    //Log.e("wdpeg","116");
                    break;
            }
        }
    }
    public List<Info.ResultBean.DataBean> getinfoList(String json) {
        Gson gson = new Gson(); // 使用gson库解析JSON数据
        // 创建一个TypeToken的匿名子类对象，并调用对象的getType()方法
        // 把获取到的集合数据存放到goodsInfos中
        Info info = new Gson().fromJson(json,Info.class);
        List<Info.ResultBean.DataBean> infos =info.getResult().getData();
        return infos;
    }

}