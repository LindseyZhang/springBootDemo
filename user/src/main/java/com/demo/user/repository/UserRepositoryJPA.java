package com.demo.user.repository;

import com.demo.user.model.User;
import com.demo.user.model.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepositoryJPA implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Long store(User user) {
        User newUser = entityManager.merge(user);
        return newUser.getId();
    }
}
