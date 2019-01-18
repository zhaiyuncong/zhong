package com.example.gangplank.zhong.MainView;

import com.example.gangplank.zhong.News;

import java.util.List;

/**
 * Created by GANGPLANK on 2018/12/29.
 */

public interface MainView {


    void showError(String error);

    void showList(List<News.RESULTBean.NewsListBean> newsListBeans);
}
