package com.chen.mybatisplus.oa.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 通知通告
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@TableName("oa_notify")
public class Notify implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 类型
     */
    @TableField("type")
    private String type;

    /**
     * 标题
     */
    @TableField("title")
    private String title;

    /**
     * 内容
     */
    @TableField("content")
    private String content;

    /**
     * 附件
     */
    @TableField("files")
    private String files;

    /**
     * 状态
     */
    @TableField("status")
    private String status;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return "Notify{" +
            "type=" + type +
            ", title=" + title +
            ", content=" + content +
            ", files=" + files +
            ", status=" + status +
            ", createBy=" + createBy +
            ", createDate=" + createDate +
            ", updateBy=" + updateBy +
            ", updateDate=" + updateDate +
            ", remarks=" + remarks +
            ", delFlag=" + delFlag +
        "}";
    }
}
