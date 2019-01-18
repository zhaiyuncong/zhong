package com.example.gangplank.zhong;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by GANGPLANK on 2018/12/29.
 */

public interface MyServer {
    public String URL="http://api.shujuzhihui.cn/api/news/";
    @POST
    @FormUrlEncoded
    Call<News> getData(@Url String url, @FieldMap Map<String, String> map);
}
