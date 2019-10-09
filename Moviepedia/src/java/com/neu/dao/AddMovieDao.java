/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.dao;

import com.neu.pojo.Movie;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class AddMovieDao {
    
    private SessionFactory sessionFactory;
  private static Session session;
  
  protected SessionFactory setup() throws Exception{
      Configuration configuration = new Configuration();
       configuration.configure("hibernate.cfg.xml");
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();
        try {
            this.sessionFactory = configuration.buildSessionFactory(registry);
            
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
        
        return sessionFactory;
  }
  

    public AddMovieDao() {
    }
    private Session getSession() throws Exception
    {
        if(session==null||!session.isOpen())
        {
            session=setup().openSession();
        }
        return session;
    }
    private void beginTransaction() throws Exception
    {
        getSession().beginTransaction();
    }
    private void commit() throws Exception {
        getSession().getTransaction().commit();;
    }
    private void close() throws Exception {
        if (session != null) {
            getSession().close();
        }
    }
         private void rollbackTransaction() throws Exception {
        getSession().getTransaction().rollback();
    }
    
          public int AddMovie(String title, String actor, String actress, String genre, int year) throws Exception {
              Movie newMovie =null;
              int movieadded=0;
              try{
               beginTransaction();
            newMovie = new Movie();
            newMovie.setTitle(title);
            newMovie.setActor(actor);
            newMovie.setActress(actress);
            newMovie.setGenre(genre);
            newMovie.setYear(year);
            getSession().save(newMovie);
            commit();
            movieadded = 1;        
              
                  
              }catch(Exception e){
                  e.printStackTrace();
                  rollbackTransaction();
              }finally {
            close();
        }
              return movieadded;
              
          }
       public Movie searchMovie(long id) throws Exception{
        
        Movie searchMovie = null;
        
        try {
            beginTransaction();
            Query q= getSession().createQuery("from Movie where id= :id");
            q.setLong("id", id);
            searchMovie = (Movie)q.uniqueResult();
            commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            rollbackTransaction();
        } 
        finally {
            close();
        }
        
        return searchMovie;
    }
}
