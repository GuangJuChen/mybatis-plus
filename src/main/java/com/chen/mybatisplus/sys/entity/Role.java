package com.chen.mybatisplus.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@TableName("sys_role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 归属机构
     */
    @TableField("office_id")
    private String officeId;

    /**
     * 角色名称
     */
    @TableField("name")
    private String name;

    /**
     * 英文名称
     */
    @TableField("enname")
    private String enname;

    /**
     * 角色类型
     */
    @TableField("role_type")
    private String roleType;

    /**
     * 数据范围
     */
    @TableField("data_scope")
    private String dataScope;

    /**
     * 是否系统数据
     */
    @TableField("is_sys")
    private String isSys;

    /**
     * 是否可用
     */
    @TableField("useable")
    private String useable;

    /**
     * 创建者
     */
    @TableField("create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField("create_date")
    private LocalDateTime createDate;

    /**
     * 更新者
     */
    @TableField("update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField("update_date")
    private LocalDateTime updateDate;

    /**
     * 备注信息
     */
    @TableField("remarks")
    private String remarks;

    /**
     * 删除标记
     */
    @TableField("del_flag")
    private String delFlag;

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }
    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }
    public String getDataScope() {
        return dataScope;
    }

    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }
    public String getIsSys() {
        return isSys;
    }

    public void setIsSys(String isSys) {
        this.isSys = isSys;
    }
    public String getUseable() {
        return useable;
    }

    public void setUseable(String useable) {
        this.useable = useable;
    }
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "Role{" +
            "officeId=" + officeId +
            ", name=" + name +
            ", enname=" + enname +
            ", roleType=" + roleType +
            ", dataScope=" + dataScope +
            ", isSys=" + isSys +
            ", useable=" + useable +
            ", createBy=" + createBy +
            ", createDate=" + createDate +
            ", updateBy=" + updateBy +
            ", updateDate=" + updateDate +
            ", remarks=" + remarks +
            ", delFlag=" + delFlag +
        "}";
    }
}
