package com.farpower.datapermission.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.farpower.himalayas.organ.model.User;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User>
{

    @Select("select * from user where age = #{age}")
    @Results({
    })
    User selectByAge(Integer age);
}
