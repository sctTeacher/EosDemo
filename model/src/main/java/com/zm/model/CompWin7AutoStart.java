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
@TableName("comp_win7_auto_start")
public class CompWin7AutoStart extends Model<CompWin7AutoStart> {

    private static final long serialVersionUID = 1L;

    @TableId("START_ID")
    private String startId;
    @TableField("MENU_ID")
    private String menuId;
    @TableField("START_DESC")
    private String startDesc;
    @TableField("USER_ID")
    private String userId;


    @Override
    protected Serializable pkVal() {
        return this.startId;
    }

}
