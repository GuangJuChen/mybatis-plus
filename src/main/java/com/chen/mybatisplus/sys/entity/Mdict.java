package com.chen.mybatisplus.sys.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 多级字典表
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@TableName("sys_mdict")
public class Mdict implements Serializable {

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
     * 描述
     */
    @TableField("description")
    private String description;

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
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "Mdict{" +
            "parentId=" + parentId +
            ", parentIds=" + parentIds +
            ", name=" + name +
            ", sort=" + sort +
            ", description=" + description +
            ", createBy=" + createBy +
            ", createDate=" + createDate +
            ", updateBy=" + updateBy +
            ", updateDate=" + updateDate +
            ", remarks=" + remarks +
            ", delFlag=" + delFlag +
        "}";
    }
}
