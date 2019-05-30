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
@TableName("wf_dim_processactivity")
public class WfDimProcessactivity extends Model<WfDimProcessactivity> {

    private static final long serialVersionUID = 1L;

    @TableField("PROCESSID")
    private String processid;
    @TableField("PROCESSNAME")
    private String processname;
    @TableField("VERSIONID")
    private BigDecimal versionid;
    @TableField("VERSIONNAME")
    private String versionname;
    @TableId("ACTIVITYID")
    private String activityid;
    @TableField("ACTIVITYNAME")
    private String activityname;


    @Override
    protected Serializable pkVal() {
        return this.activityid;
    }

}
