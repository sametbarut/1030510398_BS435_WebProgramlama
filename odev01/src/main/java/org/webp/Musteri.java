package org.webp;


import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;


@Table(name = "Musteri")
@Entity
public class Musteri {

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
    private String soyad;

    @NotNull
    private String dtarih;


    @NotBlank
    @Range(min = 0, max = 150)
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
