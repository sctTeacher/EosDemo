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
@TableName("wfagent")
public class Wfagent extends Model<Wfagent> {

    private static final long serialVersionUID = 1L;

    @TableId("AGENTID")
    private BigDecimal agentid;
    @TableField("AGENTTYPE")
    private String agenttype;
    @TableField("AGENTFROM")
    private String agentfrom;
    @TableField("AGENTTO")
    private String agentto;
    @TableField("AGENTTOTYPE")
    private String agenttotype;
    @TableField("STARTTIME")
    private Date starttime;
    @TableField("ENDTIME")
    private Date endtime;
    @TableField("AGENTREASON")
    private String agentreason;
    @TableField("EXTEND1")
    private String extend1;
    @TableField("EXTEND2")
    private String extend2;
    @TableField("EXTEND3")
    private String extend3;
    @TableField("EXTEND4")
    private String extend4;
    @TableField("EXTEND5")
    private String extend5;
    @TableField("TENANT_ID")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.agentid;
    }

}
