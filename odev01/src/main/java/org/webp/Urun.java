package org.webp;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Table(name = "Urun")
@Entity
public class Urun {

    @Column(name = "urun") @Id
    private Long urun;

    private String uadi;

    private String fiyat;

    private String miktar;

    public Long getUrun() {
        return urun;
    }

    public void setUrun(Long urun) {
        this.urun = urun;
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
