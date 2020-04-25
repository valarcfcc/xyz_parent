package com.xyz.base.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xyz.base.entity.Label;
import com.xyz.base.entity.TbLabel;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 标签 服务类
 * </p>
 *
 * @author valarcfcc
 * @since 2020-04-20
 */
public interface ITbLabelService extends IService<TbLabel> {
    public IPage<TbLabel> findSearch(Page<TbLabel> page,TbLabel label);
    public List<TbLabel> page(TbLabel label);
}
