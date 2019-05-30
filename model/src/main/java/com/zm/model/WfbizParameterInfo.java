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
@TableName("wfbiz_parameter_info")
public class WfbizParameterInfo extends Model<WfbizParameterInfo> {

    private static final long serialVersionUID = 1L;

    @TableId("BUSPARAMUUID")
    private String busparamuuid;
    @TableField("BUSIOPTUUID")
    private String busioptuuid;
    @TableField("PARAMNAME")
    private String paramname;
    @TableField("PARAMMODE")
    private String parammode;
    @TableField("TYPECLASS")
    private String typeclass;
    @TableField("TYPEVALUE")
    private String typevalue;
    @TableField("DESCRIPTION")
    private String description;
    @TableField("PARAMINDEX")
    private BigDecimal paramindex;
    @TableField("MDFSTATE")
    private String mdfstate;
    @TableField("UPTTIME")
    private Date upttime;
    @TableField("TENANT_ID")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.busparamuuid;
    }

}
