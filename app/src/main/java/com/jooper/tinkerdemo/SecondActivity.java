package com.jooper.tinkerdemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * 北京博瑞彤芸文化传播股份有限公司  版权所有
 * Copyright (c) 2017. bjbrty.com  All Rights Reserved
 * <p>
 * 作者：葛俊鹏  Email：junpeng.ge@sifude.com
 * 描述：${todo}(用一句话描述该文件做什么)
 * 修改历史:
 * 修改日期         作者        版本        描述说明
 * <p>
 * 创建时间： 2017-06-05
 **/

public class SecondActivity extends Activity {

    public static void newIntent(Context context) {
        context.startActivity(new Intent(context, SecondActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}