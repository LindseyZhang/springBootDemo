package com.demo.user.repository;

import com.demo.db.QueryDslHelper;
import com.demo.user.model.User;
import com.demo.user.model.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.demo.user.model.QUser.user;

@Repository
public class UserRepositoryJPA extends QueryDslHelper implements UserRepository {

    @Override
    public Long store(User user) {
        saveOrUpdate(user);
        return user.getId();
    }

    @Override
    public Optional<User> get(Long id) {
        User tempUser = from(user).where(user.id.eq(id)).fetchOne();
        return Optional.ofNullable(tempUser);
    }

    @Override
    public Optional<User> auth(String username, String password) {
        User tempUser = from(user).where(user.username.eq(username), user.password.eq(password)).fetchOne();
        return Optional.ofNullable(tempUser);
    }
}
