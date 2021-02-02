package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Role;
import com.upgrad.hirewheels.entities.Users;
import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.EntityManagerFactory;

public class RoleDaoImpl {
    private SessionBuilder<SessionBuilder> sessionFactory;

    public RoleDaoImpl(EntityManagerFactory entityManagerFactory) {
        this.sessionFactory = (SessionBuilder<SessionBuilder>) entityManagerFactory.unwrap(SessionFactory.class);
    }

    public Role findByRoleId(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Role role = session.get(Role.class, id);

        transaction.commit();
        session.close();

        return role;
    }
}
