package com.lihui.practice.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

public interface PoiService {
    /**
     * 上传/导入
     * @param
     * @return
     */
    void fileUpload();

    /**
     * 下载/导出
     * @param
     */
    void downLoadExcel();
}
