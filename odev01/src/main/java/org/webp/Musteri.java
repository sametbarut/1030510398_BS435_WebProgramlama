package org.webp;


import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
<<<<<<< HEAD
import javax.validation.constraints.*;
import java.util.ArrayList;
=======
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
>>>>>>> main
import java.util.List;


@Table(name = "Musteri")
@Entity
public class Musteri {

<<<<<<< HEAD
    @GeneratedValue
    @Id
    private Long mno;

    @OneToMany(mappedBy = "x")
    private List<MusteriUrun> ys = new ArrayList<>();

    @NotNull
    private String ad;

    @NotNull
=======
    @Column(name = "mno") @Id
    @OneToMany(mappedBy = "musteri")
    private List<MusteriUrun> mno;

    @NotNull
    @Pattern(regexp =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
    private String ad;

    @NotNull
    @Pattern(regexp =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
>>>>>>> main
    private String soyad;

    @NotNull
    private String dtarih;

<<<<<<< HEAD
    @NotBlank
    @Range(min = 0, max = 150)
    private Long tel;
=======

    @NotBlank
    @Range(min = 0, max = 150)
    private String tel;
>>>>>>> main

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
