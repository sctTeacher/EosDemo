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
@TableName("comp_win7_config")
public class CompWin7Config extends Model<CompWin7Config> {

    private static final long serialVersionUID = 1L;

    @TableId("CONFIG_ID")
    private String configId;
    @TableField("BG_PICTURE_PATH")
    private String bgPicturePath;
    @TableField("USER_ID")
    private String userId;
    @TableField("CONFIG_DATA")
    private String configData;
    @TableField("OPEN_TYPE")
    private String openType;
    @TableField("DEFAULT_MAX")
    private Boolean defaultMax;
    @TableField("DEFAULT_WIDTH")
    private Integer defaultWidth;
    @TableField("DEFAULT_HEIGHT")
    private Integer defaultHeight;
    @TableField("DESK_STYLE")
    private String deskStyle;
    @TableField("EXT1")
    private String ext1;
    @TableField("EXT2")
    private String ext2;
    @TableField("EXT3")
    private String ext3;


    @Override
    protected Serializable pkVal() {
        return this.configId;
    }

}
