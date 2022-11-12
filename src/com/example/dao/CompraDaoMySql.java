/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Compra;
import com.example.excepciones.DaoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emanuel
 */
public class CompraDaoMySql implements CompraDao {
    
    public CompraDaoMySql() {
    }


    @Override
    public void add(Compra cApp) throws DaoException {
        String query = "INSERT INTO aplicaciones_compradas ( Id_Compra, Id_Aplicacion, Id_Usuario, Calif, Coment ) "
                + "VALUES ( " + cApp.getId_Compra() + ", " + cApp.getId_Aplicacion()
                + ", " + cApp.getId_Usuario() + ", " + cApp.getCalificacion() 
                + ", '" + cApp.getComent() + "')";

        try (Connection con = ConexionDaoMySql.getConexion();
                Statement st = con.createStatement()) {

            st.executeUpdate(query);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException("Error al agregar una aplicación a la tabla", ex);
        }

    }

    @Override
    public List<Compra> readAll() throws DaoException {
        List<Compra> lstCom = new ArrayList();

        String query = "SELECT * "
                + "FROM aplicaciones_compradas ";
        try (Connection conn = ConexionDaoMySql.getConexion();
                Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                lstCom.add(new Compra(rs.getInt("Id_Compra"), rs.getInt("Id_Aplicacion"),
                        rs.getInt("Id_Usuario"), rs.getInt("Calif"), rs.getString("Coment")));
            } 
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException("Error al recuperar las aplicaciones.", ex);
        }
        return lstCom;
    }
    
        @Override
    public void update(Compra cMod) throws DaoException {
        String query = "UPDATE aplicaciones_compradas SET"
                + " Id_Aplicacion=" + cMod.getId_Aplicacion() + ","
                + " Id_Usuario=" + cMod.getId_Usuario() + ","
                + " Calif=" + cMod.getCalificacion() + ","
                + " Coment='" + cMod.getComent() + "'"
                + " WHERE Id_Compra=" + cMod.getId_Compra();
        try (Connection con = ConexionDaoMySql.getConexion();
                Statement st = con.createStatement()) {

            st.executeUpdate(query);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException("Error al modificar la compra en la tabla", ex);
        }

    }
}
