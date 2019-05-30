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
@TableName("wfbizmapping")
public class Wfbizmapping extends Model<Wfbizmapping> {

    private static final long serialVersionUID = 1L;

    @TableId("BIZMAPPINGID")
    private BigDecimal bizmappingid;
    @TableField("BIZTABLENAME")
    private String biztablename;
    @TableField("BIZFIELDNAME")
    private String bizfieldname;
    @TableField("WFFIELDNAME")
    private String wffieldname;


    @Override
    protected Serializable pkVal() {
        return this.bizmappingid;
    }

}
