package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Repository
public abstract class UsersDaoImpl  implements  UsersDao{
    private SessionFactory sessionFactory;

    @Autowired
    public UsersDaoImpl(EntityManagerFactory entityManagerFactory) {
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }

    @Override
    public Users findByUserFirstName(String firstName) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Users users = session.get(Users.class, firstName);

        transaction.commit();
        session.close();

        return users;
    }

    @Override
    public Users findByUserLastName(String lastName) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Users users = session.get(Users.class, lastName);

        transaction.commit();
        session.close();

        return users;
    }

    @Override
    public Users findByUserEmail(String email) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Users users = session.get(Users.class, email);

        transaction.commit();
        session.close();

        return users;
    }

    @Override
    public Users findByUserMobileNumber(String mobile_no) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Users users = session.get(Users.class, mobile_no);

        transaction.commit();
        session.close();

        return users;
    }

    @Override
    public Users save(Users users) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(users);

        transaction.commit();
        session.close();

        return users;
    }

    @Override
    public Users findById(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Users users = session.get(Users.class, id);

        transaction.commit();
        session.close();

        return users;
    }

    @Override
    public Users update(Users users) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(users);

        transaction.commit();
        session.close();

        return users;
    }

    @Override
    public void delete(Users users) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Users mergedUsers = (Users)session.merge(users);
        session.delete(mergedUsers);

        transaction.commit();
        session.close();
    }
}
