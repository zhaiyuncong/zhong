package com.example.gangplank.zhong;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.gangplank.zhong.adapter.VAdapter;
import com.example.gangplank.zhong.fragment.ShouFragment;
import com.example.gangplank.zhong.fragment.WoFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager vp;
    private TabLayout tb;
    private ArrayList<String>title;
    private ArrayList<Fragment>list;
    private VAdapter vAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        vp = (ViewPager) findViewById(R.id.vp);
        tb = (TabLayout) findViewById(R.id.tb);
        list=new ArrayList<>();
        list.add(new ShouFragment());
        list.add(new WoFragment());
        title  =new ArrayList<>();
        title.add("首页");
        title.add("我的");
        vAdapter=new VAdapter(getSupportFragmentManager(),list,title);
        vp.setAdapter(vAdapter);
        tb.setupWithViewPager(vp);
    }
}
