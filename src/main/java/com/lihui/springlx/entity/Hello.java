package com.lihui.springlx.entity;

import lombok.Data;

@Data
public class Hello {
    private String name;

    public void show() {
        System.out.println("Hello," + name);
    }
}
