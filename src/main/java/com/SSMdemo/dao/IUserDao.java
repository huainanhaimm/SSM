package com.SSMdemo.dao;

import com.SSMdemo.bean.UserBean;

/**
 *持久层：对数据进行持久化操作、对数据库进行操作
 */
public interface IUserDao {
    //查看个人信息
    public UserBean findById(int uid);
}
