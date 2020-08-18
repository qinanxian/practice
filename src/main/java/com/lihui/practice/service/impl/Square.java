package com.lihui.practice.service.impl;

import com.lihui.practice.service.Shape;
import org.springframework.stereotype.Service;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("这是计算正方形的实现类");
    }
}
