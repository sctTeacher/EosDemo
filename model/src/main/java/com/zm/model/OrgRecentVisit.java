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
@TableName("org_recent_visit")
public class OrgRecentVisit extends Model<OrgRecentVisit> {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;
    @TableField("TARGET_ID")
    private String targetId;
    @TableField("USERID")
    private String userid;
    @TableField("FREQUENCY")
    private Integer frequency;
    @TableField("LASTTIME")
    private Date lasttime;
    @TableField("TARGET_TYPE")
    private String targetType;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
