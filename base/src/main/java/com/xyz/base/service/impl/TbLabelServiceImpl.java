package com.xyz.base.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xyz.base.dao.LabelDao;
import com.xyz.base.entity.Label;
import com.xyz.base.entity.TbLabel;
import com.xyz.base.mapper.TbLabelMapper;
import com.xyz.base.service.ITbLabelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 标签 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2020-04-20
 */
@Service
public class TbLabelServiceImpl extends ServiceImpl<TbLabelMapper, TbLabel> implements ITbLabelService {

    @Autowired
    private TbLabelMapper tbLabelMapper;

    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public IPage<TbLabel> findSearch(Page<TbLabel> page, TbLabel label) {
        return tbLabelMapper.findSearch(page,label);
    }

    @Override
    public List<TbLabel> page(TbLabel label) {
        return tbLabelMapper.page(label);
    }

    /**
     * 修改
     * @param label
     */
    @Override
    public void update(TbLabel label) {
        redisTemplate.delete( "base" + label.getId() );//删除缓存
        tbLabelMapper.insert(label);
    }
    /**
     * 删除
     * @param id
     */
    @Override
    public void deleteById(String id) {
        redisTemplate.delete( "base" + id );//删除缓存
        tbLabelMapper.deleteById(id);
    }

}
