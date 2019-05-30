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
@TableName("eos_qrtz_trigger_listeners")
public class EosQrtzTriggerListeners extends Model<EosQrtzTriggerListeners> {

    private static final long serialVersionUID = 1L;

    @TableId("TRIGGER_LISTENER")
    private String triggerListener;
    @TableField("TRIGGER_NAME")
    private String triggerName;
    @TableField("TRIGGER_GROUP")
    private String triggerGroup;


    @Override
    protected Serializable pkVal() {
        return this.triggerListener;
    }

}
