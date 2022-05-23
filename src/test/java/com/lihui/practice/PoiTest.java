package com.lihui.practice;
import com.lihui.practice.service.PoiService;
import com.mysql.jdbc.log.LogFactory;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PoiTest {
    private static Logger logger=LoggerFactory.getLogger(PoiTest.class);
    @Autowired
    PoiService poiService;

//   @Test
//    void Test(){
//        poiService.downLoadExcel();
//    }

}
