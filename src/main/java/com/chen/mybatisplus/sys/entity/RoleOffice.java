package com.chen.mybatisplus.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 角色-机构
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@TableName("sys_role_office")
public class RoleOffice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色编号
     */
    @TableId("role_id")
    private String roleId;

    /**
     * 机构编号
     */
    @TableField("office_id")
    private String officeId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    @Override
    public String toString() {
        return "RoleOffice{" +
            "roleId=" + roleId +
            ", officeId=" + officeId +
        "}";
    }
}
