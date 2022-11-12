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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emanuel
 */
public class ConexionDaoMySql {

    private static Connection conn = null;

    //private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3333/appstoredb?serverTimezone=UTC";
    private static String usuario = "111mil";
    private static String password = "111mil";

    public ConexionDaoMySql() {
    }

    public static Connection getConexion() throws DaoException {
        try {
            //Class.forName(driver); // dice que no es necesario
            conn = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException("Error al tratar de conectarse a MySql", ex);
        } /*catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionDaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException("Error en el driver al tratar de conectarse a MySql", ex);
        }*/
        return conn;
    }
}
