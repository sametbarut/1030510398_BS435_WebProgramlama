package org.webp;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> main
import java.util.List;


@Table(name = "Urun")
@Entity
public class Urun {

    @Id
<<<<<<< HEAD
    private Long Uno;
=======
    @NotNull
    @NotBlank
    @Range(min = 1, max = 150)
    private Long Uno;

    @Length(min=2, max = 128)
    @NotNull
    private String uadi;
    @Range(min = 0, max = 150)
    @NotBlank
    @NotNull
    private String fiyat;

    @Range(min = 1, max = 150)
    @NotBlank
    private String miktar;
>>>>>>> main

    @Length(min=2, max = 128)
    @NotNull
    private String uadi;


    @NotNull
    private Long fiyat;

    @Range(min = 1, max = 150)
    @NotBlank
    private Long miktar;

    @OneToMany(mappedBy = "y")
    public List<MusteriUrun>  ym= new ArrayList<>();

    public Urun() {
    }

    public Long getUno() {
        return Uno;
    }

    public void setUno(Long uno) {
        Uno = uno;
    }

    public String getUadi() {
        return uadi;
    }

    public void setUadi(String uadi) {
        this.uadi = uadi;
    }

    public Long getFiyat() {
        return fiyat;
    }

    public void setFiyat(Long fiyat) {
        this.fiyat = fiyat;
    }

    public Long getMiktar() {
        return miktar;
    }

    public void setMiktar(Long miktar) {
        this.miktar = miktar;
    }

    public List<MusteriUrun> getYm() {
        return ym;
    }

    public void setYm(List<MusteriUrun> ym) {
        this.ym = ym;
    }
}