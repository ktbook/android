package com.example.epidemic;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.MyViewHolder>{
    private List<Info.ResultBean.DataBean> list;
    private Context context;

    public InfoAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Info.ResultBean.DataBean> list) {
        this.list = list;
        notifyDataSetChanged();
    }


    
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =View.inflate(context,R.layout.list_item,null);
        return new MyViewHolder(view);
    }

    
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv2.setText(list.get(position).getProvince()+"省"+list.get(position).getCity()+"市");
        holder.tv3.setText("电话:"+list.get(position).getPhone());
        holder.tv.setText(list.get(position).getName());
        holder.tv4.setText("地址:"+list.get(position).getAddress());

//        Glide.with(context)
//                .load(list.get(position).getIcon())
//                .dontAnimate()
//                .error(R.mipmap.ic_launcher)
//                .into((holder.imageView));
    }

    
    @Override
    public int getItemCount() {
        return list==null ? 0 :list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv;
        private TextView tv2,tv3,tv4;
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

    public interface OnRecyclerItemClickListener {
        void onRecyclerItemClick(int position);
    }
}
