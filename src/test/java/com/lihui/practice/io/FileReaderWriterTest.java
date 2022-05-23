package com.lihui.practice.io;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
@SpringBootTest
public class FileReaderWriterTest {
     /*
    将D:\IoTest下的hello.txt文件内容读入程序中，并输出到控制台

    说明点：
    1. read()的理解：返回读入的一个字符。如果达到文件末尾，返回-1
    2. 异常的处理：为了保证流资源一定可以执行关闭操作。需要使用try-catch-finally处理
    3. 读入的文件一定要存在，否则就会报FileNotFoundException。
     */
    @Test
    public void testFileReader() {
        //实例化节点流
        FileReader fileReader = null;
        try {
            //1.实例化File类的对象，指明要操作的文件
            File file = new File("D:\\IoTest\\hello.txt");//获取D:\IoTest\hello.txt文件
            fileReader = new FileReader(file);
            int len;
            //读取字符如果=-1就说明读取完整个文件的内容
            while ((len=fileReader.read())!=-1){
                System.out.print((char) len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fileReader!=null){
                    //关闭流
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
