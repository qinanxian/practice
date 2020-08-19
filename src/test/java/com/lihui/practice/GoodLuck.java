package com.lihui.practice;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

@SpringBootTest
public class GoodLuck {

    @Test
    void GetRich() {
        int[] red = new int[6];
        int[] blue = new int[1];
        for (int i = 0; i < 1; i++) {
            Random r = new Random();
            blue[i] = r.nextInt(32) + 1;
            for (int j = 0; j < i; j++) {
                if (blue[i] == blue[j]) {
                    i--;
                    break;
                }
            }

        }
        for (int i = 0; i < 6; i++) {
            Random r = new Random();
            red[i] = r.nextInt(36) + 1;
            for (int j = 0; j < i; j++) {
                if (red[i] == red[j]) {
                    i--;
                    break;
                }
            }

        }
        System.out.print(DateFormat.getDateInstance().format(new Date())+":红色预计中奖号码是：");
        for (int a : red)
            System.out.print(a+" ");
        System.out.print(DateFormat.getDateInstance().format(new Date())+":蓝色预计中奖号码是：");
        for (int b : blue)
            System.out.print(b+" ");
    }
}
