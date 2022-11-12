/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

/**
 *
 * @author Emanuel
 */
public class DaoFactory {

    /*
    public static UsuarioDao getUsuariosDao() {
        return new UsuarioDaoFile();
    }
     */
    public static UsuarioDao getUsuariosDao() {
        return new UsuarioDaoMySql();
    }

    public static AplicacionDao getAplicacionesDao() {
        return new AplicacionDaoMySql();
    }

    public static CompraDao getComprasDao() {
        return new CompraDaoMySql();
    }

}
