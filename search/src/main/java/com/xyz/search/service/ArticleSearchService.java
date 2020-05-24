package com.xyz.search.service;

import com.xyz.search.dao.ArticleSearchDao;
import com.xyz.search.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: valarcfcc
 * @Date: 2020/5/24 22:22
 * @Description:
 */
@Service
public class ArticleSearchService {
    @Autowired
    private ArticleSearchDao articleSearchDao;
    /**
     * 增加文章
     * @param article
     */
    public void add(Article article){
        articleSearchDao.save(article);
    }
}
