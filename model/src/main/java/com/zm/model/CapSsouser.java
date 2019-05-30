package com.zm.model;

import java.math.BigDecimal;
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
@TableName("cap_ssouser")
public class CapSsouser extends Model<CapSsouser> {

    private static final long serialVersionUID = 1L;

    @TableId("OPERATOR_ID")
    private String operatorId;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("USER_ID")
    private String userId;
    @TableField("PASSWORD")
    private String password;
    @TableField("USER_NAME")
    private String userName;
    @TableField("EMAIL")
    private String email;
    @TableField("STATUS")
    private String status;
    @TableField("UNLOCKTIME")
    private Date unlocktime;
    @TableField("LASTLOGIN")
    private Date lastlogin;
    @TableField("ERRCOUNT")
    private BigDecimal errcount;
    @TableField("MACCODE")
    private String maccode;
    @TableField("IPADDRESS")
    private String ipaddress;
    @TableField("CREATEUSER")
    private String createuser;
    @TableField("CREATETIME")
    private Date createtime;


    @Override
    protected Serializable pkVal() {
        return this.operatorId;
    }

}
