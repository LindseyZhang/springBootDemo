package com.demo.user.repository;

import com.demo.db.QueryDslHelper;
import com.demo.user.model.User;
import com.demo.user.model.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryJPA extends QueryDslHelper implements UserRepository {

    @Override
    public Long store(User user) {
        saveOrUpdate(user);
        return user.getId();
    }
}
