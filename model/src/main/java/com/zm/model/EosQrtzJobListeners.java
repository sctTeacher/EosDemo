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
@TableName("eos_qrtz_job_listeners")
public class EosQrtzJobListeners extends Model<EosQrtzJobListeners> {

    private static final long serialVersionUID = 1L;

    @TableId("JOB_LISTENER")
    private String jobListener;
    @TableField("JOB_NAME")
    private String jobName;
    @TableField("JOB_GROUP")
    private String jobGroup;


    @Override
    protected Serializable pkVal() {
        return this.jobListener;
    }

}
