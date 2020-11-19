package com.lihui.practice.service.impl;

import com.lihui.practice.entity.User;
import com.lihui.practice.mapper.PoiMapper;
import com.lihui.practice.service.PoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoiServiceImpl implements PoiService {
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
        List<User> userList = poiMapper.queryUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
