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
@TableName("app_menu")
public class AppMenu extends Model<AppMenu> {

    private static final long serialVersionUID = 1L;

    @TableId("MENUID")
    private String menuid;
    @TableField("MENUNAME")
    private String menuname;
    @TableField("MENULABEL")
    private String menulabel;
    @TableField("MENUCODE")
    private String menucode;
    @TableField("ISLEAF")
    private String isleaf;
    @TableField("PARAMETER")
    private String parameter;
    @TableField("UIENTRY")
    private String uientry;
    @TableField("MENULEVEL")
    private Integer menulevel;
    @TableField("ROOTID")
    private String rootid;
    @TableField("DISPLAYORDER")
    private Integer displayorder;
    @TableField("IMAGEPATH")
    private String imagepath;
    @TableField("EXPANDPATH")
    private String expandpath;
    @TableField("MENUSEQ")
    private String menuseq;
    @TableField("OPENMODE")
    private String openmode;
    @TableField("SUBCOUNT")
    private BigDecimal subcount;
    @TableField("APPID")
    private BigDecimal appid;
    @TableField("FUNCCODE")
    private String funccode;
    @TableField("APP_ID")
    private String appId;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("PARENTSID")
    private String parentsid;


    @Override
    protected Serializable pkVal() {
        return this.menuid;
    }

}
