package com.ossic.db.mapper;

import com.ossic.db.entity.UserInfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoMapper implements RowMapper<UserInfo>{
    public UserInfo mapRow(ResultSet resultSet, int row) throws SQLException {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(resultSet.getInt("id"));
        userInfo.setName(resultSet.getString("name"));

        return userInfo;
    }
}
