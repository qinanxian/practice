package com.lihui.practice.mapepr;

import com.lihui.practice.entity.AdminTableEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LonginMapper {
    /**
     * 用户登陆
     * @param adminTableEntity
     * @return
     */
    @Select("select username,password from admin_table where username=")
    AdminTableEntity selectAdmin(AdminTableEntity adminTableEntity);
}
