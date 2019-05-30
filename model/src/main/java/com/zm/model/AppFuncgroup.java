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
@TableName("app_funcgroup")
public class AppFuncgroup extends Model<AppFuncgroup> {

    private static final long serialVersionUID = 1L;

    @TableId("FUNCGROUPID")
    private BigDecimal funcgroupid;
    @TableField("FUNCGROUPNAME")
    private String funcgroupname;
    @TableField("GROUPLEVEL")
    private Integer grouplevel;
    @TableField("FUNCGROUPSEQ")
    private String funcgroupseq;
    @TableField("ISLEAF")
    private String isleaf;
    @TableField("SUBCOUNT")
    private BigDecimal subcount;
    @TableField("APP_ID")
    private String appId;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("PARENTGROUP")
    private BigDecimal parentgroup;
    @TableField("APPID")
    private BigDecimal appid;


    @Override
    protected Serializable pkVal() {
        return this.funcgroupid;
    }

}
