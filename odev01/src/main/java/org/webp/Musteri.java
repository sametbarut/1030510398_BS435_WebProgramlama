package org.webp;


import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;


@Table(name = "Musteri")
@Entity
public class Musteri {

    @GeneratedValue
    @Id
    private Long mno;

    @OneToMany(mappedBy = "x")
    private List<MusteriUrun> ys = new ArrayList<>();

    @NotNull
    private String ad;

    @NotNull
    private String soyad;

    @NotNull
    private String dtarih;

    @NotBlank
    @Range(min = 0, max = 150)
    private Long tel;

    public Long getMno() {
        return mno;
    }

    public void setMno(Long mno) {
        this.mno = mno;
    }

    public List<MusteriUrun> getYs() {
        return ys;
    }

    public void setYs(List<MusteriUrun> ys) {
        this.ys = ys;
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

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public Musteri() {
    }
}
