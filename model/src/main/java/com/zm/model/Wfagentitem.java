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
@TableName("wfagentitem")
public class Wfagentitem extends Model<Wfagentitem> {

    private static final long serialVersionUID = 1L;

    @TableId("AGENTITEMID")
    private BigDecimal agentitemid;
    @TableField("ITEMTYPE")
    private String itemtype;
    @TableField("ITEMID")
    private String itemid;
    @TableField("VALID")
    private String valid;
    @TableField("ACCESSTYPE")
    private String accesstype;
    @TableField("AGENTID")
    private BigDecimal agentid;
    @TableField("EXTEND1")
    private String extend1;
    @TableField("EXTEND2")
    private String extend2;
    @TableField("EXTEND3")
    private String extend3;
    @TableField("TENANT_ID")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.agentitemid;
    }

}
