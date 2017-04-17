package xyz.kots.springsecurity.service;

import xyz.kots.springsecurity.model.User;

/**
 * Service class for {@link xyz.kots.springsecurity.model.User}
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
