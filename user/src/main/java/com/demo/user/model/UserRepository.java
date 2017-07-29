package com.demo.user.model;

import java.util.Optional;

public interface UserRepository {
    Long store(User user);

    Optional<User> get(Long id);

    Optional<User> auth(String username, String password);
}
