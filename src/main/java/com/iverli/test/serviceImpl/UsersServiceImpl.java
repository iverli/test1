package com.iverli.test.serviceImpl;

import com.iverli.test.pojo.Users;
import com.iverli.test.repository.UsersRepository;
import com.iverli.test.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

    private UsersRepository usersRepository;
    @Autowired
    public void setUsersRepository(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public List<Users> findAllByName(String name) {
        return usersRepository.findByName(name);
    }

    @Override
    public Users save(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public List<Users> findAllByAge(int age) {
        return usersRepository.findByAge(age);
    }

    @Override
    public void delete(String name) {
        usersRepository.deleteByName(name);
    }


}
