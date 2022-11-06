package org.webp;


import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;


@Table(name = "Urun")
@Entity
public class Urun {

    @Column(name = "urun")
    @Id
    @NotBlank
    @Range(min = 0, max = 150)
    private Long Uno;
    @Column(name = "urun")
    private String uadi;

    private String fiyat;

    private String miktar;

    @OneToMany(mappedBy = "urun")
    private List<MusteriUrun> uno;

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