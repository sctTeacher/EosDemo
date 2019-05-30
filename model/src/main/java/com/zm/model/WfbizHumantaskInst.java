package com.zm.model;

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
@TableName("wfbiz_humantask_inst")
public class WfbizHumantaskInst extends Model<WfbizHumantaskInst> {

    private static final long serialVersionUID = 1L;

    @TableId("HUMANTASKUUID")
    private String humantaskuuid;
    @TableField("HUMANTASKNAME")
    private String humantaskname;
    @TableField("CATALOGUUID")
    private String cataloguuid;
    @TableField("HUMANTASKIMPL")
    private String humantaskimpl;
    @TableField("HUMANTASKTYPE")
    private String humantasktype;
    @TableField("MARK")
    private String mark;
    @TableField("UPTTIME")
    private Date upttime;
    @TableField("TENANT_ID")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.humantaskuuid;
    }

}
