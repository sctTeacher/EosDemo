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
@TableName("org_position")
public class OrgPosition extends Model<OrgPosition> {

    private static final long serialVersionUID = 1L;

    @TableId("POSITIONID")
    private BigDecimal positionid;
    @TableField("POSICODE")
    private String posicode;
    @TableField("POSINAME")
    private String posiname;
    @TableField("POSILEVEL")
    private BigDecimal posilevel;
    @TableField("POSITIONSEQ")
    private String positionseq;
    @TableField("POSITYPE")
    private String positype;
    @TableField("CREATETIME")
    private Date createtime;
    @TableField("LASTUPDATE")
    private Date lastupdate;
    @TableField("UPDATOR")
    private BigDecimal updator;
    @TableField("STARTDATE")
    private Date startdate;
    @TableField("ENDDATE")
    private Date enddate;
    @TableField("STATUS")
    private String status;
    @TableField("ISLEAF")
    private String isleaf;
    @TableField("SUBCOUNT")
    private BigDecimal subcount;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("APP_ID")
    private String appId;
    @TableField("DUTYID")
    private BigDecimal dutyid;
    @TableField("MANAPOSI")
    private BigDecimal manaposi;
    @TableField("ORGID")
    private BigDecimal orgid;


    @Override
    protected Serializable pkVal() {
        return this.positionid;
    }

}
