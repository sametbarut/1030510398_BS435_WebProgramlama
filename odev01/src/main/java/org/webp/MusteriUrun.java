package org.webp;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "MusteriUrun")
@Entity
public class MusteriUrun {

    @Column(name = "NO") @Id
    private Long No;

    private String mno;

    private String uno;

    private String tarih;

    private String mmiktar;

    public Long getNo() {
        return No;
    }

    public void setNo(Long no) {
        No = no;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
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
