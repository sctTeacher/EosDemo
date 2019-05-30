package com.zm.model;

import java.math.BigDecimal;
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
@TableName("org_employee")
public class OrgEmployee extends Model<OrgEmployee> {

    private static final long serialVersionUID = 1L;

    @TableId("EMPID")
    private BigDecimal empid;
    @TableField("EMPCODE")
    private String empcode;
    @TableField("OPERATORID")
    private BigDecimal operatorid;
    @TableField("USERID")
    private String userid;
    @TableField("EMPNAME")
    private String empname;
    @TableField("REALNAME")
    private String realname;
    @TableField("GENDER")
    private String gender;
    @TableField("BIRTHDATE")
    private Date birthdate;
    @TableField("POSITION")
    private BigDecimal position;
    @TableField("EMPSTATUS")
    private String empstatus;
    @TableField("CARDTYPE")
    private String cardtype;
    @TableField("CARDNO")
    private String cardno;
    @TableField("INDATE")
    private Date indate;
    @TableField("OUTDATE")
    private Date outdate;
    @TableField("OTEL")
    private String otel;
    @TableField("OADDRESS")
    private String oaddress;
    @TableField("OZIPCODE")
    private String ozipcode;
    @TableField("OEMAIL")
    private String oemail;
    @TableField("FAXNO")
    private String faxno;
    @TableField("MOBILENO")
    private String mobileno;
    @TableField("QQ")
    private String qq;
    @TableField("HTEL")
    private String htel;
    @TableField("HADDRESS")
    private String haddress;
    @TableField("HZIPCODE")
    private String hzipcode;
    @TableField("PEMAIL")
    private String pemail;
    @TableField("PARTY")
    private String party;
    @TableField("DEGREE")
    private String degree;
    @TableField("SORTNO")
    private Integer sortno;
    @TableField("MAJOR")
    private BigDecimal major;
    @TableField("SPECIALTY")
    private String specialty;
    @TableField("WORKEXP")
    private String workexp;
    @TableField("REGDATE")
    private Date regdate;
    @TableField("CREATETIME")
    private Date createtime;
    @TableField("LASTMODYTIME")
    private Date lastmodytime;
    @TableField("ORGIDLIST")
    private String orgidlist;
    @TableField("ORGID")
    private BigDecimal orgid;
    @TableField("REMARK")
    private String remark;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("APP_ID")
    private String appId;
    @TableField("WEIBO")
    private String weibo;


    @Override
    protected Serializable pkVal() {
        return this.empid;
    }

}
