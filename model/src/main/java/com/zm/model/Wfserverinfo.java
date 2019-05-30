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
@TableName("wfserverinfo")
public class Wfserverinfo extends Model<Wfserverinfo> {

    private static final long serialVersionUID = 1L;

    @TableId("SERVERNAME")
    private String servername;
    @TableField("GROUPID")
    private String groupid;
    @TableField("STATUS")
    private String status;
    @TableField("STARTTIME")
    private String starttime;
    @TableField("ASSISTANT")
    private String assistant;
    @TableField("ASSISTEDTIME")
    private String assistedtime;
    @TableField("HEARTBEATTIME")
    private BigDecimal heartbeattime;
    @TableField("HEARTBEATINTERVAL")
    private BigDecimal heartbeatinterval;
    @TableField("HEARTBEATDELAY")
    private BigDecimal heartbeatdelay;
    @TableField("PROPERTIES")
    private String properties;
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


    @Override
    protected Serializable pkVal() {
        return this.servername;
    }

}
