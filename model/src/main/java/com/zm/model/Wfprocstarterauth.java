package com.zm.model;

import java.math.BigDecimal;
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
@TableName("wfprocstarterauth")
public class Wfprocstarterauth extends Model<Wfprocstarterauth> {

    private static final long serialVersionUID = 1L;

    private String uniqueID;
    private BigDecimal processDefID;
    private String processDefName;
    private String processChName;
    private String versionSign;
    private String globalID;
    private String catalogUUID;
    private String catalogName;
    @TableField("tenant_id")
    private String tenantId;


    @Override
    protected Serializable pkVal() {
        return this.uniqueID;
    }

}
