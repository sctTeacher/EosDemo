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
@TableName("cap_user")
public class CapUser extends Model<CapUser> {

    private static final long serialVersionUID = 1L;

    @TableId("OPERATOR_ID")
    private BigDecimal operatorId;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("USER_ID")
    private String userId;
    @TableField("PASSWORD")
    private String password;
    @TableField("INVALDATE")
    private Date invaldate;
    @TableField("USER_NAME")
    private String userName;
    @TableField("AUTHMODE")
    private String authmode;
    @TableField("STATUS")
    private String status;
    @TableField("UNLOCKTIME")
    private Date unlocktime;
    @TableField("MENUTYPE")
    private String menutype;
    @TableField("LASTLOGIN")
    private Date lastlogin;
    @TableField("ERRCOUNT")
    private BigDecimal errcount;
    @TableField("STARTDATE")
    private Date startdate;
    @TableField("ENDDATE")
    private Date enddate;
    @TableField("VALIDTIME")
    private String validtime;
    @TableField("MACCODE")
    private String maccode;
    @TableField("IPADDRESS")
    private String ipaddress;
    @TableField("EMAIL")
    private String email;
    @TableField("CREATEUSER")
    private String createuser;
    @TableField("CREATETIME")
    private Date createtime;


    @Override
    protected Serializable pkVal() {
        return this.operatorId;
    }

}
