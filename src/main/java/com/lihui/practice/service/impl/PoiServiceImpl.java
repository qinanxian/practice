package com.lihui.practice.service.impl;

import com.lihui.practice.service.PoiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

public class PoiServiceImpl implements PoiService {
    @Override
    public ResponseEntity fileUpload(MultipartFile file) {
        return null;
    }

    @Override
    public void downLoadExcel(HttpServletResponse response) {

    }
}
