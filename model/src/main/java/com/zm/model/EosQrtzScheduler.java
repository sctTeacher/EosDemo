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
@TableName("eos_qrtz_scheduler")
public class EosQrtzScheduler extends Model<EosQrtzScheduler> {

    private static final long serialVersionUID = 1L;

    @TableId("UUID")
    private String uuid;
    @TableField("SCHEDULER")
    private String scheduler;
    @TableField("NODE")
    private String node;
    @TableField("STATUS")
    private BigDecimal status;
    @TableField("HEARTBEATTIME")
    private BigDecimal heartbeattime;
    @TableField("VALIDATEFLAG")
    private BigDecimal validateflag;
    @TableField("VALIDATETIME")
    private Date validatetime;
    @TableField("INVALIDATETIME")
    private Date invalidatetime;


    @Override
    protected Serializable pkVal() {
        return this.uuid;
    }

}
