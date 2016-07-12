/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecom.repository.abstrac;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class AbstractDAO<PK extends Serializable, T>{
    private final Class<T> persistentClass;
    
    
    public AbstractDAO() {
       
        this.persistentClass = (Class<T>)((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }
    
    @Autowired
    private SessionFactory sessionFactory;
    
    protected Session getSession(){
        Session session;//= sessionFactory.getCurrentSession();
        //if(session==null)
        	session=sessionFactory.openSession();
        return session;
    }
    
    public T getByKey(PK key){
        return (T) getSession().get(persistentClass, key);
    }
    
    public void persist(T entity){
        getSession().persist(entity);
    }
    
    public void delete(T entity){
        getSession().delete(entity);
    }
    
    protected Criteria createEntityCriteria(){
        return getSession().createCriteria(persistentClass);
    }
}
