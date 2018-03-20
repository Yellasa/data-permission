package com.farpower.datapermission.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.farpower.datapermission.dao.UserMapper;
import com.farpower.datapermission.service.UserService;
import com.farpower.himalayas.organ.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 组织服务实现
 *
 * @ClassName: OrgServiceImpl
 * @Author: yangting@ty
 * @CreateDate: 2018/3/20 14:29
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/3/20 14:29
 * @UpdateRemark: 更新说明
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService
{

    @Override
    public User getByAge(Integer age)
    {
        return baseMapper.selectByAge(age);
    }
}
