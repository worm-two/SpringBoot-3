package gou.xuming.spring.boot.mongo.repository;

import gou.xuming.entity.mongo.cat.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author: xuming
 * @Date: 2024:10:27 19:28
 * @Version: 1.0
 * @Description: TODO
 **/
public interface RoleRepository extends MongoRepository<Role,String> {

}
