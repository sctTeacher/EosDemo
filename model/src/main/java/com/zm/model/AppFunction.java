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
@TableName("app_function")
public class AppFunction extends Model<AppFunction> {

    private static final long serialVersionUID = 1L;

    @TableId("FUNCCODE")
    private String funccode;
    @TableField("FUNCNAME")
    private String funcname;
    @TableField("FUNCDESC")
    private String funcdesc;
    @TableField("FUNCACTION")
    private String funcaction;
    @TableField("PARAINFO")
    private String parainfo;
    @TableField("ISCHECK")
    private String ischeck;
    @TableField("FUNCTYPE")
    private String functype;
    @TableField("ISMENU")
    private String ismenu;
    @TableField("APP_ID")
    private String appId;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("FUNCGROUPID")
    private BigDecimal funcgroupid;


    @Override
    protected Serializable pkVal() {
        return this.funccode;
    }

}
