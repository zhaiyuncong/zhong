package com.example.gangplank.zhong.MainMoulde;

import com.example.gangplank.zhong.News;

import java.util.List;

/**
 * Created by GANGPLANK on 2018/12/29.
 */

public interface MainModule {
    interface FInishHttp {

        void setLists(List<News.RESULTBean.NewsListBean> newsListBeans);
        void showError(String error);
    }

    void getList(int page, FInishHttp fInishHttp);
}
