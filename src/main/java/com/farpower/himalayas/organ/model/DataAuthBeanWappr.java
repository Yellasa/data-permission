package com.farpower.himalayas.organ.model;

/**
 * 权限数据的包装bean，用于多表查询或指定字段
 *
 * @ClassName: DataAuthBeanWappr
 * @Author: yangting@ty
 * @CreateDate: 2018/3/20 17:49
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/3/20 17:49
 * @UpdateRemark: 更新说明
 **/
public class DataAuthBeanWappr
{
    //替换的表
    private  String table;
    //替换的字段
    private  String field;

    public DataAuthBeanWappr()
    {
    }

    public DataAuthBeanWappr(String table, String field)
    {
        this.table = table;
        this.field = field;
    }

    public String getTable()
    {
        return table;
    }

    public void setTable(String table)
    {
        this.table = table;
    }

    public String getField()
    {
        return field;
    }

    public void setField(String field)
    {
        this.field = field;
    }

    @Override
    public String toString()
    {
        return "DataAuthBeanWappr{" +
                "table='" + table + '\'' +
                ", field='" + field + '\'' +
                '}';
    }
}
