package com.lihui.practice.mapepr;

import com.lihui.practice.entity.Teacher;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PoiMapper {

    @Override
    public List<Teacher> getTeachers() {
        List<Teacher> classmateList= new ArrayList<>();
        classmateList.add(new Teacher("1","张三","1","123456"));
        classmateList.add(new Teacher("2","李四","1","123456"));
        classmateList.add(new Teacher("3","王五","2","123456"));
        classmateList.add(new Teacher("4","赵六","2","123456"));
        classmateList.add(new Teacher("5","周八","3","123456"));
        return classmateList;
    }
}
