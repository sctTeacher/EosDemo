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
@TableName("comp_win7_icons")
public class CompWin7Icons extends Model<CompWin7Icons> {

    private static final long serialVersionUID = 1L;

    @TableId("ICON_ID")
    private String iconId;
    @TableField("ICON_NAME")
    private String iconName;
    @TableField("ICON_TEXT")
    private String iconText;
    @TableField("ICON_PATH")
    private String iconPath;
    @TableField("ICON_TITLE")
    private String iconTitle;
    @TableField("MENU_ID")
    private String menuId;
    @TableField("ICON_INDEX")
    private String iconIndex;
    @TableField("ICON_DESC")
    private String iconDesc;
    @TableField("USER_ID")
    private String userId;


    @Override
    protected Serializable pkVal() {
        return this.iconId;
    }

}
