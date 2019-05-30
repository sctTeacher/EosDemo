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
@TableName("eos_qrtz_calendars")
public class EosQrtzCalendars extends Model<EosQrtzCalendars> {

    private static final long serialVersionUID = 1L;

    @TableId("CALENDAR_NAME")
    private String calendarName;
    @TableField("CALENDAR")
    private byte[] calendar;


    @Override
    protected Serializable pkVal() {
        return this.calendarName;
    }

}
