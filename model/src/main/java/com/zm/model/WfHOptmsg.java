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
@TableName("wf_h_optmsg")
public class WfHOptmsg extends Model<WfHOptmsg> {

    private static final long serialVersionUID = 1L;

    @TableId("MESSAGEID")
    private BigDecimal messageid;
    @TableField("PRODUCER")
    private String producer;
    @TableField("RECEIVER")
    private String receiver;
    @TableField("OPERATIONTYPE")
    private String operationtype;
    @TableField("CORRELATIONTYPE")
    private String correlationtype;
    @TableField("CORRELATIONID")
    private BigDecimal correlationid;
    @TableField("CONTENT")
    private String content;
    @TableField("CREATETIME")
    private Date createtime;
    @TableField("PROCESSDEFID")
    private BigDecimal processdefid;
    @TableField("PROCESSINSTID")
    private BigDecimal processinstid;
    @TableField("ACTIVITYINSTID")
    private BigDecimal activityinstid;
    @TableField("WORKITEMID")
    private BigDecimal workitemid;
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
        return this.messageid;
    }

}
