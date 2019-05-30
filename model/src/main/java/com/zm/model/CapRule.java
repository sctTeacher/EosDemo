package com.zm.model;

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
@TableName("cap_rule")
public class CapRule extends Model<CapRule> {

    private static final long serialVersionUID = 1L;

    @TableId("RULE_ID")
    private String ruleId;
    @TableField("RULE_NAME")
    private String ruleName;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("RULE_TYPE")
    private String ruleType;
    @TableField("NAMESPACE")
    private String namespace;
    @TableField("RULE_EXPRESSION")
    private byte[] ruleExpression;
    @TableField("CREATEUSER")
    private String createuser;
    @TableField("CREATETIME")
    private Date createtime;


    @Override
    protected Serializable pkVal() {
        return this.ruleId;
    }

}
