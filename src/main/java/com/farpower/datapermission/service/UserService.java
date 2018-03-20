package com.farpower.datapermission.service;

import com.baomidou.mybatisplus.service.IService;
import com.farpower.himalayas.organ.model.User;

public interface UserService extends IService<User>
{
    User getByAge(Integer age);
}
