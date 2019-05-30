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
@TableName("wf_dim_process_closure")
public class WfDimProcessClosure extends Model<WfDimProcessClosure> {

    private static final long serialVersionUID = 1L;

    @TableId("PARENTID")
    private String parentid;
    @TableField("PROCESSID")
    private String processid;
    @TableField("DISTANCE")
    private BigDecimal distance;


    @Override
    protected Serializable pkVal() {
        return this.parentid;
    }

}
