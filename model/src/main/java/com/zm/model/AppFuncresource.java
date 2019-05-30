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
@TableName("app_funcresource")
public class AppFuncresource extends Model<AppFuncresource> {

    private static final long serialVersionUID = 1L;

    @TableId("RESID")
    private BigDecimal resid;
    @TableField("RESTYPE")
    private String restype;
    @TableField("RESPATH")
    private String respath;
    @TableField("COMPACKNAME")
    private String compackname;
    @TableField("RESNAME")
    private String resname;
    @TableField("APP_ID")
    private String appId;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("FUNCCODE")
    private String funccode;


    @Override
    protected Serializable pkVal() {
        return this.resid;
    }

}
