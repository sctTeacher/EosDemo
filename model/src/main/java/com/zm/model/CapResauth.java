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
@TableName("cap_resauth")
public class CapResauth extends Model<CapResauth> {

    private static final long serialVersionUID = 1L;

    @TableId("PARTY_ID")
    private String partyId;
    @TableField("PARTY_TYPE")
    private String partyType;
    @TableField("RES_ID")
    private String resId;
    @TableField("RES_TYPE")
    private String resType;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("RES_STATE")
    private String resState;
    @TableField("PARTY_SCOPE")
    private String partyScope;
    @TableField("CREATEUSER")
    private String createuser;
    @TableField("CREATETIME")
    private Date createtime;


    @Override
    protected Serializable pkVal() {
        return this.partyId;
    }

}
