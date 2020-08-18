package com.lihui.practice.service.impl;

import com.lihui.practice.service.Shape;
import org.springframework.stereotype.Service;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("这是计算矩形得实现类");
    }
}
