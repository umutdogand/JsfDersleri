/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.src.bahattin.bean;

import com.src.bahattin.dao.uyeKayitDao;
import com.src.bahattin.pojos.uyeKayitPojo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author vekorel
 */
@ManagedBean
@RequestScoped
public class futbolcukayitbean {

    private int _id;
     private String _adi;
     private String _mevki;
     private String _formano;
     private String _ayakkabino;
    public void futbolcukayit() {
        
        uyeKayitPojo futbolcu = new uyeKayitPojo();
        futbolcu.setAdi(_adi);
        futbolcu.setParola(_mevki);
        futbolcu.setTelefonno(_formano);
        futbolcu.setKangrubu(_ayakkabino);
        uyeKayitDao kayit = new uyeKayitDao();
        kayit.ekle(futbolcu);
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getAdi() {
        return _adi;
    }

    public void setAdi(String _adi) {
        this._adi = _adi;
    }

    public String getMevki() {
        return _mevki;
    }

    public void setMevki(String _mevki) {
        this._mevki = _mevki;
    }

    public String getFormano() {
        return _formano;
    }

    public void setFormano(String _formano) {
        this._formano = _formano;
    }

    public String getAyakkabino() {
        return _ayakkabino;
    }

    public void setAyakkabino(String _ayakkabino) {
        this._ayakkabino = _ayakkabino;
    }
    
    
}
