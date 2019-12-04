package com.chen.mybatisplus.oa.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 请假流程表
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@TableName("oa_leave")
public class Leave implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 流程实例编号
     */
    @TableField("process_instance_id")
    private String processInstanceId;

    /**
     * 开始时间
     */
    @TableField("start_time")
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    @TableField("end_time")
    private LocalDateTime endTime;

    /**
     * 请假类型
     */
    @TableField("leave_type")
    private String leaveType;

    /**
     * 请假理由
     */
    @TableField("reason")
    private String reason;

    /**
     * 申请时间
     */
    @TableField("apply_time")
    private LocalDateTime applyTime;

    /**
     * 实际开始时间
     */
    @TableField("reality_start_time")
    private LocalDateTime realityStartTime;

    /**
     * 实际结束时间
     */
    @TableField("reality_end_time")
    private LocalDateTime realityEndTime;

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

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    public LocalDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(LocalDateTime applyTime) {
        this.applyTime = applyTime;
    }
    public LocalDateTime getRealityStartTime() {
        return realityStartTime;
    }

    public void setRealityStartTime(LocalDateTime realityStartTime) {
        this.realityStartTime = realityStartTime;
    }
    public LocalDateTime getRealityEndTime() {
        return realityEndTime;
    }

    public void setRealityEndTime(LocalDateTime realityEndTime) {
        this.realityEndTime = realityEndTime;
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
        return "Leave{" +
            "processInstanceId=" + processInstanceId +
            ", startTime=" + startTime +
            ", endTime=" + endTime +
            ", leaveType=" + leaveType +
            ", reason=" + reason +
            ", applyTime=" + applyTime +
            ", realityStartTime=" + realityStartTime +
            ", realityEndTime=" + realityEndTime +
            ", createBy=" + createBy +
            ", createDate=" + createDate +
            ", updateBy=" + updateBy +
            ", updateDate=" + updateDate +
            ", remarks=" + remarks +
            ", delFlag=" + delFlag +
        "}";
    }
}
