package com.farpower.himalayas.organ.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.farpower.datapermission.annotation.DataAuthAnnotation;

import java.io.Serializable;

@TableName("user")
@DataAuthAnnotation(value = "name")
public class User implements Serializable
{
    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 创建人机构
     */
    @TableField("name")
    private String name;
    /**
     * 创建者
     */
    @TableField("age")
    private Integer age;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
