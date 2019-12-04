package com.chen.mybatisplus.oa.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 通知通告发送记录
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@TableName("oa_notify_record")
public class NotifyRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 通知通告ID
     */
    @TableField("oa_notify_id")
    private String oaNotifyId;

    /**
     * 接受人
     */
    @TableField("user_id")
    private String userId;

    /**
     * 阅读标记
     */
    @TableField("read_flag")
    private String readFlag;

    /**
     * 阅读时间
     */
    @TableField("read_date")
    private LocalDate readDate;

    public String getOaNotifyId() {
        return oaNotifyId;
    }

    public void setOaNotifyId(String oaNotifyId) {
        this.oaNotifyId = oaNotifyId;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getReadFlag() {
        return readFlag;
    }

    public void setReadFlag(String readFlag) {
        this.readFlag = readFlag;
    }
    public LocalDate getReadDate() {
        return readDate;
    }

    public void setReadDate(LocalDate readDate) {
        this.readDate = readDate;
    }

    @Override
    public String toString() {
        return "NotifyRecord{" +
            "oaNotifyId=" + oaNotifyId +
            ", userId=" + userId +
            ", readFlag=" + readFlag +
            ", readDate=" + readDate +
        "}";
    }
}
