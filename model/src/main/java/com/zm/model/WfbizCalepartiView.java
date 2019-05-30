package com.zm.model;

import java.math.BigDecimal;
import java.util.Date;
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
 * VIEW
 * </p>
 *
 * @author zhangfy
 * @since 2019-05-30
 */
@Data
@Accessors(chain = true)
@TableName("wfbiz_caleparti_view")
public class WfbizCalepartiView extends Model<WfbizCalepartiView> {

    private static final long serialVersionUID = 1L;

    @TableField("PARTICALEUUID")
    private BigDecimal particaleuuid;
    @TableField("PARTITYPE")
    private String partitype;
    @TableField("PARTIID")
    private String partiid;
    @TableField("PARTINAME")
    private String partiname;
    @TableField("CALENDARUUID")
    private String calendaruuid;
    @TableField("CALETYPE")
    private String caletype;
    @TableField("UPTTIME")
    private Date upttime;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("CALENDARNAME")
    private String calendarname;


    @Override
    protected Serializable pkVal() {
        return this.particaleuuid;
    }

}
