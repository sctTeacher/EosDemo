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
@TableName("wf_h_transition")
public class WfHTransition extends Model<WfHTransition> {

    private static final long serialVersionUID = 1L;

    @TableId("TRANSITIONID")
    private BigDecimal transitionid;
    @TableField("TRANSITIONTYPE")
    private String transitiontype;
    @TableField("CAUSEACTINSTID")
    private BigDecimal causeactinstid;
    @TableField("CAUSEACTINSTNAME")
    private String causeactinstname;
    @TableField("RESULTACTINSTID")
    private BigDecimal resultactinstid;
    @TableField("RESULTACTINSTNAME")
    private String resultactinstname;
    @TableField("SRCACTDEFID")
    private String srcactdefid;
    @TableField("DESTACTDEFID")
    private String destactdefid;
    @TableField("SRCACTDEFNAME")
    private String srcactdefname;
    @TableField("DESTACTDEFNAME")
    private String destactdefname;
    @TableField("TRANSTIME")
    private Date transtime;
    @TableField("PROCESSINSTID")
    private BigDecimal processinstid;
    @TableField("EXTEND1")
    private String extend1;
    @TableField("TENANT_ID")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.transitionid;
    }

}
