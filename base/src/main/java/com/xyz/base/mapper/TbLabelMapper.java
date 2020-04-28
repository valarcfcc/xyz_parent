package com.xyz.base.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xyz.base.entity.Label;
import com.xyz.base.entity.TbLabel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 标签 Mapper 接口
 * </p>
 *
 * @author valarcfcc
 * @since 2020-04-20
 */
@Mapper
@Repository
public interface TbLabelMapper extends BaseMapper<TbLabel> {
    IPage<TbLabel> findSearch(Page<?> page, TbLabel label);
    List<TbLabel> page(TbLabel label);
}
