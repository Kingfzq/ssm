package cn.temptation.dao;

import cn.temptation.domain.User;

public interface UserDao {
    public abstract User findByUsername(String username);
}