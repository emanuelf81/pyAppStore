/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Aplicacion;
import com.example.excepciones.DaoException;
import java.util.List;

/**
 *
 * @author Emanuel
 */
public interface AplicacionDao {

    List<Aplicacion> readAll() throws DaoException;

    void add(Aplicacion ap) throws DaoException;
    
    void update(Aplicacion ap) throws DaoException;
    
}
