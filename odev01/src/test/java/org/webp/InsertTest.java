package org.webp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InsertTest {

    private EntityManagerFactory factory;
    private EntityManager em;

    @BeforeEach
    public void init() {
        factory = Persistence.createEntityManagerFactory("Hibernate");
        em = factory.createEntityManager();
    }

    @AfterEach
    public void tearDown() {


        em.close();
        factory.close();
    }

    private boolean persistInATransaction(Object obj) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            em.persist(obj);
            tx.commit();
        } catch (Exception e) {
            System.out.println("FAILED TRANSACTION: " + e.toString());
            tx.rollback();
            return false;
        }

        return true;
    }


    @Test
    public void testEmptyUrun() {

        Urun x =new Urun();
        Musteri y0 = new Musteri();
        Musteri y1 = new Musteri();
    }

    @Test
    public void insertMusteri() {

        Musteri musteri = new Musteri();
        musteri.setSoyad(String.valueOf(2L));

        boolean persisted = persistInATransaction(musteri);
        assertTrue(persisted);
    }

    @Test
    public void testMessageFail() {
        Urun user = new Urun();


        Urun urun = new Urun();
        urun.setFiyat(Long.valueOf(3L));

        boolean persisted = persistInATransaction(urun);
        assertTrue(persisted);
    }
}


