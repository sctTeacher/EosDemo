package com.zm.model;

import java.math.BigDecimal;
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
@TableName("wfmultitenancy")
public class Wfmultitenancy extends Model<Wfmultitenancy> {

    private static final long serialVersionUID = 1L;

    @TableId("TENANT_ID")
    private String tenantId;
    @TableField("TENANTNAME")
    private String tenantname;
    @TableField("ORGANIZATIONCLASS")
    private String organizationclass;
    @TableField("PERMISSIONCLASS")
    private String permissionclass;
    @TableField("ADMINNAME")
    private String adminname;
    @TableField("ADMINPWD")
    private String adminpwd;
    @TableField("CREATETIME")
    private String createtime;
    @TableField("UPDATETIME")
    private String updatetime;
    @TableField("TOKEN")
    private String token;
    @TableField("BINDDATASOURCEFLAG")
    private String binddatasourceflag;
    @TableField("DATASOURCE")
    private String datasource;
    @TableField("EXTEND1")
    private String extend1;
    @TableField("EXTEND2")
    private String extend2;
    @TableField("EXTEND3")
    private String extend3;
    @TableField("EXTEND4")
    private BigDecimal extend4;
    @TableField("EXTEND5")
    private BigDecimal extend5;


    @Override
    protected Serializable pkVal() {
        return this.tenantId;
    }

}
