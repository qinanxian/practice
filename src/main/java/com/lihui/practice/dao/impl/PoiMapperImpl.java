package com.lihui.practice.dao.impl;

import com.lihui.practice.dao.PoiMapper;

import java.util.ArrayList;
import java.util.List;

public class PoiMapperImpl implements PoiMapper {
    @Override
    public List<Teacher> poiFileUpload() {
        ArrayList<Teacher> list = new ArrayList<>();
        list.add(new Teacher("1","张三","1","123456"));
        list.add(new Teacher("2","李四","1","123456"));
        list.add(new Teacher("3","王五","2","123456"));
        list.add(new Teacher("4","赵六","2","123456"));
        list.add(new Teacher("5","周八","3","123456"));
        return list;
    }
}
