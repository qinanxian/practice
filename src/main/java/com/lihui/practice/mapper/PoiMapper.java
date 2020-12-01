package com.lihui.practice.mapper;

import com.lihui.practice.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;


@Mapper
public interface PoiMapper {
//    @Select("select * from user")
    List<User> queryUserList();
}
