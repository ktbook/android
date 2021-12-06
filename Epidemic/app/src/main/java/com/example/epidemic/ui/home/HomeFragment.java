package com.example.epidemic.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.epidemic.R;
import com.example.epidemic.UserActivity;

public class HomeFragment extends Fragment implements View.OnClickListener {
    View root;
    private HomeViewModel homeViewModel;
    private RelativeLayout relativeLayout,relativeLayout1;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
         root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        relativeLayout = root.findViewById(R.id.userlist);
        relativeLayout.setOnClickListener(this);
//        root.findViewById(R.id.yiyuan).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent =new Intent(getActivity(), InfoActivity.class);
//                startActivity(intent);
//            }
//        });
        return root;
    }

    @Override
    public void onClick(View view) {
        Intent intent =new Intent(getActivity(), UserActivity.class);
        startActivity(intent);
    }
}