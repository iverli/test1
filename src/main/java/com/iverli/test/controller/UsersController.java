package com.iverli.test.controller;

import com.iverli.test.pojo.Users;
import com.iverli.test.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {


    private UsersService usersService;
    @Autowired
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    /**
     * 查全部用户
     * @return
     */
    @GetMapping
    public List<Users> readUsers(){
        return usersService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Users createUser(@RequestBody Users users){
        return usersService.save(users);
    }


    /**
     * 根据年龄查询
     * @param age
     * @return
     */
    @GetMapping(value = "/{age}")
    public List<Users> findUserByAge(@PathVariable("age") int age){
        return usersService.findAllByAge(age);

    }

    /**
     * 根据用户姓名查询
     * @param name
     * @return
     */
    @GetMapping(value="/name/{name}")
    public List<Users> findUserByName(@PathVariable("name") String name){
        Users users = new Users();
        users.setName(name);
        return usersService.findAllByName(name);
    }

    @DeleteMapping(value = "/{name}")
    public void removeUser(@PathVariable("name") String name){
        usersService.delete(name);
    }
}
