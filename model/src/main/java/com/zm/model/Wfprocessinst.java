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
@TableName("wfprocessinst")
public class Wfprocessinst extends Model<Wfprocessinst> {

    private static final long serialVersionUID = 1L;

    @TableId("PROCESSINSTID")
    private BigDecimal processinstid;
    @TableField("PROCESSINSTNAME")
    private String processinstname;
    @TableField("PROCESSINSTDESC")
    private String processinstdesc;
    @TableField("CREATOR")
    private String creator;
    @TableField("OWNER")
    private String owner;
    @TableField("CURRENTSTATE")
    private BigDecimal currentstate;
    @TableField("PRIORITY")
    private BigDecimal priority;
    @TableField("RELATEDATA")
    private String relatedata;
    @TableField("RELATEDATAVCHR")
    private String relatedatavchr;
    @TableField("LIMITNUM")
    private BigDecimal limitnum;
    @TableField("LIMITNUMDESC")
    private String limitnumdesc;
    @TableField("CREATETIME")
    private Date createtime;
    @TableField("STARTTIME")
    private Date starttime;
    @TableField("ENDTIME")
    private Date endtime;
    @TableField("FINALTIME")
    private Date finaltime;
    @TableField("REMINDTIME")
    private Date remindtime;
    @TableField("PARENTPROCID")
    private BigDecimal parentprocid;
    @TableField("PARENTACTID")
    private BigDecimal parentactid;
    @TableField("PROCESSDEFID")
    private BigDecimal processdefid;
    @TableField("ISTIMEOUT")
    private String istimeout;
    @TableField("TIMEOUTNUM")
    private BigDecimal timeoutnum;
    @TableField("TIMEOUTNUMDESC")
    private String timeoutnumdesc;
    @TableField("UPDATEVERSION")
    private String updateversion;
    @TableField("PROCESSDEFNAME")
    private String processdefname;
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
        return this.processinstid;
    }

}
