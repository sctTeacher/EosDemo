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
@TableName("eos_dict_entry_i18n")
public class EosDictEntryI18n extends Model<EosDictEntryI18n> {

    private static final long serialVersionUID = 1L;

    @TableId("DICTTYPEID")
    private String dicttypeid;
    @TableField("DICTID")
    private String dictid;
    @TableField("DICTNAME")
    private String dictname;
    @TableField("LOCALE")
    private String locale;


    @Override
    protected Serializable pkVal() {
        return this.dicttypeid;
    }

}
