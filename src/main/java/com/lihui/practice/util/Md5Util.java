package com.lihui.practice.util;

import org.springframework.stereotype.Component;
import sun.misc.BASE64Encoder;

import java.security.MessageDigest;

@Component
public class Md5Util {

    private static final String MD5 = "md5";
    private static final String CHARESNAME = "utf-8";

    /**
     * md5加密
     *
     * @param str     需要的加密字符串
     * @param isUpper 字母大小写 （fales为小写，true为大写）
     * @param bit     加密的位数 （16，32，64）
     * @return 返回的加密信息
     */
    public static String getMd5(String str, boolean isUpper, Integer bit) {
        String md5 = null;
        try {
            //返回实现指定摘要算法的 MessageDigest 对象。
            //用于MD5加密的
            MessageDigest instance = MessageDigest.getInstance(MD5);
            if (bit == 64) {
                BASE64Encoder base64Encoder = new BASE64Encoder();
                md5 = base64Encoder.encode(instance.digest(str.getBytes(CHARESNAME)));
            } else {
                // 计算MD5函数
                instance.update(str.getBytes());
                byte[] digest = instance.digest();
                int i;
                StringBuilder stringBuilder = new StringBuilder();
                for (byte b : digest) {
                    i = b;
                    if (i < 0) {
                        i += 256;
                    }
                    if (i < 16) {
                        stringBuilder.append("0");
                    }
                    stringBuilder.append(Integer.toHexString(i));
                }
                md5 = stringBuilder.toString();
                if (bit == 16) {
                    //截取32位md5为16位
                    md5 = md5.substring(8, 24);
                    //转换为大写
                    if (isUpper) {
                        md5 = md5.toUpperCase();
                    }
                    return md5;
                }
            }
            //转换为大写
            if (isUpper) {
                md5 = md5.toUpperCase();
            }
        } catch (Exception e) {

        }
        return md5;
    }
}
