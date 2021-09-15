package com.iverli.test.service;

import com.iverli.test.pojo.Users;

import java.util.List;

public interface UsersService {
    public List<Users> findAll();
    public List<Users> findAllByName(String name);

    Users save(Users users);

    List<Users> findAllByAge(int age);

    void delete(String name);
}
