package com.lihui.practice.service.impl;

import com.lihui.practice.service.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("我是红色的实现类");
    }
}
