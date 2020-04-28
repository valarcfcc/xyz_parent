package com.xyz.base.mapper;

import com.xyz.base.mongo.Spit;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Auther: valarcfcc
 * @Date: 2020/4/28 21:40
 * @Description:
 */
public interface SpitMapper extends MongoRepository<Spit,String> {
}
