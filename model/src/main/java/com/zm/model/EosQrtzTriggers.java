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
@TableName("eos_qrtz_triggers")
public class EosQrtzTriggers extends Model<EosQrtzTriggers> {

    private static final long serialVersionUID = 1L;

    @TableId("TRIGGER_NAME")
    private String triggerName;
    @TableField("TRIGGER_GROUP")
    private String triggerGroup;
    @TableField("IS_VOLATILE")
    private Integer isVolatile;
    @TableField("DESCRIPTION")
    private String description;
    @TableField("NEXT_FIRE_TIME")
    private Long nextFireTime;
    @TableField("PREV_FIRE_TIME")
    private Long prevFireTime;
    @TableField("TRIGGER_STATE")
    private String triggerState;
    @TableField("TRIGGER_TYPE")
    private String triggerType;
    @TableField("START_TIME")
    private Long startTime;
    @TableField("END_TIME")
    private Long endTime;
    @TableField("CALENDAR_NAME")
    private String calendarName;
    @TableField("MISFIRE_INSTR")
    private Integer misfireInstr;
    @TableField("JOB_DATA")
    private byte[] jobData;
    @TableField("JOB_NAME")
    private String jobName;
    @TableField("JOB_GROUP")
    private String jobGroup;


    @Override
    protected Serializable pkVal() {
        return this.triggerName;
    }

}
