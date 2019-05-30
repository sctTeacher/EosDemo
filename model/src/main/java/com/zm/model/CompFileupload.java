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
@TableName("comp_fileupload")
public class CompFileupload extends Model<CompFileupload> {

    private static final long serialVersionUID = 1L;

    @TableId("FILEID")
    private String fileid;
    @TableField("FILENAME")
    private String filename;
    @TableField("FILEDATA")
    private byte[] filedata;
    @TableField("FILEPATH")
    private String filepath;
    @TableField("UPLOADUSER")
    private String uploaduser;
    @TableField("UPLOADTIME")
    private Date uploadtime;
    @TableField("SAVETYPE")
    private Integer savetype;
    @TableField("CONTENTTYPE")
    private String contenttype;
    @TableField("CLIENTFILENAME")
    private String clientfilename;
    @TableField("CLIENTPATH")
    private String clientpath;
    @TableField("NAME")
    private String name;
    @TableField("FILE_SIZE")
    private Long fileSize;


    @Override
    protected Serializable pkVal() {
        return this.fileid;
    }

}
