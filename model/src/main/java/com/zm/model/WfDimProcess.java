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
@TableName("wf_dim_process")
public class WfDimProcess extends Model<WfDimProcess> {

    private static final long serialVersionUID = 1L;

    @TableId("PROCESSID")
    private String processid;
    @TableField("PARENTID")
    private String parentid;
    @TableField("NAME")
    private String name;
    @TableField("ISLEAF")
    private String isleaf;


    @Override
    protected Serializable pkVal() {
        return this.processid;
    }

}
