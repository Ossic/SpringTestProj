package com.ossic.db.dao;

import com.ossic.db.entity.UserInfo;

import javax.sql.DataSource;
import java.util.List;

public interface UserInfoDao {

    public void setDataSource(DataSource dataSource);

    public void addUser(UserInfo userInfo);

    public void delUserInfoById(int id);

    public void delUserInfoByName(String name);

    public void delallUserInfo();

    public void updateUserInfo(UserInfo userInfo);

    public List<UserInfo> allUserInfo();

    public List<UserInfo> queryUserInfoByName(String name);

}