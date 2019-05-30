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
@TableName("wfinvokeinfo")
public class Wfinvokeinfo extends Model<Wfinvokeinfo> {

    private static final long serialVersionUID = 1L;

    @TableField("XID")
    private String xid;
    @TableId("INVOKEID")
    private String invokeid;
    @TableField("USERID")
    private String userid;
    @TableField("INVOKE")
    private byte[] invoke;
    @TableField("INVOKESTATE")
    private Integer invokestate;
    @TableField("INVOKETIME")
    private Date invoketime;
    @TableField("COMPENSATESTATE")
    private Integer compensatestate;
    @TableField("EXTEND1")
    private String extend1;
    @TableField("EXTEND2")
    private String extend2;
    @TableField("EXTEND3")
    private String extend3;
    @TableField("EXTEND4")
    private BigDecimal extend4;
    @TableField("EXTEND5")
    private BigDecimal extend5;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("SEQNUM")
    private Integer seqnum;


    @Override
    protected Serializable pkVal() {
        return this.invokeid;
    }

}
