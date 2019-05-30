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
@TableName("wfbiz_catalog_info")
public class WfbizCatalogInfo extends Model<WfbizCatalogInfo> {

    private static final long serialVersionUID = 1L;

    @TableId("CATALOGUUID")
    private String cataloguuid;
    @TableField("CATALOGNAME")
    private String catalogname;
    @TableField("PARENTCATALOGUUID")
    private String parentcataloguuid;
    @TableField("ISLEAF")
    private String isleaf;
    @TableField("SEQ")
    private String seq;
    @TableField("DEMO")
    private String demo;
    @TableField("ORDERID")
    private BigDecimal orderid;
    @TableField("UPTTIME")
    private Date upttime;
    @TableField("TENANT_ID")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.cataloguuid;
    }

}
