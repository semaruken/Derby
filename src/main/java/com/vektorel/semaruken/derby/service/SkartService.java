/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.semaruken.derby.service;

import com.vektorel.semaruken.derby.entity.Skart;
import com.vektorel.semaruken.derby.util.SHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author sema
 */
public class SkartService implements TServiceBase<Skart> {

    public Skart save(Skart entity) {
        Session session = SHibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(entity);
        t.commit();
        session.close();
        return entity;
    }

    public Skart update(Skart entity) {
        Session session = SHibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(entity);
        t.commit();
        return entity;
    }

    public boolean delete(Skart entity) {
        Session session = SHibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(entity);
        t.commit();
        return true;
    }

    public List<Skart> getAll() {
        Session session = SHibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Skart.class);
        return criteria.list();
    }

    public Skart getById(Long id) {
         Session session = SHibernateUtil.getSessionFactory().openSession();
        Criteria criteria= session.createCriteria(Skart.class);
        criteria.add(Restrictions.eq("id", id));
        return (Skart) criteria.uniqueResult();
    }


    
}
