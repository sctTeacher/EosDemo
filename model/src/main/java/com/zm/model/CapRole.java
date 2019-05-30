package com.zm.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangfy
 * @since 2019-05-30
 */
@Data
@Accessors(chain = true)
@TableName("cap_role")
public class CapRole extends Model<CapRole> {

    private static final long serialVersionUID = 1L;

    @TableId("ROLE_ID")
    private String roleId;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("ROLE_CODE")
    private String roleCode;
    @TableField("ROLE_NAME")
    private String roleName;
    @TableField("ROLE_DESC")
    private String roleDesc;
    @TableField("CREATEUSER")
    private String createuser;
    @TableField("CREATETIME")
    private Date createtime;


    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }

}
