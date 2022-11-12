/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Compra;
import com.example.excepciones.DaoException;
import java.util.List;

/**
 *
 * @author Emanuel
 */
public interface CompraDao {

    List<Compra> readAll() throws DaoException;

    void add(Compra cApp) throws DaoException;
    
    void update(Compra cMod) throws DaoException;
}
