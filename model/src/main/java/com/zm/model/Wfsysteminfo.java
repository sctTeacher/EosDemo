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
@TableName("wfsysteminfo")
public class Wfsysteminfo extends Model<Wfsysteminfo> {

    private static final long serialVersionUID = 1L;

    @TableId("CONFIGKEY")
    private String configkey;
    @TableField("CONFIGVALUE")
    private String configvalue;
    @TableField("CONFIGDESC")
    private String configdesc;
    @TableField("CONFIGTYPE")
    private String configtype;


    @Override
    protected Serializable pkVal() {
        return this.configkey;
    }

}
