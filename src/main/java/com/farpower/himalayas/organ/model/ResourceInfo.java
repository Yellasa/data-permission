package com.farpower.himalayas.organ.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.Version;
import com.farpower.datapermission.annotation.DataAuthAnnotation;

import java.io.Serializable;
import java.util.Date;

/**
 * 资源Bean
 * @ClassName: ResourceInfo
 * @Author: yangting@ty
 * @CreateDate: 2018/3/20 14:14
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/3/20 14:14
 * @UpdateRemark: 更新说明
 **/
@TableName("fp_resource_info")
@DataAuthAnnotation
public class ResourceInfo implements Serializable
{
    private static final long serialVersionUID = 1L;
    /**
     * 删除状态
     */
    public static final Boolean DELETED = true;


    /**
     * 主键
     */
    @TableId
    private Long id;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 创建人机构
     */
    @TableField("create_org")
    private String createOrg;
    /**
     * 创建者
     */
    @TableField("create_by")
    private String createBy;
    /**
     * 是否删除
     */
    private Boolean deleted = !DELETED;
    /**
     * 修改者 只保留最后一次
     */
    @TableField("update_by")
    private String updateBy;

    /**
     * 更新人机构
     */
    @TableField("update_org")
    private String updateOrg;


    @TableField("name")
    private String name;

    @TableField("application_id")
    private String applicationId;

    @TableField("code")
    private String code;
    /**
     * hibernate 版本控制
     */
    @Version
    private Integer version;

    /**
     * 是否启用
     */
    private Boolean enabled;

    public static Boolean getDELETED()
    {
        return DELETED;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }

    public String getCreateOrg()
    {
        return createOrg;
    }

    public void setCreateOrg(String createOrg)
    {
        this.createOrg = createOrg;
    }

    public String getCreateBy()
    {
        return createBy;
    }

    public void setCreateBy(String createBy)
    {
        this.createBy = createBy;
    }

    public Boolean getDeleted()
    {
        return deleted;
    }

    public void setDeleted(Boolean deleted)
    {
        this.deleted = deleted;
    }

    public String getUpdateBy()
    {
        return updateBy;
    }

    public void setUpdateBy(String updateBy)
    {
        this.updateBy = updateBy;
    }

    public String getUpdateOrg()
    {
        return updateOrg;
    }

    public void setUpdateOrg(String updateOrg)
    {
        this.updateOrg = updateOrg;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getApplicationId()
    {
        return applicationId;
    }

    public void setApplicationId(String applicationId)
    {
        this.applicationId = applicationId;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public Boolean getEnabled()
    {
        return enabled;
    }

    public void setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
    }

    @Override
    public String toString()
    {
        return "ResourceInfo{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createOrg='" + createOrg + '\'' +
                ", createBy='" + createBy + '\'' +
                ", deleted=" + deleted +
                ", updateBy='" + updateBy + '\'' +
                ", updateOrg='" + updateOrg + '\'' +
                ", name='" + name + '\'' +
                ", applicationId='" + applicationId + '\'' +
                ", code='" + code + '\'' +
                ", version=" + version +
                ", enabled=" + enabled +
                '}';
    }
}
