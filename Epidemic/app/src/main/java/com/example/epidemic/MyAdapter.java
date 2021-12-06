package com.example.epidemic;


import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<User> list;
    private Context context;
    private  int[] image;
    public MyAdapter(List<User> list, Context context) {
        this.list = list;
        this.context = context;

        //this.image = image;
    }
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  view =View.inflate(context,R.layout.list_item,null);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.tv.setText("账号: "+list.get(position).getName());
        holder.tv2.setText("密码: "+list.get(position).getPassword());
        holder.tv3.setText("关注: "+list.get(position).getFavorite());
        holder.tv4.setText("性别:"+list.get(position).getSex());
        //holder.imageView.setImageResource(image[position]);

    }

    @Override
    public int getItemCount() {
        return list==null ? 0 :list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tv,tv2,tv3,tv4;
        private ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv =itemView.findViewById(R.id.tv);
            tv2=itemView.findViewById(R.id.tv2);
            tv3=itemView.findViewById(R.id.tv3);
            tv4=itemView.findViewById(R.id.tv4);
        }
    }
    private OnRecyclerItemClickListener mOnItemClickListener;

    public void setRecyclerItemClickListener(OnRecyclerItemClickListener listener) {
        mOnItemClickListener = listener;
    }

    public interface OnRecyclerItemClickListener {
        void onRecyclerItemClick(int position);
    }
}
