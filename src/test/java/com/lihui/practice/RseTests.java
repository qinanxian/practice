package com.lihui.practice;

import com.lihui.practice.config.Rsa;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.KeyPair;

@Component
public class RseTests {

    @Autowired
    Rsa rsa;

    private static final String KEY = "11111111111111111111111111111111";

    @Value("${encrypt-jsk.location}")
    String location;
    @Value("${encrypt-jsk.name}")
    String name;
    @Value("${encrypt-jsk.password}")
    String password;

    /**
     * 测试加解密方法
     *
     * @throws Exception
     */
    @Test
    public void rseTets() throws Exception {

        //生成密钥对，一般生成之后可以放到配置文件中
        KeyPair keyPair = rsa.getKeyPair("1111111111");
        //公钥
        String publicKey = rsa.getPublicKey(keyPair);
        //私钥
        String privateKey = rsa.getPrivateKey(keyPair);

        System.out.println("公钥：\n" + publicKey);
        System.out.println("私钥：\n" + privateKey);

        String data = "RSA 加解密测试!";
        {
            System.out.println("\n===========私钥加密，公钥解密==============");
            String s1 = rsa.encryptByPrivateKey(data, privateKey);
            System.out.println("加密后的数据:" + s1);
            String s2 = rsa.decryptByPublicKey(s1, publicKey);
            System.out.println("解密后的数据:" + s2 + "\n\n");
        }

        {
            System.out.println("\n===========公钥加密，私钥解密==============");
            String s1 = rsa.encryptByPublicKey(data, publicKey);
            System.out.println("加密后的数据:" + s1);
            String s2 = rsa.decryptByPrivateKey(s1, privateKey);
            System.out.println("解密后的数据:" + s2 + "\n\n");
        }

    }
}
