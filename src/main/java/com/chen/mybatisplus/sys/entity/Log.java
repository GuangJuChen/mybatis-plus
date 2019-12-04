package com.chen.mybatisplus.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 日志表
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@TableName("sys_log")
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志类型
     */
    @TableField("type")
    private String type;

    /**
     * 日志标题
     */
    @TableField("title")
    private String title;

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
     * 操作IP地址
     */
    @TableField("remote_addr")
    private String remoteAddr;

    /**
     * 用户代理
     */
    @TableField("user_agent")
    private String userAgent;

    /**
     * 请求URI
     */
    @TableField("request_uri")
    private String requestUri;

    /**
     * 操作方式
     */
    @TableField("method")
    private String method;

    /**
     * 操作提交的数据
     */
    @TableField("params")
    private String params;

    /**
     * 异常信息
     */
    @TableField("exception")
    private String exception;

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
    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }
    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    @Override
    public String toString() {
        return "Log{" +
            "type=" + type +
            ", title=" + title +
            ", createBy=" + createBy +
            ", createDate=" + createDate +
            ", remoteAddr=" + remoteAddr +
            ", userAgent=" + userAgent +
            ", requestUri=" + requestUri +
            ", method=" + method +
            ", params=" + params +
            ", exception=" + exception +
        "}";
    }
}
