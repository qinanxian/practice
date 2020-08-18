package com.lihui.practice;

import com.lihui.practice.entity.AdminTableEntity;
import com.lihui.practice.factory.ShapeFactory;
import com.lihui.practice.mapepr.LonginMapper;
import com.lihui.practice.service.Shape;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PracticeApplicationTests {

   @Autowired
   ShapeFactory shapeFactory;

   @Test
    void Factory(){
       Shape circle = shapeFactory.getShape("CIRCLE");
       circle.draw();
       Shape rectangle = shapeFactory.getShape("RECTANGLE");
       rectangle.draw();
       Shape square = shapeFactory.getShape("SQUARE");
       square.draw();
   }


}
