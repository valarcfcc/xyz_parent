package com.xyz.base.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xyz.base.entity.Label;
import com.xyz.base.entity.TbLabel;
import com.xyz.base.service.ITbLabelService;

import entity.Result;
import entity.ReqEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import util.IdWorker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 标签 前端控制器
 * </p>
 *
 * @author valarcfcc
 * @since 2020-04-20
 */
@RestController
@RequestMapping("/tbLabel")
public class TbLabelController {
    @Autowired
    private ITbLabelService tbLabelService;
    @Autowired
    private IdWorker idWorker;
    @Autowired
    private ObjectMapper mapper;
    @Autowired

    private RedisTemplate redisTemplate;


    @GetMapping()
    public Result findAll() throws JsonProcessingException{
        List<TbLabel> labels =  tbLabelService.list();
        return Result.ok(mapper.writeValueAsString(labels));
    }

    @PostMapping("/page")
    public Result page(@RequestBody ReqEntity reqEntity){
        TbLabel label = JSON.parseObject(reqEntity.getData(),TbLabel.class);
        PageHelper.startPage(reqEntity.getPageNum(),reqEntity.getPageSize());
        PageInfo pageInfo = new PageInfo(tbLabelService.page(label));
        List<TbLabel> labelList = pageInfo.getList();
        return Result.ok(JSON.toJSONString(pageInfo));


    }

    @PostMapping("/search")
    public Result findSearch(@RequestBody ReqEntity reqEntity)throws JsonProcessingException{
        System.out.printf(reqEntity.getData());
        TbLabel label = JSON.parseObject(reqEntity.getData(),TbLabel.class);
        System.out.printf(label.getId());
        System.out.printf(reqEntity.getPageNum().toString());
        Page<TbLabel> page = new Page<>(reqEntity.getPageNum(),reqEntity.getPageSize());
        IPage<TbLabel> tbLabelIPage = tbLabelService.findSearch(page,label);
        return Result.ok(mapper.writeValueAsString(tbLabelIPage));

    }
    @GetMapping("/{id}")
    public Result findById(@PathVariable("id") String id){
        TbLabel label = (TbLabel)redisTemplate.opsForValue().get("base"+id);
        Map<String,Object> data = new HashMap<>();
        if(label==null){
            label=tbLabelService.getById(id);
            redisTemplate.opsForValue().set("base"+id,label);
            data.put("数据源","mysql");
            data.put("data",label);
            return Result.ok(JSON.toJSONString(data));
        }else {
            data.put("数据源","redis");
            data.put("data",label);
            return Result.ok(JSON.toJSONString(data));
        }


    }
    @PostMapping
    public Result save(@RequestBody Label label) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return Result.ok(mapper.writeValueAsString(label));
    }
    @PostMapping("/update")
    public Result update(@RequestBody Label label) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return Result.ok(mapper.writeValueAsString(label));
    }
    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable("id") String id){
        return Result.ok(id);
    }

}
