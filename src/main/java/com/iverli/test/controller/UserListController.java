package com.iverli.test.controller;

import com.iverli.test.repository.UserListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userList")
public class UserListController {
    @Autowired
    private UserListRepository userListRepository;


}
