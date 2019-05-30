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
@TableName("eos_service_endpoint")
public class EosServiceEndpoint extends Model<EosServiceEndpoint> {

    private static final long serialVersionUID = 1L;

    @TableId("GLOBAL_ID")
    private String globalId;
    @TableField("SERVICE_NAME")
    private String serviceName;
    @TableField("HOST")
    private String host;
    @TableField("PORT")
    private String port;
    @TableField("PROTROL")
    private String protrol;
    @TableField("CONTEXT")
    private String context;
    @TableField("TYPE")
    private String type;
    @TableField("PRIORITY")
    private String priority;
    @TableField("APP_NAME")
    private String appName;
    @TableField("EXTENSION1")
    private String extension1;
    @TableField("EXTENSION2")
    private String extension2;
    @TableField("EXTENSION3")
    private String extension3;
    @TableField("EXTENSION4")
    private String extension4;
    @TableField("EXTENSION5")
    private String extension5;
    @TableField("EXTENSION6")
    private String extension6;


    @Override
    protected Serializable pkVal() {
        return this.globalId;
    }

}
