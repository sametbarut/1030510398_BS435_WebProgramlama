package org.webp;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;


@Table(name = "Urun")
@Entity
public class Urun {

    @Column(name = "urun")
    @Id
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

    @OneToMany(mappedBy = "Urun")
    private List<MusteriUrun> uno;

    public Urun() {
    }

    public void setUno(List<MusteriUrun> uno) {
        this.uno = uno;
    }

    public List<MusteriUrun> getGet() {
        return get;
    }

    public void setGet(List<MusteriUrun> get) {
        this.get = get;
    }

    public List<MusteriUrun> get;

    {
        this.Uno = Uno;
    }

    public Long getUno() {
        return Uno;
    }


    public String getUadi() {
        return uadi;
    }

    public void setUadi(String uadi) {
        this.uadi = uadi;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public String getMiktar() {
        return miktar;
    }

    public void setMiktar(String miktar) {
        this.miktar = miktar;
    }

}