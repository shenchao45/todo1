package com.shenchao.service;

import com.shenchao.dao.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shenchao on 17/5/24.
 */
public class UserService {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        this.users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
