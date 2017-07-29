package com.demo.db;

import com.querydsl.core.types.EntityPath;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;

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

    protected <T> JPAQuery<T> from(EntityPath<T> obj) {
        JPAQueryFactory jpaQueryFactory = new JPAQueryFactory(entityManager);
        return jpaQueryFactory.selectFrom(obj);
    }
}
