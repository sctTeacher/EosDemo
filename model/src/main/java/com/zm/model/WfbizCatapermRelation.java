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
@TableName("wfbiz_cataperm_relation")
public class WfbizCatapermRelation extends Model<WfbizCatapermRelation> {

    private static final long serialVersionUID = 1L;

    @TableId("MAPPINGID")
    private BigDecimal mappingid;
    @TableField("CATALOGUUID")
    private String cataloguuid;
    @TableField("PERMISSIONTYPE")
    private String permissiontype;
    @TableField("PARTITYPE")
    private String partitype;
    @TableField("PARTIID")
    private String partiid;
    @TableField("PARTINAME")
    private String partiname;
    @TableField("UPTTIME")
    private Date upttime;
    @TableField("TENANT_ID")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.mappingid;
    }

}
