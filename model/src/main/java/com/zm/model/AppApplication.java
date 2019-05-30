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
@TableName("app_application")
public class AppApplication extends Model<AppApplication> {

    private static final long serialVersionUID = 1L;

    @TableId("APPID")
    private BigDecimal appid;
    @TableField("APPCODE")
    private String appcode;
    @TableField("APPNAME")
    private String appname;
    @TableField("APPTYPE")
    private String apptype;
    @TableField("ISOPEN")
    private String isopen;
    @TableField("OPENDATE")
    private Date opendate;
    @TableField("URL")
    private String url;
    @TableField("APPDESC")
    private String appdesc;
    @TableField("MAINTENANCE")
    private BigDecimal maintenance;
    @TableField("MANAROLE")
    private String manarole;
    @TableField("DEMO")
    private String demo;
    @TableField("INIWP")
    private String iniwp;
    @TableField("INTASKCENTER")
    private String intaskcenter;
    @TableField("IPADDR")
    private String ipaddr;
    @TableField("IPPORT")
    private String ipport;
    @TableField("APP_ID")
    private String appId;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("PROTOCOL_TYPE")
    private String protocolType;


    @Override
    protected Serializable pkVal() {
        return this.appid;
    }

}
