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
@TableName("wfbiz_res_relation")
public class WfbizResRelation extends Model<WfbizResRelation> {

    private static final long serialVersionUID = 1L;

    @TableId("RELID")
    private BigDecimal relid;
    @TableField("RESUUID")
    private String resuuid;
    @TableField("RESTYPE")
    private String restype;
    @TableField("USERCODE")
    private String usercode;
    @TableField("USERVERSION")
    private String userversion;
    @TableField("USERTYPE")
    private String usertype;
    @TableField("MARK")
    private String mark;
    @TableField("UPTTIME")
    private Date upttime;
    @TableField("TENANT_ID")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.relid;
    }

}
