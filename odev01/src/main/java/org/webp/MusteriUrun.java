package org.webp;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;


@Table(name = "MusteriUrun")
@Entity
public class MusteriUrun {

    @Column(name = "NO") @Id
    private Long No;

    @ManyToOne
    @JoinColumn(name = "mno", referencedColumnName = "Musteri")
    private Urun mno;

    public void setMno(Urun mno) {
        this.mno = mno;
    }

    @ManyToOne
    @JoinColumn(name = "uno", referencedColumnName = "Urun")
    private Urun uno;

    private String tarih;

    private String mmiktar;


    public Long getNo() {
        return No;
    }

    public void setNo(Long no) {
        No = no;
    }


    public Urun getUno() {
        return uno;
    }

    public void setUno(Urun uno) {
        this.uno = uno;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getMmiktar() {
        return mmiktar;
    }

    public void setMmiktar(String mmiktar) {
        this.mmiktar = mmiktar;
    }
}
