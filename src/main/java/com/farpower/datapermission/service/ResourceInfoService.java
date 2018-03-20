package com.farpower.datapermission.service;

import com.baomidou.mybatisplus.service.IService;
import com.farpower.himalayas.organ.model.ResourceInfo;

public interface ResourceInfoService extends IService<ResourceInfo>
{
    ResourceInfo selectByCode(String code);
}
