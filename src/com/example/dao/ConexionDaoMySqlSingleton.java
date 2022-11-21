/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.excepciones.DaoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Emanuel
 */
public class ConexionDaoMySqlSingleton {

    private static Connection conn = null;
    private String url;
    private String usuario;
    private String password;
    
    // no funciona - a la segunda vez que se lo llama si es de un try con 
    // recursos la conexión ya se cerro y da error.
    
    private ConexionDaoMySqlSingleton() throws DaoException {
        String url = "jdbc:mysql://localhost:3306/appstoredb? [root on Default schema]";
        String usuario = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException e) {
            throw new DaoException("Error al tratar de conectarse a MySql DaoSingleton", e);
        }
    } 

    public static Connection getConexion() throws DaoException {
        if (conn == null) {
            new ConexionDaoMySqlSingleton();
        }
        return conn;
    }
}
