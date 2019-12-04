package com.chen.mybatisplus.sys.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 机构表
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@TableName("sys_office")
public class Office implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 父级编号
     */
    @TableField("parent_id")
    private String parentId;

    /**
     * 所有父级编号
     */
    @TableField("parent_ids")
    private String parentIds;

    /**
     * 名称
     */
    @TableField("name")
    private String name;

    /**
     * 排序
     */
    @TableField("sort")
    private BigDecimal sort;

    /**
     * 归属区域
     */
    @TableField("area_id")
    private String areaId;

    /**
     * 区域编码
     */
    @TableField("code")
    private String code;

    /**
     * 机构类型
     */
    @TableField("type")
    private String type;

    /**
     * 机构等级
     */
    @TableField("grade")
    private String grade;

    /**
     * 联系地址
     */
    @TableField("address")
    private String address;

    /**
     * 邮政编码
     */
    @TableField("zip_code")
    private String zipCode;

    /**
     * 负责人
     */
    @TableField("master")
    private String master;

    /**
     * 电话
     */
    @TableField("phone")
    private String phone;

    /**
     * 传真
     */
    @TableField("fax")
    private String fax;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 是否启用
     */
    @TableField("USEABLE")
    private String useable;

    /**
     * 主负责人
     */
    @TableField("PRIMARY_PERSON")
    private String primaryPerson;

    /**
     * 副负责人
     */
    @TableField("DEPUTY_PERSON")
    private String deputyPerson;

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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getSort() {
        return sort;
    }

    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }
    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getUseable() {
        return useable;
    }

    public void setUseable(String useable) {
        this.useable = useable;
    }
    public String getPrimaryPerson() {
        return primaryPerson;
    }

    public void setPrimaryPerson(String primaryPerson) {
        this.primaryPerson = primaryPerson;
    }
    public String getDeputyPerson() {
        return deputyPerson;
    }

    public void setDeputyPerson(String deputyPerson) {
        this.deputyPerson = deputyPerson;
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
        return "Office{" +
            "parentId=" + parentId +
            ", parentIds=" + parentIds +
            ", name=" + name +
            ", sort=" + sort +
            ", areaId=" + areaId +
            ", code=" + code +
            ", type=" + type +
            ", grade=" + grade +
            ", address=" + address +
            ", zipCode=" + zipCode +
            ", master=" + master +
            ", phone=" + phone +
            ", fax=" + fax +
            ", email=" + email +
            ", useable=" + useable +
            ", primaryPerson=" + primaryPerson +
            ", deputyPerson=" + deputyPerson +
            ", createBy=" + createBy +
            ", createDate=" + createDate +
            ", updateBy=" + updateBy +
            ", updateDate=" + updateDate +
            ", remarks=" + remarks +
            ", delFlag=" + delFlag +
        "}";
    }
}
