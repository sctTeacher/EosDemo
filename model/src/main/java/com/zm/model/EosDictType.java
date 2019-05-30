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
@TableName("eos_dict_type")
public class EosDictType extends Model<EosDictType> {

    private static final long serialVersionUID = 1L;

    @TableId("DICTTYPEID")
    private String dicttypeid;
    @TableField("DICTTYPENAME")
    private String dicttypename;
    @TableField("RANK")
    private Integer rank;
    @TableField("PARENTID")
    private String parentid;
    @TableField("SEQNO")
    private String seqno;


    @Override
    protected Serializable pkVal() {
        return this.dicttypeid;
    }

}
