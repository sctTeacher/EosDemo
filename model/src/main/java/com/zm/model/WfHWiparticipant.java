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
@TableName("wf_h_wiparticipant")
public class WfHWiparticipant extends Model<WfHWiparticipant> {

    private static final long serialVersionUID = 1L;

    @TableId("WIPARTICID")
    private BigDecimal wiparticid;
    @TableField("WORKITEMID")
    private BigDecimal workitemid;
    @TableField("PARTICIPANTTYPE")
    private String participanttype;
    @TableField("PARTICIPANTID")
    private String participantid;
    @TableField("PARTICIPANTNAME")
    private String participantname;
    @TableField("PARTIINTYPE")
    private String partiintype;
    @TableField("DELEGATETYPE")
    private String delegatetype;
    @TableField("PARTICIPANTINDEX")
    private BigDecimal participantindex;
    @TableField("GLOBALID")
    private String globalid;
    @TableField("WORKITEMNAME")
    private String workitemname;
    @TableField("WORKITEMTYPE")
    private String workitemtype;
    @TableField("WORKITEMDESC")
    private String workitemdesc;
    @TableField("CURRENTSTATE")
    private BigDecimal currentstate;
    @TableField("PARTICIPANT")
    private String participant;
    @TableField("PRIORITY")
    private BigDecimal priority;
    @TableField("ISTIMEOUT")
    private String istimeout;
    @TableField("LIMITNUM")
    private BigDecimal limitnum;
    @TableField("LIMITNUMDESC")
    private String limitnumdesc;
    @TableField("CREATETIME")
    private Date createtime;
    @TableField("STARTTIME")
    private Date starttime;
    @TableField("ENDTIME")
    private Date endtime;
    @TableField("FINALTIME")
    private Date finaltime;
    @TableField("REMINDTIME")
    private Date remindtime;
    @TableField("ACTIONURL")
    private String actionurl;
    @TableField("PROCESSINSTID")
    private BigDecimal processinstid;
    @TableField("ACTIVITYINSTID")
    private BigDecimal activityinstid;
    @TableField("STATESLIST")
    private String stateslist;
    @TableField("TIMEOUTNUM")
    private BigDecimal timeoutnum;
    @TableField("TIMEOUTNUMDESC")
    private String timeoutnumdesc;
    @TableField("PROCESSINSTNAME")
    private String processinstname;
    @TableField("ACTIVITYINSTNAME")
    private String activityinstname;
    @TableField("PROCESSDEFID")
    private BigDecimal processdefid;
    @TableField("PROCESSDEFNAME")
    private String processdefname;
    @TableField("PROCESSCHNAME")
    private String processchname;
    @TableField("ACTIVITYDEFID")
    private String activitydefid;
    @TableField("ASSISTANT")
    private String assistant;
    @TableField("BIZSTATE")
    private BigDecimal bizstate;
    @TableField("ALLOWAGENT")
    private String allowagent;
    @TableField("ROOTPROCINSTID")
    private BigDecimal rootprocinstid;
    @TableField("ACTIONMASK")
    private String actionmask;
    @TableField("URLTYPE")
    private String urltype;
    @TableField("PARTINAME")
    private String partiname;
    @TableField("ASSISTANTNAME")
    private String assistantname;
    @TableField("DEALRESULT")
    private String dealresult;
    @TableField("DEALOPINION")
    private String dealopinion;
    @TableField("EXTEND1")
    private String extend1;
    @TableField("EXTEND2")
    private String extend2;
    @TableField("EXTEND3")
    private String extend3;
    @TableField("EXTEND4")
    private String extend4;
    @TableField("EXTEND5")
    private BigDecimal extend5;
    @TableField("CATALOGUUID")
    private String cataloguuid;
    @TableField("CATALOGNAME")
    private String catalogname;
    @TableField("TENANT_ID")
    private String tenantId;
    @TableField("PRESSNUM")
    private BigDecimal pressnum;


    @Override
    protected Serializable pkVal() {
        return this.wiparticid;
    }

}
