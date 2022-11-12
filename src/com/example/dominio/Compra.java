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
public class Compra {
    
    private int id_Compra;
    private int id_Aplicacion;
    private int id_Usuario;
    private int calificacion;
    private String coment;

    public Compra(int id_Compra, int id_Aplicacion, int id_Usuario, int calificacion, String coment) {
        this.id_Compra = id_Compra;
        this.id_Aplicacion = id_Aplicacion;
        this.id_Usuario = id_Usuario;
        this.calificacion = calificacion;
        this.coment = coment;
    }

    public int getId_Compra() {
        return id_Compra;
    }

    public void setId_Compra(int id_Compra) {
        this.id_Compra = id_Compra;
    }

    public int getId_Aplicacion() {
        return id_Aplicacion;
    }

    public void setId_Aplicacion(int id_Aplicacion) {
        this.id_Aplicacion = id_Aplicacion;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String Coment) {
        this.coment = coment;
    }
    
    
    
}
