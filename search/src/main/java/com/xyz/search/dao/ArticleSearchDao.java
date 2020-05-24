package com.xyz.search.dao;

import com.xyz.search.pojo.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Auther: valarcfcc
 * @Date: 2020/5/24 22:21
 * @Description:
 */
public interface ArticleSearchDao extends ElasticsearchRepository<Article,String> {
}
