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
@TableName("wfbiz_operation_inst")
public class WfbizOperationInst extends Model<WfbizOperationInst> {

    private static final long serialVersionUID = 1L;

    @TableId("BUSIOPTUUID")
    private String busioptuuid;
    @TableField("BUSIOPTNAME")
    private String busioptname;
    @TableField("CATALOGUUID")
    private String cataloguuid;
    @TableField("BUSIOPTIMPL")
    private String busioptimpl;
    @TableField("BUSIOPTTYPE")
    private String busiopttype;
    @TableField("BUSIOPTSCOPE")
    private String busioptscope;
    @TableField("MARK")
    private String mark;
    @TableField("UPTTIME")
    private Date upttime;
    @TableField("TENANT_ID")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.busioptuuid;
    }

}
