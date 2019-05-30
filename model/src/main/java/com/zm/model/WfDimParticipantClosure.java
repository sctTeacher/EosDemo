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
@TableName("wf_dim_participant_closure")
public class WfDimParticipantClosure extends Model<WfDimParticipantClosure> {

    private static final long serialVersionUID = 1L;

    @TableId("PARENTID")
    private String parentid;
    @TableField("PARTICIPANTID")
    private String participantid;
    @TableField("DISTANCE")
    private BigDecimal distance;


    @Override
    protected Serializable pkVal() {
        return this.parentid;
    }

}
