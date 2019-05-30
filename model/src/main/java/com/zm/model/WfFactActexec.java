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
@TableName("wf_fact_actexec")
public class WfFactActexec extends Model<WfFactActexec> {

    private static final long serialVersionUID = 1L;

    @TableId("ITMNO")
    private BigDecimal itmno;
    @TableField("ACTIVITYID")
    private String activityid;
    @TableField("MONTH")
    private BigDecimal month;
    @TableField("TOTALEXECTIME")
    private BigDecimal totalexectime;
    @TableField("MAXEXECTIME")
    private BigDecimal maxexectime;
    @TableField("MINEXECTIME")
    private BigDecimal minexectime;
    @TableField("STARTNUM")
    private BigDecimal startnum;
    @TableField("BACKNUM")
    private BigDecimal backnum;
    @TableField("FINISHEDNUM")
    private BigDecimal finishednum;


    @Override
    protected Serializable pkVal() {
        return this.itmno;
    }

}
