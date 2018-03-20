package com.farpower.datapermission.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.farpower.datapermission.dao.ResourceInfoMapper;
import com.farpower.datapermission.service.ResourceInfoService;
import com.farpower.himalayas.organ.model.ResourceInfo;
import org.springframework.stereotype.Service;

/**
 * 资源服务接口
 *
 * @ClassName: ResourceInfoServiceImpl
 * @Author: yangting@ty
 * @CreateDate: 2018/3/20 14:33
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/3/20 14:33
 * @UpdateRemark: 更新说明
 **/
@Service
public class ResourceInfoServiceImpl extends ServiceImpl<ResourceInfoMapper,ResourceInfo> implements ResourceInfoService
{
    public ResourceInfo selectByCode(String code){
        return  baseMapper.selectByCode(code);
    }
}
