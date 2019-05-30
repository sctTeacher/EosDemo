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
@TableName("wf_aid_timeoutprocess")
public class WfAidTimeoutprocess extends Model<WfAidTimeoutprocess> {

    private static final long serialVersionUID = 1L;

    @TableId("ITMNO")
    private BigDecimal itmno;
    @TableField("PROCESSDEFID")
    private BigDecimal processdefid;
    @TableField("PROCESSDEFNAME")
    private String processdefname;
    @TableField("PROCESSDISPNAME")
    private String processdispname;
    @TableField("PROCESSINSTID")
    private BigDecimal processinstid;
    @TableField("PROCESSINSTNAME")
    private String processinstname;
    @TableField("CREATORID")
    private String creatorid;
    @TableField("CREATORNAME")
    private String creatorname;
    @TableField("STARTTIME")
    private Date starttime;
    @TableField("FINALTIME")
    private Date finaltime;
    @TableField("ENDTIME")
    private Date endtime;
    @TableField("TIMEOUTLENGTH")
    private BigDecimal timeoutlength;
    @TableField("MONTH")
    private BigDecimal month;


    @Override
    protected Serializable pkVal() {
        return this.itmno;
    }

}
