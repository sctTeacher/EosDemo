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
@TableName("wf_fact_processexec")
public class WfFactProcessexec extends Model<WfFactProcessexec> {

    private static final long serialVersionUID = 1L;

    @TableId("ITMNO")
    private BigDecimal itmno;
    @TableField("PROCESSID")
    private String processid;
    @TableField("MONTH")
    private BigDecimal month;
    @TableField("TOTALEXECTIME")
    private BigDecimal totalexectime;
    @TableField("MAXEXECTIME")
    private BigDecimal maxexectime;
    @TableField("MINEXECTIME")
    private BigDecimal minexectime;
    @TableField("STARTEDNUM")
    private BigDecimal startednum;
    @TableField("FINISHEDNUM")
    private BigDecimal finishednum;
    @TableField("SUSPENDEDNUM")
    private BigDecimal suspendednum;
    @TableField("TERMINATEDNUM")
    private BigDecimal terminatednum;
    @TableField("TIMEOUTPROCNUM")
    private BigDecimal timeoutprocnum;
    @TableField("FINISHEDTASKNUM")
    private BigDecimal finishedtasknum;
    @TableField("TIMEOUTTASKNUM")
    private BigDecimal timeouttasknum;


    @Override
    protected Serializable pkVal() {
        return this.itmno;
    }

}
