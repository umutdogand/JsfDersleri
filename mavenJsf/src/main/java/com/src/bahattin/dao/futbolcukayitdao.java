/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.src.bahattin.dao;

import com.src.bahattin.bean.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author vekorel
 */
public class futbolcukayitdao {
    public void ekle(Object o) {
        Session se=NewHibernateUtil.getSessionFactory().openSession();
        Transaction t=se.beginTransaction();
        se.save(o);
        t.commit();
    
}
}