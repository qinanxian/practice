package com.lihui.practice.service.impl;

import com.lihui.practice.service.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("我是蓝色的实现类");
    }
}
