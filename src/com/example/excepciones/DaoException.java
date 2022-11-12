/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.excepciones;

/**
 *
 * @author Emanuel
 */
public class DaoException extends Exception {

    public DaoException(String mensaje, Exception e) {
        super(mensaje, e);
        System.out.println(mensaje);
    }
}
