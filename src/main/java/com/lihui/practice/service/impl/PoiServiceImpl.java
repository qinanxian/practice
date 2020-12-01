package com.lihui.practice.service.impl;

import com.lihui.practice.entity.User;
import com.lihui.practice.mapper.PoiMapper;
import com.lihui.practice.service.PoiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoiServiceImpl implements PoiService {
    private static Logger logger= LoggerFactory.getLogger(PoiService.class);

    @Autowired
    PoiMapper poiMapper;


    /**
     * 上传导入
     */
    @Override
    public void fileUpload() {

    }

    /**
     * 下载导出
     */
    @Override
    public void downLoadExcel() {
        logger.info("开始下载导出的service");
        List<User> users = poiMapper.queryUserList();
        for (User user : users) {
            System.out.println(user);
        }
        logger.info("结束下载导出的service");
    }
}
