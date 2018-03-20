package com.farpower.datapermission.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.farpower.himalayas.organ.model.ResourceInfo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceInfoMapper extends BaseMapper<ResourceInfo>
{

    @Select("select * from fp_resource_info where code = #{code}")
    @Results({
            @Result(column="code",property="code"),
            @Result(column="create_time",property="createTime"),
            @Result(column="create_by" ,property="createBy"),
            @Result(column="create_org" ,property="createOrg"),
            @Result(column="update_by" ,property="updateBy"),
            @Result(column="update_org", property="updateOrg"),
            @Result(column="update_time" ,property="updateTime"),
            @Result(column="deleted" ,property="deleted"),
            @Result(column="enabled" ,property="enabled"),
            @Result(column="name" ,property="name"),
            @Result(column="id" ,property="id")
    })
    ResourceInfo selectByCode(String code);
}
