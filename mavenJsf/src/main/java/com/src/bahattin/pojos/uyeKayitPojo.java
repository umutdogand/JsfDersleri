
package com.src.bahattin.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Uyekayit")
public class uyeKayitPojo {
    private int id;
     private String adi;
     private String parola;
     private String telefonno;
     private String kangrubu;
     private int yas;
     
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "uye_id_seq")
    @SequenceGenerator(name = "uye_id_seq", sequenceName = "uye_id_seq", allocationSize = 1,initialValue = 10)
    @Column(name = "ID")

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
@Column(name = "Adi", length = 50)
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
@Column(name = "Parola", length = 50)
    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
@Column(name = "TelNo", length = 50)
    public String getTelefonno() {
        return telefonno;
    }

    public void setTelefonno(String telefonno) {
        this.telefonno = telefonno;
    }
@Column(name = "KanGrubu", length = 50)
    public String getKangrubu() {
        return kangrubu;
    }

    public void setKangrubu(String kangrubu) {
        this.kangrubu = kangrubu;
    }
@Column(name = "Yas", length = 50)
    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    
}

