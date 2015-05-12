

package com.jsfdersleri.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="giris")
@SessionScoped
public class jsfGirisIslemleri {
    private String yazdir;

    public String getYazdir() {
        return yazdir;
    }

    public void setYazdir(String yazdir) {
        this.yazdir = yazdir;
    }
    @PostConstruct
    public void intit(){
        setYazdir("Merhaba Dünya!!");
    }
}
