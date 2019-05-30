package com.zm.model;

import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("eos_qrtz_locks")
public class EosQrtzLocks extends Model<EosQrtzLocks> {

    private static final long serialVersionUID = 1L;

    @TableId("LOCK_NAME")
    private String lockName;


    @Override
    protected Serializable pkVal() {
        return this.lockName;
    }

}
