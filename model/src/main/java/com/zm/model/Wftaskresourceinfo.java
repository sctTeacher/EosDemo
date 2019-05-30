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
@TableName("wftaskresourceinfo")
public class Wftaskresourceinfo extends Model<Wftaskresourceinfo> {

    private static final long serialVersionUID = 1L;

    @TableId("TASKID")
    private BigDecimal taskid;
    @TableField("TASKNAME")
    private String taskname;
    @TableField("QUEUENAME")
    private String queuename;
    @TableField("EXCLUDEUNIQUEID")
    private String excludeuniqueid;
    @TableField("EXCLUDEPARTICIPANT")
    private String excludeparticipant;
    @TableField("CREATETIME")
    private String createtime;
    @TableField("STATUS")
    private BigDecimal status;
    @TableField("PRIORITY")
    private BigDecimal priority;
    @TableField("RECEIVETIME")
    private BigDecimal receivetime;
    @TableField("RECOVERTIME")
    private String recovertime;
    @TableField("SERVERID")
    private String serverid;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("PROCESSINSTID")
    private BigDecimal processinstid;
    @TableField("ACTIVITYINSTID")
    private BigDecimal activityinstid;
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
        return this.taskid;
    }

}
