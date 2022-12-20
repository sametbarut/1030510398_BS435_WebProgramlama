package org.webp.EJB;

import org.hibernate.Hibernate;
import org.webp.MusteriUrun;
import org.webp.Urun;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class UrunEJB {


    @PersistenceContext
    private EntityManager em;


    public Long create(int n){

        Urun urun = new Urun();
        for(int i=0; i<n; i++){
            urun.getYm().add(new MusteriUrun());
        }

        em.persist(urun);

        return urun.getUno();
    }



    public Urun getLazy(long uno){

        return em.find(Urun.class, uno);
    }


    public Urun getInitialized(long uno){

        Urun urun = em.find(Urun.class, uno);
        if(urun == null){
            return null;
        }

        urun.getYm().size();

        return urun;
    }


    public Urun getInitializedWithHibernate(long uno){

        Urun urun = em.find(Urun.class, uno);
        if(urun == null){
            return null;
        }

        Hibernate.initialize(urun.getYm());

        return urun;
    }


}
