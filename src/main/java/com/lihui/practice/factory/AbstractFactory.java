package com.lihui.practice.factory;

import com.lihui.practice.service.Color;
import com.lihui.practice.service.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
