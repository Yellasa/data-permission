package com.farpower.datapermission.annotation.util;

import com.farpower.datapermission.annotation.DataAuthAnnotation;

import java.lang.reflect.Field;

/**
 * 注解的帮助类
 *
 * @ClassName: SortableField
 * @Author: yangting@ty
 * @CreateDate: 2018/3/20 18:08
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/3/20 18:08
 * @UpdateRemark: 更新说明
 **/
public class SortableField
{

    public SortableField(){}

    public SortableField(DataAuthAnnotation meta, Field field) {
        super();
        this.meta = meta;
        this.field = field;
        this.name=field.getName();
        this.type=field.getType();
    }


    public SortableField(DataAuthAnnotation meta, String name, Class<?> type) {
        super();
        this.meta = meta;
        this.name = name;
        this.type = type;
    }


    private DataAuthAnnotation meta;
    private Field field;
    private String name;
    private Class<?> type;

    public DataAuthAnnotation getMeta() {
        return meta;
    }
    public void setMeta(DataAuthAnnotation meta) {
        this.meta = meta;
    }
    public Field getField() {
        return field;
    }
    public void setField(Field field) {
        this.field = field;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Class<?> getType() {
        return type;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }

}
