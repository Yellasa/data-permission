package com.farpower.datapermission.annotation.bean;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.Version;
import com.farpower.datapermission.annotation.DataAuthAnnotation;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 机构信息表
 * </p>
 *
 * @author xiaoshenbo
 * @since 2018-03-15
 */
@TableName("fp_organization_info")
@DataAuthAnnotation
public class OrganizationInfoTest implements Serializable {

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

	/**
	 * hibernate 版本控制
	 */
	@Version
	private Integer version;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 父机构id
	 */
	@TableField("parent_id")
	private Long parentId;
	/**
	 * 编码
	 */
	private String code;
	/**
	 * 机构职能
	 */
	private String duty;
	/**
	 * 机构类型
	 */
	private String type;
	/**
	 * 租户id
	 */
	@TableField("tenant_id")
	private Long tenantId;
	/**
	 * 租户机构负责人
	 */
	@TableField("persson_liable")
	private String perssonLiable;
	/**
	 * 是否启用
	 */
	private Boolean enabled;
	/**
	 * 备注
	 */
	private String remark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public String getPerssonLiable() {
		return perssonLiable;
	}

	public void setPerssonLiable(String perssonLiable) {
		this.perssonLiable = perssonLiable;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
