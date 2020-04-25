package com.xyz.base.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xyz.base.entity.Label;
import entity.Result;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: valarcfcc
 * @Date: 2020/4/19 23:51
 * @Description:
 */

@RestController
@CrossOrigin
@RequestMapping("/label")
public class LabelController {
    @GetMapping
    public Result findAll(){
        return Result.ok();
    }
    @GetMapping("/{id}")
    public Result findById(@PathVariable("id") String id){
        return Result.ok(id);
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
