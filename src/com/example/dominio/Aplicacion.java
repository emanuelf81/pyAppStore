/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

/**
 *
 * @author Emanuel
 */
public class Aplicacion {

    private int idApp;
    private String nomApp;
    private String descApp;
    private double precioApp;
    private int puntajeApp;
    private String comentApp;
    private String imagen;
    private int idUsuario;

    public Aplicacion(int idApp, String nomApp, String descApp, double precioApp, int puntosApp, String comentApp, int idUsuario, String imagen) {
        this.idApp = idApp;
        this.nomApp = nomApp;
        this.descApp = descApp;
        this.precioApp = precioApp;
        this.puntajeApp = puntosApp;
        this.comentApp = comentApp;
        this.idUsuario = idUsuario;        
        this.imagen = imagen;
    }

    public int getIdApp() {
        return idApp;
    }

    public void setIdApp(int idApp) {
        this.idApp = idApp;
    }

    public String getNomApp() {
        return nomApp;
    }

    public void setNomApp(String nomApp) {
        this.nomApp = nomApp;
    }

    public String getDescApp() {
        return descApp;
    }

    public void setDescApp(String descApp) {
        this.descApp = descApp;
    }

    public double getPrecioApp() {
        return precioApp;
    }

    public void setPrecioApp(double precioApp) {
        this.precioApp = precioApp;
    }

    public int getPuntajeApp() {
        return puntajeApp;
    }

    public void setPuntajeApp(int puntajeApp) {
        this.puntajeApp = puntajeApp;
    }

    public String getComentApp() {
        return comentApp;
    }

    public void setComentApp(String comentApp) {
        this.comentApp = comentApp;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Aplicacion{" + "idApp=" + idApp + ", nomApp=" + nomApp + ", descApp=" + descApp + ", precioApp=" + precioApp + ", puntajeApp=" + puntajeApp + ", comentApp=" + comentApp + ", imagen=" + imagen + ", idUsuario=" + idUsuario + '}';
    }

 

}
