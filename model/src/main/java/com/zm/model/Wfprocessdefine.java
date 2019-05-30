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
@TableName("wfprocessdefine")
public class Wfprocessdefine extends Model<Wfprocessdefine> {

    private static final long serialVersionUID = 1L;

    @TableId("PROCESSDEFID")
    private BigDecimal processdefid;
    @TableField("PROCESSDEFNAME")
    private String processdefname;
    @TableField("PROCESSCHNAME")
    private String processchname;
    @TableField("DESCRIPTION")
    private String description;
    @TableField("CURRENTSTATE")
    private BigDecimal currentstate;
    @TableField("VERSIONSIGN")
    private String versionsign;
    @TableField("VERSIONDESC")
    private String versiondesc;
    @TableField("CURRENTFLAG")
    private String currentflag;
    @TableField("PROCESSDEFCONTENT")
    private String processdefcontent;
    @TableField("CREATETIME")
    private Date createtime;
    @TableField("UPDATETIME")
    private Date updatetime;
    @TableField("OPERATOR")
    private String operator;
    @TableField("PROCESSDEFOWNER")
    private String processdefowner;
    @TableField("PACKAGEID")
    private String packageid;
    @TableField("PACKAGENAME")
    private String packagename;
    @TableField("HASACTIVEINSTANCE")
    private String hasactiveinstance;
    @TableField("EXTEND1")
    private String extend1;
    @TableField("EXTEND2")
    private String extend2;
    @TableField("EXTEND3")
    private String extend3;
    @TableField("EXTEND4")
    private String extend4;
    @TableField("EXTEND5")
    private String extend5;
    @TableField("EXTEND6")
    private String extend6;
    @TableField("EXTEND7")
    private BigDecimal extend7;
    @TableField("CATALOGUUID")
    private String cataloguuid;
    @TableField("TENANT_ID")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.processdefid;
    }

}
