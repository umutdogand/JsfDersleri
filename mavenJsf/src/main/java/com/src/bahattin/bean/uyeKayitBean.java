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
public class uyeKayitBean {

    private int _id;
     private String _adi;
     private String _parola;
     private String _telefonno;
     private String _kangrubu;
     private int _yas;
     private boolean kabul;
     
    public uyeKayitBean() {
        
        uyeKayitPojo uye = new uyeKayitPojo();
        uye.setAdi(_adi);
        uye.setParola(_parola);
        uye.setTelefonno(_telefonno);
        uye.setKangrubu(_kangrubu);
        uye.setYas(_yas);
        uyeKayitDao kayit = new uyeKayitDao();
        kayit.ekle(uye);
        
        
        
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

    public String getParola() {
        return _parola;
    }

    public void setParola(String _parola) {
        this._parola = _parola;
    }

    public String getTelefonno() {
        return _telefonno;
    }

    public void setTelefonno(String _telefonno) {
        this._telefonno = _telefonno;
    }

    public String getKangrubu() {
        return _kangrubu;
    }

    public void setKangrubu(String _kangrubu) {
        this._kangrubu = _kangrubu;
    }

    public int getYas() {
        return _yas;
    }

    public void setYas(int _yas) {
        this._yas = _yas;
    }

    public boolean isKabul() {
        return kabul;
    }

    public void setKabul(boolean kabul) {
        this.kabul = kabul;
    }
    
}
