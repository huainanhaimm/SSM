package com.SSMdemo.service;

import com.SSMdemo.bean.UserBean;

/**
 * 业务层：对逻辑业务进行处理
 */
public interface IUserService {
    // 根据id查询用户所有信息
    public UserBean findById(int uid);
}
