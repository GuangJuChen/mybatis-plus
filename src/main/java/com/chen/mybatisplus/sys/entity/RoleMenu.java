package com.chen.mybatisplus.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 角色-菜单
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@TableName("sys_role_menu")
public class RoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色编号
     */
    @TableId("role_id")
    private String roleId;

    /**
     * 菜单编号
     */
    @TableField("menu_id")
    private String menuId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "RoleMenu{" +
            "roleId=" + roleId +
            ", menuId=" + menuId +
        "}";
    }
}
