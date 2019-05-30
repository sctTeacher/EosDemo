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
@TableName("org_duty")
public class OrgDuty extends Model<OrgDuty> {

    private static final long serialVersionUID = 1L;

    @TableId("DUTYID")
    private BigDecimal dutyid;
    @TableField("DUTYCODE")
    private String dutycode;
    @TableField("DUTYNAME")
    private String dutyname;
    @TableField("PARENTDUTY")
    private BigDecimal parentduty;
    @TableField("DUTYLEVEL")
    private Integer dutylevel;
    @TableField("DUTYSEQ")
    private String dutyseq;
    @TableField("DUTYTYPE")
    private String dutytype;
    @TableField("ISLEAF")
    private String isleaf;
    @TableField("SUBCOUNT")
    private BigDecimal subcount;
    @TableField("REMARK")
    private String remark;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("APP_ID")
    private String appId;


    @Override
    protected Serializable pkVal() {
        return this.dutyid;
    }

}
