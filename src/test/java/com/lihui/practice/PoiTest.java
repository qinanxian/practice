package com.lihui.practice;
import com.lihui.practice.service.PoiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PoiTest {
   @Autowired
    PoiService poiService;

   @Test
    void Test(){
        poiService.downLoadExcel();
    }
}
