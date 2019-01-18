package com.example.gangplank.zhong.adapter;

import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gangplank.zhong.News;
import com.example.gangplank.zhong.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GANGPLANK on 2018/12/29.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<News.RESULTBean.NewsListBean> newsListBeans=new ArrayList<>();
    private Context context;

    public MyAdapter(List<News.RESULTBean.NewsListBean> newsListBeans, Context context) {
        this.newsListBeans = newsListBeans;
        this.context = context;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item,null);
        ViewHolder  viewHolder =new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        News.RESULTBean.NewsListBean newsListBean = newsListBeans.get(position);
        holder.tv.setText(newsListBean.getTitle());
        Glide.with(context).load(newsListBean.getNewsImg()).into(holder.img);
    }
    public void setData(int page, List<News.RESULTBean.NewsListBean> list) {
        if (page == 1) {
            newsListBeans.clear();
        }
        newsListBeans.addAll(list);
        notifyDataSetChanged();

    }


    @Override
    public int getItemCount() {
        return newsListBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView tv;
        public ViewHolder(View itemView) {
            super(itemView);
            img =itemView.findViewById(R.id.img);
            tv=itemView.findViewById(R.id.tv);
        }
    }
}
