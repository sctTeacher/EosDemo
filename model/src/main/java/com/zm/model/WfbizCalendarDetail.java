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
@TableName("wfbiz_calendar_detail")
public class WfbizCalendarDetail extends Model<WfbizCalendarDetail> {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private BigDecimal id;
    @TableField("CALENDARUUID")
    private String calendaruuid;
    @TableField("CALDATE")
    private String caldate;
    @TableField("CALDATETYPE")
    private String caldatetype;
    @TableField("PERIOD1BEGIN")
    private String period1begin;
    @TableField("PERIOD1END")
    private String period1end;
    @TableField("PERIOD2BEGIN")
    private String period2begin;
    @TableField("PERIOD2END")
    private String period2end;
    @TableField("PERIOD3BEGIN")
    private String period3begin;
    @TableField("PERIOD3END")
    private String period3end;
    @TableField("PERIOD4BEGIN")
    private String period4begin;
    @TableField("PERIOD4END")
    private String period4end;
    @TableField("REMARK")
    private String remark;
    @TableField("UPTTIME")
    private Date upttime;
    @TableField("TENANT_ID")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
