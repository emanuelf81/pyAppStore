/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Usuario;
import com.example.excepciones.DaoException;
import java.util.List;

/**
 *
 * @author Emanuel
 */
public interface UsuarioDao {

    List<Usuario> readAll() throws DaoException;

    void add(Usuario us) throws DaoException;
    
    void update(Usuario us) throws DaoException;

}
