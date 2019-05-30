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
@TableName("wfbizinfo")
public class Wfbizinfo extends Model<Wfbizinfo> {

    private static final long serialVersionUID = 1L;

    @TableId("PROCESSINSTID")
    private BigDecimal processinstid;
    @TableField("BIZTABLENAME")
    private String biztablename;
    @TableField("VCCOLUMN1")
    private String vccolumn1;
    @TableField("VCCOLUMN2")
    private String vccolumn2;
    @TableField("VCCOLUMN3")
    private String vccolumn3;
    @TableField("VCCOLUMN4")
    private String vccolumn4;
    @TableField("VCCOLUMN5")
    private String vccolumn5;
    @TableField("VCCOLUMN6")
    private String vccolumn6;
    @TableField("VCCOLUMN7")
    private String vccolumn7;
    @TableField("VCCOLUMN8")
    private String vccolumn8;
    @TableField("VCCOLUMN9")
    private String vccolumn9;
    @TableField("VCCOLUMN10")
    private String vccolumn10;
    @TableField("NMCOLUMN1")
    private BigDecimal nmcolumn1;
    @TableField("NMCOLUMN2")
    private BigDecimal nmcolumn2;
    @TableField("NMCOLUMN3")
    private BigDecimal nmcolumn3;
    @TableField("NMCOLUMN4")
    private BigDecimal nmcolumn4;
    @TableField("NMCOLUMN5")
    private BigDecimal nmcolumn5;
    @TableField("NMCOLUMN6")
    private BigDecimal nmcolumn6;
    @TableField("NMCOLUMN7")
    private BigDecimal nmcolumn7;
    @TableField("NMCOLUMN8")
    private BigDecimal nmcolumn8;
    @TableField("NMCOLUMN9")
    private BigDecimal nmcolumn9;
    @TableField("NMCOLUMN10")
    private BigDecimal nmcolumn10;
    @TableField("DTCOLUMN1")
    private Date dtcolumn1;
    @TableField("DTCOLUMN2")
    private Date dtcolumn2;
    @TableField("DTCOLUMN3")
    private Date dtcolumn3;
    @TableField("DTCOLUMN4")
    private Date dtcolumn4;
    @TableField("DTCOLUMN5")
    private Date dtcolumn5;
    @TableField("DTCOLUMN6")
    private Date dtcolumn6;
    @TableField("DTCOLUMN7")
    private Date dtcolumn7;
    @TableField("DTCOLUMN8")
    private Date dtcolumn8;
    @TableField("DTCOLUMN9")
    private Date dtcolumn9;
    @TableField("DTCOLUMN10")
    private Date dtcolumn10;


    @Override
    protected Serializable pkVal() {
        return this.processinstid;
    }

}
