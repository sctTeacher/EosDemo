package com.zm.model;

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
@TableName("wfretrymessage")
public class Wfretrymessage extends Model<Wfretrymessage> {

    private static final long serialVersionUID = 1L;

    @TableId("RETRYMESSAGEID")
    private String retrymessageid;
    @TableField("RETRYPOLICYTYPE")
    private String retrypolicytype;
    @TableField("RETRYLIMIT")
    private Integer retrylimit;
    @TableField("RETRYCOUNT")
    private Integer retrycount;
    @TableField("CAUSE")
    private byte[] cause;
    @TableField("MESSAGE")
    private byte[] message;
    @TableField("FAILDATE")
    private String faildate;
    @TableField("TIMEOUT")
    private Integer timeout;


    @Override
    protected Serializable pkVal() {
        return this.retrymessageid;
    }

}
