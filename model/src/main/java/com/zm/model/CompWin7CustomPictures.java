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
@TableName("comp_win7_custom_pictures")
public class CompWin7CustomPictures extends Model<CompWin7CustomPictures> {

    private static final long serialVersionUID = 1L;

    @TableId("CUSTOM_ID")
    private String customId;
    @TableField("FILE_NAME")
    private String fileName;
    @TableField("USER_ID")
    private String userId;
    @TableField("UPLOAD_TIME")
    private String uploadTime;


    @Override
    protected Serializable pkVal() {
        return this.customId;
    }

}
