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
@TableName("eos_unique_table")
public class EosUniqueTable extends Model<EosUniqueTable> {

    private static final long serialVersionUID = 1L;

    @TableId("NAME")
    private String name;
    @TableField("CODE")
    private BigDecimal code;


    @Override
    protected Serializable pkVal() {
        return this.name;
    }

}
