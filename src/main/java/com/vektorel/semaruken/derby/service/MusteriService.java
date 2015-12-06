/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.semaruken.derby.service;

import com.vektorel.semaruken.derby.entity.Musteri;
import com.vektorel.semaruken.derby.entity.Skart;
import com.vektorel.semaruken.derby.util.SHibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author sema
 */
public class MusteriService implements TServiceBase<Musteri> {

    public Musteri save(Musteri entity) {
        Session session = SHibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(entity);
        t.commit();
        return entity;
    }

    public Musteri update(Musteri entity) {
        Session session = SHibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(entity);
        t.commit();
        return entity;
    }

    public boolean delete(Musteri entity) {
        Session session = SHibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(entity);
        t.commit();
        return true;
    }

    public List<Musteri> getAll(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Musteri getById(Long entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
    }

