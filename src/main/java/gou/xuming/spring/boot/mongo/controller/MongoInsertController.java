package gou.xuming.spring.boot.mongo.controller;


import gou.xuming.entity.mongo.cat.Person;
import gou.xuming.entity.mongo.cat.Role;
import jakarta.annotation.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @Author: xuming
 * @Date: 2024:10:27 12:54
 * @Version: 1.0
 * @Description: TODO
 **/
@RestController
@RequestMapping("mongo/")
public class MongoInsertController {

    @Resource
    private MongoTemplate mongoTemplate;

    @Resource
    private MongoRepository<Role, String> mongoRepository;


    @RequestMapping("/insert")
    public void insert() {

        Person person = new Person();
        person.setUserName("tom");
        person.setPassWord("777777");
        person.setCreateTime(LocalDateTime.now());

        mongoTemplate.insert(person);

    }

    @RequestMapping("/one")
    public void insertOne() {
    }

    @RequestMapping("/many")
    public void insertMany() {
    }

}
