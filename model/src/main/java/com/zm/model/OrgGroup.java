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
@TableName("org_group")
public class OrgGroup extends Model<OrgGroup> {

    private static final long serialVersionUID = 1L;

    @TableId("GROUPID")
    private BigDecimal groupid;
    @TableField("ORGID")
    private BigDecimal orgid;
    @TableField("GROUPLEVEL")
    private Integer grouplevel;
    @TableField("GROUPNAME")
    private String groupname;
    @TableField("GROUPDESC")
    private String groupdesc;
    @TableField("GROUPTYPE")
    private String grouptype;
    @TableField("GROUPSEQ")
    private String groupseq;
    @TableField("STARTDATE")
    private Date startdate;
    @TableField("ENDDATE")
    private Date enddate;
    @TableField("GROUPSTATUS")
    private String groupstatus;
    @TableField("MANAGER")
    private String manager;
    @TableField("CREATETIME")
    private Date createtime;
    @TableField("LASTUPDATE")
    private Date lastupdate;
    @TableField("UPDATOR")
    private BigDecimal updator;
    @TableField("ISLEAF")
    private String isleaf;
    @TableField("SUBCOUNT")
    private BigDecimal subcount;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("APP_ID")
    private String appId;
    @TableField("PARENTGROUPID")
    private BigDecimal parentgroupid;


    @Override
    protected Serializable pkVal() {
        return this.groupid;
    }

}
