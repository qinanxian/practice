package com.lihui.practice.service.impl;

import com.lihui.practice.service.Shape;
import org.springframework.stereotype.Service;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("这是计算圆形的实现类");
    }
}
