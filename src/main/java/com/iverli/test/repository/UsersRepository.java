package com.iverli.test.repository;

import com.iverli.test.pojo.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface UsersRepository extends MongoRepository<Users,String> {
    public Page<Users> findByNameLike(String name, Pageable pageable);
    public List<Users> findByName(String name);

    //@Query(value = "delete from users where name = '{name}' ");
    void deleteByName(String name);

    List<Users> findAllByName(String name);

    public List<Users> findByAge(int age);
}
