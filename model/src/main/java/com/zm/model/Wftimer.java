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
@TableName("wftimer")
public class Wftimer extends Model<Wftimer> {

    private static final long serialVersionUID = 1L;

    @TableId("TIMERID")
    private BigDecimal timerid;
    @TableField("TIMERNAME")
    private String timername;
    @TableField("TIMERTYPE")
    private String timertype;
    @TableField("TIMERKIND")
    private String timerkind;
    @TableField("OBJECTID")
    private String objectid;
    @TableField("PARAMETER")
    private String parameter;
    @TableField("CURRENTSTATE")
    private String currentstate;
    @TableField("REGISTETIME")
    private BigDecimal registetime;
    @TableField("FIRSTTRIGGETIME")
    private BigDecimal firsttriggetime;
    @TableField("CYCLETIMES")
    private BigDecimal cycletimes;
    @TableField("NEXTTRIGGETIME")
    private BigDecimal nexttriggetime;
    @TableField("LEFTCYCLETIMES")
    private BigDecimal leftcycletimes;
    @TableField("CYCLEINTERVAL")
    private BigDecimal cycleinterval;
    @TableField("REGTIMEDESC")
    private String regtimedesc;
    @TableField("TRIGTIMEDESC")
    private String trigtimedesc;
    @TableField("EXTEND1")
    private String extend1;
    @TableField("EXTEND2")
    private String extend2;
    @TableField("TENANT_ID")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.timerid;
    }

}
