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
@TableName("cap_partyauth")
public class CapPartyauth extends Model<CapPartyauth> {

    private static final long serialVersionUID = 1L;

    @TableId("ROLE_TYPE")
    private String roleType;
    @TableField("PARTY_ID")
    private String partyId;
    @TableField("PARTY_TYPE")
    private String partyType;
    @TableField("ROLE_ID")
    private String roleId;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("CREATEUSER")
    private String createuser;
    @TableField("CREATETIME")
    private Date createtime;


    @Override
    protected Serializable pkVal() {
        return this.roleType;
    }

}
