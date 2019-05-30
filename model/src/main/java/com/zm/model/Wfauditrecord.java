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
@TableName("wfauditrecord")
public class Wfauditrecord extends Model<Wfauditrecord> {

    private static final long serialVersionUID = 1L;

    @TableId("AUDITRECORDID")
    private BigDecimal auditrecordid;
    @TableField("UNIQUEID")
    private String uniqueid;
    @TableField("LOGOCCASION")
    private String logoccasion;
    @TableField("ACTIONTYPE")
    private String actiontype;
    @TableField("ACTIONNAME")
    private String actionname;
    @TableField("USERNAME")
    private String username;
    @TableField("CREATETIME")
    private Date createtime;
    @TableField("IPADDRESS")
    private String ipaddress;
    @TableField("OPTIONLEVEL")
    private String optionlevel;
    @TableField("PROCESSDEFINEID")
    private BigDecimal processdefineid;
    @TableField("PROCESSINSTID")
    private BigDecimal processinstid;
    @TableField("ACTIVITYINSTID")
    private BigDecimal activityinstid;
    @TableField("WORKITEMID")
    private BigDecimal workitemid;
    @TableField("MESSAGE")
    private String message;
    @TableField("PARENTPROCINSTID")
    private BigDecimal parentprocinstid;
    @TableField("TENANT_ID")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.auditrecordid;
    }

}
