package com.xyz.search.controller;

import com.xyz.search.pojo.Article;
import com.xyz.search.service.ArticleSearchService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: valarcfcc
 * @Date: 2020/5/24 22:23
 * @Description:
 */
@RestController
@CrossOrigin
@RequestMapping("/article")
public class ArticleSearchController {
    @Autowired
    private ArticleSearchService articleSearchService;
    @RequestMapping(method= RequestMethod.POST)
    public Result save(@RequestBody Article article){
        articleSearchService.add(article);
        return Result.ok();
    }
}
