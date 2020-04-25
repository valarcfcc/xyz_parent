package com.xyz.base.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

/**
 * <p>
 * 标签
 * </p>
 *
 * @author valarcfcc
 * @since 2020-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TbLabel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签ID
     */
    @NotNull(message = "id不能为空")
    private String id;

    /**
     * 标签名称
     */
    private String labelname;

    /**
     * 状态
     */
    private String state;

    /**
     * 使用数量
     */
    private Long count;

    /**
     * 是否推荐
     */
    private String recommend;

    /**
     * 粉丝数
     */
    private Long fans;


}
