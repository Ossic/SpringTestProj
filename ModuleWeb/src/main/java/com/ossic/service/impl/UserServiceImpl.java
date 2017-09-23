package com.ossic.service.impl;

import com.ossic.db.dao.UserInfoDao;
import com.ossic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoDao userInfoDao;

    public String getUserNameById(int id) {
        if (id < 0) {
            return null;
        }
        return userInfoDao.queryUserInfoById(id).getName();
    }
}
