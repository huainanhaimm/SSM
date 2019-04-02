package com.SSMdemo.service.service.impl;

import com.SSMdemo.bean.UserBean;
import com.SSMdemo.dao.IUserDao;
import com.SSMdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImple implements IUserService {
    @Autowired
    IUserDao dao;
    @Override
    public UserBean findById(int uid) {
        UserBean bean = dao.findById(uid);
        return bean;
    }
}