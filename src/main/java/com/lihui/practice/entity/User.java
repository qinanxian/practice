package com.lihui.practice.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable,Cloneable{
    /** ID */
    @Id
    @GeneratedValue
    private Integer id ;
    /** 姓名 */
    private String name ;
    /** 身份证号 */
    private String idnummber ;
    /** 出生年月 */
    private Date brithday ;
    /** 乐观锁 */
    private Integer revision ;
    /** 创建人 */
    private String createdBy ;
    /** 创建时间 */
    private Date createdTime ;
    /** 更新人 */
    private String updatedBy ;
    /** 更新时间 */
    private Date updatedTime ;
}
