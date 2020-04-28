package com.xyz.base.service;

import com.xyz.base.mapper.SpitMapper;
import com.xyz.base.mongo.Spit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.IdWorker;

import javax.xml.ws.ServiceMode;
import java.util.List;

/**
 * @Auther: valarcfcc
 * @Date: 2020/4/28 21:44
 * @Description:
 */
@Service
public class SpitService {
    @Autowired
    private SpitMapper spitMapper;
    @Autowired
    private IdWorker idWorker;

    public List<Spit> findAll() {
        return spitMapper.findAll();
    }

    public Spit findById(String id) {
        return spitMapper.findById(id).get();
    }

    public void save(Spit spit) {
        spit.set_id(idWorker.nextId() + "");
        spitMapper.save(spit);
    }

    public void update(Spit spit) {
        spitMapper.save(spit);
    }

}
