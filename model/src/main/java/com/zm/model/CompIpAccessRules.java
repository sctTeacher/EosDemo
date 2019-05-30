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
@TableName("comp_ip_access_rules")
public class CompIpAccessRules extends Model<CompIpAccessRules> {

    private static final long serialVersionUID = 1L;

    @TableId("RULES_ID")
    private String rulesId;
    @TableField("START_IP")
    private String startIp;
    @TableField("END_IP")
    private String endIp;
    @TableField("RULES_TYPE")
    private String rulesType;
    @TableField("REMARK")
    private String remark;
    @TableField("MAKERS_ID")
    private String makersId;
    @TableField("ADD_DATE")
    private String addDate;
    @TableField("ENABLED")
    private String enabled;


    @Override
    protected Serializable pkVal() {
        return this.rulesId;
    }

}
