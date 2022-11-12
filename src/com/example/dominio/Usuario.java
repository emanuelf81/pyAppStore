/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

import java.io.Serializable;

/**
 *
 * @author Emanuel
 */
public class Usuario {

    private int idUs;
    private String nomUs;
    private String apeUs;
    private long dniUs;
    private String emailUs;    
    private String aliasUs;
    private String pwUs;
    private String imgUs;
    private boolean isDev;

    public Usuario() {
    }

    public Usuario(int idUs, String nomUs, String apeUs, long dniUs, String emailUs, String aliasUs, String pwUs, String imgUs, boolean isDev) {
        this.idUs = idUs;
        this.nomUs = nomUs;
        this.apeUs = apeUs;
        this.dniUs = dniUs;
        this.aliasUs = aliasUs;
        this.pwUs = pwUs;
        this.emailUs = emailUs;
        this.imgUs = imgUs;
        this.isDev = isDev;
    }

    public int getIdUs() {
        return idUs;
    }

    public void setIdUs(int idUs) {
        this.idUs = idUs;
    }

    public String getNomUs() {
        return nomUs;
    }

    public void setNomUs(String nomUs) {
        this.nomUs = nomUs;
    }

    public String getApeUs() {
        return apeUs;
    }

    public void setApeUs(String apeUs) {
        this.apeUs = apeUs;
    }

    public long getDniUs() {
        return dniUs;
    }

    public void setDniUs(long dniUs) {
        this.dniUs = dniUs;
    }

    public String getAliasUs() {
        return aliasUs;
    }

    public void setAliasUs(String aliasUs) {
        this.aliasUs = aliasUs;
    }

    public String getPwUs() {
        return pwUs;
    }

    public void setPwUs(String pwUs) {
        this.pwUs = pwUs;
    }

    public String getEmailUs() {
        return emailUs;
    }

    public void setEmailUs(String emailUs) {
        this.emailUs = emailUs;
    }

    public String getImgUs() {
        return imgUs;
    }

    public void setImgUs(String imgUs) {
        this.imgUs = imgUs;
    }

    public boolean getIsDev() {
        return isDev;
    }

    public void setIsDev(boolean isDev) {
        this.isDev = isDev;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUs=" + idUs + ", nomUs=" + nomUs +
                ", apeUs=" + apeUs + ", dniUs=" + dniUs + ", aliasUs=" + aliasUs +
                ", pwUs=" + pwUs + ", emailUs=" + emailUs + ", imgUs=" + imgUs +  ", isDev=" + isDev +'}';
    }






}
