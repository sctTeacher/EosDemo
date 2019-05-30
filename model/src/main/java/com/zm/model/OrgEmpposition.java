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
@TableName("org_empposition")
public class OrgEmpposition extends Model<OrgEmpposition> {

    private static final long serialVersionUID = 1L;

    @TableId("POSITIONID")
    private BigDecimal positionid;
    @TableField("EMPID")
    private BigDecimal empid;
    @TableField("ISMAIN")
    private String ismain;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("APP_ID")
    private String appId;


    @Override
    protected Serializable pkVal() {
        return this.positionid;
    }

}
