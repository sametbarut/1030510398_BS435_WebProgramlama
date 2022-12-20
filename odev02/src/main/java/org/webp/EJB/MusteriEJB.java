package org.webp.EJB;


import org.webp.Musteri;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotNull;

@Stateless
public class MusteriEJB {


    @PersistenceContext
    private EntityManager em;

    public MusteriEJB() {}

    public void registerNewMusteri(@NotNull Long mno, @NotNull String ad, @NotNull String soyad){
        if(isRegistered(mno)){
            return;
        }

        Musteri musteri = new Musteri();
        musteri.setMno(mno);
        musteri.setAd(ad);
        musteri.setSoyad(soyad);

        em.persist(musteri);
    }

    public boolean isRegistered(@NotNull Long mno){
        Musteri musteri = em.find(Musteri.class, mno);
        return musteri != null;
    }


}
