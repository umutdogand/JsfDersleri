/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jsfdersleri.beans;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("a")
public class Kontrol implements Validator{
    

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String girilenDeger = o.toString();
                if(girilenDeger.indexOf('@') <0 ||girilenDeger.contains(".")) {
                 if(!girilenDeger.contains("gmail") && !girilenDeger.contains("hotmail")){
                     FacesMessage message = new FacesMessage("Format Uygun Değil");
                    throw new ValidatorException(message);
                }
                }
    }
    
}
