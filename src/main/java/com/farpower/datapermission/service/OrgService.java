package com.farpower.datapermission.service;

import com.baomidou.mybatisplus.service.IService;
import com.farpower.himalayas.organ.model.OrganizationInfo;

import java.util.List;

public interface OrgService extends IService<OrganizationInfo>
{
    List<OrganizationInfo> getRootOrgan();

    List<OrganizationInfo> getRootOrganByTenant(Long tenantId);

    List<OrganizationInfo> getChildrenOrganList(Long pid);


    List<OrganizationInfo> getAllChildrenOrganListByCode(String code);
}
