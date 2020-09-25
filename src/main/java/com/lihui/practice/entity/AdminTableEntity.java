package com.lihui.practice.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@Table(name = "ADMIN_TABLE")
public class AdminTableEntity implements Serializable, Cloneable {
    /**  */
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 账号
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
