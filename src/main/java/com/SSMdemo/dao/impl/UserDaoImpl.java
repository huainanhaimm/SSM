package com.SSMdemo.dao.impl;

import com.SSMdemo.bean.UserBean;
import com.SSMdemo.dao.IUserDao;
import com.sun.javaws.Main;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {
    // spring容器注入一个工厂对象
    @Autowired
    private  SqlSessionFactory fa;

    //查看个人信息
    @Override
    public UserBean findById(int uid) {
        SqlSession session = null;
        UserBean user = null;
        try {
            //获取sqlsession
            session = fa.openSession(true);
            user = session.selectOne("UserMapper.findById",uid);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return user;
    }
}
