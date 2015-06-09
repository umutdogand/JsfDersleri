/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.src.bahattin.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Futbolcukayit")

public class futbolcukayitpojo {
    private int _id;
     private String adi;
     private String mevki;
     private String formano;
     private String ayakkabino;

@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "futbolcu_id_seq")
    @SequenceGenerator(name = "futbolcu_id_seq", sequenceName = "futbolcu_id_seq", allocationSize = 1,initialValue = 10)
    @Column(name = "ID")

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }
@Column(name = "Adi", length = 50)
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
@Column(name = "Mevki", length = 50)
    public String getMevki() {
        return mevki;
    }

    public void setMevki(String mevki) {
        this.mevki = mevki;
    }
@Column(name = "Forma_No", length = 50)
    public String getFormano() {
        return formano;
    }

    public void setFormano(String formano) {
        this.formano = formano;
    }
@Column(name = "Ayakkabı_No", length = 50)
    public String getAyakkabino() {
        return ayakkabino;
    }

    public void setAyakkabino(String ayakkabino) {
        this.ayakkabino = ayakkabino;
    }

}
