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
@TableName("eos_dict_entry")
public class EosDictEntry extends Model<EosDictEntry> {

    private static final long serialVersionUID = 1L;

    @TableId("DICTTYPEID")
    private String dicttypeid;
    @TableField("DICTID")
    private String dictid;
    @TableField("DICTNAME")
    private String dictname;
    @TableField("STATUS")
    private Integer status;
    @TableField("SORTNO")
    private Integer sortno;
    @TableField("RANK")
    private Integer rank;
    @TableField("PARENTID")
    private String parentid;
    @TableField("SEQNO")
    private String seqno;
    @TableField("FILTER1")
    private String filter1;
    @TableField("FILTER2")
    private String filter2;


    @Override
    protected Serializable pkVal() {
        return this.dicttypeid;
    }

}
