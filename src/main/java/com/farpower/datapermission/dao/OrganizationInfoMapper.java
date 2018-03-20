package com.farpower.datapermission.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.farpower.himalayas.organ.model.OrganizationInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 组织信息Dao
 *
 * @ClassName: OrganizationInfoMapper
 * @Author: yangting@ty
 * @CreateDate: 2018/3/20 13:55
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/3/20 13:55
 * @UpdateRemark: 更新说明
 **/
@Repository
public interface OrganizationInfoMapper extends BaseMapper<OrganizationInfo>
{
    List<OrganizationInfo> getRootOrgan();

    List<OrganizationInfo> getRootOrganByTenant(Long tenantId);

    List<OrganizationInfo> getChildrenOrganList(Long pid);


    List<OrganizationInfo> getAllChildrenOrganListByCode(String code);

}
