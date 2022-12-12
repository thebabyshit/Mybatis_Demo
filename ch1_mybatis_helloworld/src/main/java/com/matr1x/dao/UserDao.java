package com.matr1x.dao;

import com.matr1x.entity.User;

/**
 * @Author
 * @Date 2022/12/11 9:02
 * @Description
 **/
public interface UserDao {
    public User selectUser(int id);
}
