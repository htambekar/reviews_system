package com.example.daos;

import com.example.entity.User;
import com.example.utils.SearchCriteria;

import java.util.List;

public interface UserDao {
    public List<User> searchUser(List<SearchCriteria> params);

    public void save(User entity);
}
