package com.yang.x5browsersample;

import android.view.View;

/**
 * Created by yangjinxi on 2016/7/27.
 */

public abstract class OnSingleClickListener implements View.OnClickListener {
    private int DEFAULT_INTERVAL_TIME = 500;
    private long lastClickTime;

    public abstract void onSinglClick(View view);


    public OnSingleClickListener intervalTime(int intervalTime){
        DEFAULT_INTERVAL_TIME = intervalTime;
        return this;
    }

    @Override
    public void onClick(View v) {
        long currentClickTime = System.currentTimeMillis();
        if (currentClickTime - lastClickTime > DEFAULT_INTERVAL_TIME){
            lastClickTime = currentClickTime;
            onSinglClick(v);
        }
    }
}
