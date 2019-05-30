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
@TableName("eos_qrtz_scheduler_state")
public class EosQrtzSchedulerState extends Model<EosQrtzSchedulerState> {

    private static final long serialVersionUID = 1L;

    @TableId("INSTANCE_NAME")
    private String instanceName;
    @TableField("LAST_CHECKIN_TIME")
    private Long lastCheckinTime;
    @TableField("CHECKIN_INTERVAL")
    private Long checkinInterval;
    @TableField("RECOVERER")
    private String recoverer;


    @Override
    protected Serializable pkVal() {
        return this.instanceName;
    }

}
