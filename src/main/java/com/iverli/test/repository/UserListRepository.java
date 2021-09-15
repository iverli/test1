package com.iverli.test.repository;

import com.iverli.test.pojo.UserList;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserListRepository extends MongoRepository<UserList, String> {
}
