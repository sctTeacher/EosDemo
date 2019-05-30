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
@TableName("wf_h_notificationinst")
public class WfHNotificationinst extends Model<WfHNotificationinst> {

    private static final long serialVersionUID = 1L;

    @TableId("NOTIFICATIONID")
    private BigDecimal notificationid;
    @TableField("TYPE")
    private String type;
    @TableField("TITLE")
    private String title;
    @TableField("SENDER")
    private String sender;
    @TableField("RECIPIENT")
    private String recipient;
    @TableField("STATE")
    private String state;
    @TableField("CREATETIME")
    private Date createtime;
    @TableField("CONFIRMTIME")
    private Date confirmtime;
    @TableField("FINALTIME")
    private Date finaltime;
    @TableField("REMINDTIME")
    private Date remindtime;
    @TableField("MESSAGE")
    private String message;
    @TableField("ACTIONURL")
    private String actionurl;
    @TableField("PROCDEFID")
    private BigDecimal procdefid;
    @TableField("PROCINSTID")
    private BigDecimal procinstid;
    @TableField("ACTINSTID")
    private BigDecimal actinstid;
    @TableField("WORKITEMID")
    private BigDecimal workitemid;
    @TableField("PROCDEFNAME")
    private String procdefname;
    @TableField("PROCINSTNAME")
    private String procinstname;
    @TableField("ACTINSTNAME")
    private String actinstname;
    @TableField("WORKITEMNAME")
    private String workitemname;
    @TableField("TIMEOUTFLAG")
    private String timeoutflag;
    @TableField("REMINDEDFLAG")
    private String remindedflag;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("EXTEND1")
    private BigDecimal extend1;
    @TableField("EXTEND2")
    private BigDecimal extend2;
    @TableField("EXTEND3")
    private String extend3;
    @TableField("EXTEND4")
    private String extend4;
    @TableField("EXTEND5")
    private String extend5;


    @Override
    protected Serializable pkVal() {
        return this.notificationid;
    }

}
