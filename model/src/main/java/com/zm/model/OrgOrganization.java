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
@TableName("org_organization")
public class OrgOrganization extends Model<OrgOrganization> {

    private static final long serialVersionUID = 1L;

    @TableId("ORGID")
    private BigDecimal orgid;
    @TableField("ORGCODE")
    private String orgcode;
    @TableField("ORGNAME")
    private String orgname;
    @TableField("ORGLEVEL")
    private BigDecimal orglevel;
    @TableField("ORGDEGREE")
    private String orgdegree;
    @TableField("ORGSEQ")
    private String orgseq;
    @TableField("ORGTYPE")
    private String orgtype;
    @TableField("ORGADDR")
    private String orgaddr;
    @TableField("ZIPCODE")
    private String zipcode;
    @TableField("MANAPOSITION")
    private BigDecimal manaposition;
    @TableField("MANAGERID")
    private BigDecimal managerid;
    @TableField("ORGMANAGER")
    private String orgmanager;
    @TableField("LINKMAN")
    private String linkman;
    @TableField("LINKTEL")
    private String linktel;
    @TableField("EMAIL")
    private String email;
    @TableField("WEBURL")
    private String weburl;
    @TableField("STARTDATE")
    private Date startdate;
    @TableField("ENDDATE")
    private Date enddate;
    @TableField("STATUS")
    private String status;
    @TableField("AREA")
    private String area;
    @TableField("CREATETIME")
    private Date createtime;
    @TableField("LASTUPDATE")
    private Date lastupdate;
    @TableField("UPDATOR")
    private BigDecimal updator;
    @TableField("SORTNO")
    private Integer sortno;
    @TableField("ISLEAF")
    private String isleaf;
    @TableField("SUBCOUNT")
    private BigDecimal subcount;
    @TableField("REMARK")
    private String remark;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("APP_ID")
    private String appId;
    @TableField("PARENTORGID")
    private BigDecimal parentorgid;


    @Override
    protected Serializable pkVal() {
        return this.orgid;
    }

}
