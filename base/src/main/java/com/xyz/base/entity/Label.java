package com.xyz.base.entity;

import lombok.Data;
import java.io.Serializable;

/**
 * @Auther: valarcfcc
 * @Date: 2020/4/20 00:02
 * @Description:
 */
@Data
public class Label implements Serializable {

    private String id;//
    private String labelname;//标签名称
    private String state;//状态
    private Long count;//使用数量
    private Long fans;//关注数
    private String recommend;//是否推荐
}
