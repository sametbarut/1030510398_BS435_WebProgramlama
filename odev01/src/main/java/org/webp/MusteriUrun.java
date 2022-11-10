package org.webp;


import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Table(name = "MusteriUrun")
@Entity
public class MusteriUrun {

    @Id
    @GeneratedValue
    private Long No;

    @ManyToOne
    private Musteri y;

    @ManyToOne
    private Urun x;

    @NotBlank
    @NotNull
    private String tarih;

    @NotNull
    @NotBlank
    @Range(min = 0, max = 150)
    private Long miktar;

    public MusteriUrun() {
    }

    public Long getNo() {
        return No;
    }

    public void setNo(Long no) {
        No = no;
    }

    public Musteri getY() {
        return y;
    }

    public void setY(Musteri y) {
        this.y = y;
    }

    public Urun getX() {
        return x;
    }

    public void setX(Urun x) {
        this.x = x;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public Long getMiktar() {
        return miktar;
    }

    public void setMiktar(Long miktar) {
        this.miktar = miktar;
    }
}

