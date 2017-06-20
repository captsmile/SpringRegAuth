package com.vi.service;

import com.vi.model.User;

/**
 * Created by Vitalii on 20.06.2017.
 */
public interface UserServ {
    User findUserByEmail(String email);
    void saveUser(User user);
}
