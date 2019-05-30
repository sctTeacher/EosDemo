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
@TableName("eos_qrtz_job_details")
public class EosQrtzJobDetails extends Model<EosQrtzJobDetails> {

    private static final long serialVersionUID = 1L;

    @TableId("JOB_NAME")
    private String jobName;
    @TableField("JOB_GROUP")
    private String jobGroup;
    @TableField("DESCRIPTION")
    private String description;
    @TableField("JOB_CLASS_NAME")
    private String jobClassName;
    @TableField("IS_DURABLE")
    private Integer isDurable;
    @TableField("IS_VOLATILE")
    private Integer isVolatile;
    @TableField("IS_STATEFUL")
    private Integer isStateful;
    @TableField("REQUESTS_RECOVERY")
    private Integer requestsRecovery;
    @TableField("JOB_DATA")
    private byte[] jobData;


    @Override
    protected Serializable pkVal() {
        return this.jobName;
    }

}
