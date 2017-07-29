package com.demo.db;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class QueryDslHelper {
    @PersistenceContext
    private EntityManager entityManager;

    protected void saveOrUpdate(Object obj) {
        if (entityManager.contains(obj)) {
            entityManager.merge(obj);
        } else {
            entityManager.persist(obj);
        }
    }
}
