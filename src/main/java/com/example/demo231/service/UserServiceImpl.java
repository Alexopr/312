package com.example.demo231.service;


import com.example.demo231.dao.UserDao;
import com.example.demo231.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service

public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    
    public UserServiceImpl(UserDao uD) {
        this.userDao = uD;
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    @Transactional
    public void update(Long id, User user) {
        userDao.update(id, user);
    }

    @Override
    @Transactional(readOnly = true)
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
}
