package com.lihui.practice.service.impl;

import com.lihui.practice.service.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("我是绿色的实现类");
    }
}
