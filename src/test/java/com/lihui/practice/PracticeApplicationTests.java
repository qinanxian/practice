package com.lihui.practice;

import com.lihui.practice.factory.AbstractFactory;
import com.lihui.practice.factory.ShapeFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PracticeApplicationTests {

   @Autowired
   ShapeFactory shapeFactory;

   @Test
   public static AbstractFactory getFactory(String choice){
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
      } else if(choice.equalsIgnoreCase("COLOR")){

      }
      return null;
   }


}
