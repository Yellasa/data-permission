package com.farpower.datapermission.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.farpower.datapermission.dao.OrganizationInfoMapper;
import com.farpower.datapermission.service.OrgService;
import com.farpower.himalayas.organ.model.OrganizationInfo;
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
public class OrgServiceImpl extends ServiceImpl<OrganizationInfoMapper,OrganizationInfo> implements OrgService
{
    @Override
    public List<OrganizationInfo> getRootOrgan()
    {
        return baseMapper.getRootOrgan();
    }

    @Override
    public List<OrganizationInfo> getRootOrganByTenant(Long tenantId)
    {
        return baseMapper.getRootOrganByTenant(tenantId);
    }

    @Override
    public List<OrganizationInfo> getChildrenOrganList(Long pid)
    {
        return baseMapper.getChildrenOrganList(pid);
    }

    @Override
    public List<OrganizationInfo> getAllChildrenOrganListByCode(String code)
    {
        return baseMapper.getAllChildrenOrganListByCode(code);
    }
}
