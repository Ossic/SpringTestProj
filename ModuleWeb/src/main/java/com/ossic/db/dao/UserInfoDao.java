package com.ossic.db.dao;

import com.ossic.db.po.UserInfo;

import javax.sql.DataSource;
import java.util.List;

public interface UserInfoDao {

    void setDataSource(DataSource dataSource);

    void addUser(UserInfo userInfo);

    void delUserInfoById(int id);

    void delUserInfoByName(String name);

    void delallUserInfo();

    void updateUserInfo(UserInfo userInfo);

    List<UserInfo> allUserInfo();

    UserInfo queryUserInfoByName(String name);

    UserInfo queryUserInfoById(int id);

}