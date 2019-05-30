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
@TableName("wfactivityinst")
public class Wfactivityinst extends Model<Wfactivityinst> {

    private static final long serialVersionUID = 1L;

    @TableId("ACTIVITYINSTID")
    private BigDecimal activityinstid;
    @TableField("ACTIVITYINSTNAME")
    private String activityinstname;
    @TableField("ACTIVITYINSTDESC")
    private String activityinstdesc;
    @TableField("ACTIVITYTYPE")
    private String activitytype;
    @TableField("CURRENTSTATE")
    private BigDecimal currentstate;
    @TableField("PRIORITY")
    private BigDecimal priority;
    @TableField("CREATETIME")
    private Date createtime;
    @TableField("STARTTIME")
    private Date starttime;
    @TableField("ENDTIME")
    private Date endtime;
    @TableField("FINALTIME")
    private Date finaltime;
    @TableField("SUBPROCESSID")
    private BigDecimal subprocessid;
    @TableField("ACTIVITYDEFID")
    private String activitydefid;
    @TableField("PROCESSINSTID")
    private BigDecimal processinstid;
    @TableField("ROLLBACKFLAG")
    private String rollbackflag;
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
    @TableField("CATALOGNAME")
    private String catalogname;
    @TableField("TENANT_ID")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.activityinstid;
    }

}
