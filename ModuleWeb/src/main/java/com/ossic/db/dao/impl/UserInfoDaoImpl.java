package com.ossic.db.dao.impl;

import com.ossic.db.dao.UserInfoDao;
import com.ossic.db.po.UserInfo;
import com.ossic.db.mapper.UserInfoMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserInfoDaoImpl implements UserInfoDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void addUser(UserInfo userInfo) {
        String sql = "INSERT INTO person (id,name) VALUES (?,?)";
        jdbcTemplate.update(sql, userInfo.getId(), userInfo.getName());
        return;
    }

    public void delUserInfoById(int id) {
        String sql = "DELETE FROM person WHERE id=?";
        jdbcTemplate.update(sql, id);
        return;
    }

    public void delUserInfoByName(String name) {
        String sql = "DELETE FROM person WHERE name=?";
        jdbcTemplate.update(sql, name);
        return;
    }

    public void delallUserInfo() {
        String sql = "DELETE FROM person";
        jdbcTemplate.update(sql);
        return;
    }

    public void updateUserInfo(UserInfo userInfo) {
        String sql = "UPDATE person SET id=?,name=?";
        jdbcTemplate.update(sql, userInfo.getId(), userInfo.getName());
        return;
    }

    public List<UserInfo> allUserInfo() {
        String sql = "SELECT * FROM person";
        List<UserInfo> userInfos = jdbcTemplate.query(sql, new UserInfoMapper());
        return userInfos;
    }

    public UserInfo queryUserInfoByName(String name) {
        String sql = "SELECT * FROM person WHERE name=?";
        UserInfo userInfo = jdbcTemplate.queryForObject(sql, new UserInfoMapper(), name);
        return userInfo;
    }

    public UserInfo queryUserInfoById(int id) {
        String sql = "SELECT * FROM person WHERE id=?";
        UserInfo userInfo = jdbcTemplate.queryForObject(sql, new UserInfoMapper(), id);
        return userInfo;
    }
}
