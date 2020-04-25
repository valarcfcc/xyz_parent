package com.xyz.base.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xyz.base.entity.Label;


/**
 * @Auther: valarcfcc
 * @Date: 2020/4/20 00:26
 * @Description:
 */
public interface LabelDao {
    IPage<Label> findSearch(Page<?> page,Label label);
}
