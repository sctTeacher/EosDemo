package com.zm.model;

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
@TableName("eos_qrtz_fired_triggers")
public class EosQrtzFiredTriggers extends Model<EosQrtzFiredTriggers> {

    private static final long serialVersionUID = 1L;

    @TableId("ENTRY_ID")
    private String entryId;
    @TableField("TRIGGER_NAME")
    private String triggerName;
    @TableField("TRIGGER_GROUP")
    private String triggerGroup;
    @TableField("IS_VOLATILE")
    private Integer isVolatile;
    @TableField("INSTANCE_NAME")
    private String instanceName;
    @TableField("FIRED_TIME")
    private Long firedTime;
    @TableField("STATE")
    private String state;
    @TableField("JOB_NAME")
    private String jobName;
    @TableField("JOB_GROUP")
    private String jobGroup;
    @TableField("IS_STATEFUL")
    private Integer isStateful;
    @TableField("REQUESTS_RECOVERY")
    private Integer requestsRecovery;


    @Override
    protected Serializable pkVal() {
        return this.entryId;
    }

}
