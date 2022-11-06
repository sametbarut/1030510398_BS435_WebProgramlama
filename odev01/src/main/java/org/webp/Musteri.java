package org.webp;


import javax.persistence.*;
import java.util.List;


@Table(name = "Musteri")
@Entity
public class Musteri {

    @Column(name = "mno") @Id

    @OneToMany(mappedBy = "musteri")
    private List<MusteriUrun> mno;

    private String ad;

    private String soyad;

    private String dtarih;

    private String tel;

    public List<MusteriUrun> getMno() {
        return mno;
    }

    public void setMno(List<MusteriUrun> mno) {
        this.mno = mno;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDtarih() {
        return dtarih;
    }

    public void setDtarih(String dtarih) {
        this.dtarih = dtarih;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
