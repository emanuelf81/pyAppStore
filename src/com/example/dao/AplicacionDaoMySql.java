/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Aplicacion;
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
public class AplicacionDaoMySql implements AplicacionDao {

    public AplicacionDaoMySql() {
    }

    @Override
    public List<Aplicacion> readAll() throws DaoException {
        List<Aplicacion> lstAp = new ArrayList();

        String query = "SELECT * "
                + "FROM aplicaciones ";
        try (Connection conn = ConexionDaoMySql.getConexion();
                Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                lstAp.add(new Aplicacion(rs.getInt("Id_Aplicacion"), rs.getString("Nombre"),
                        rs.getString("Descrip"), rs.getDouble("Precio"), rs.getInt("Puntaje"),
                        rs.getString("Coment"), rs.getInt("Id_Usuario"), rs.getString("Imagen")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException("Error al recuperar las aplicaciones.", ex);
        }
        return lstAp;
    }

    @Override
    public void add(Aplicacion ap) throws DaoException {
        ap.setImagen(ap.getImagen().replace("\\", "/")); // provisorio: cambia la barra invertida por que no la lee mysql
        String query = "INSERT INTO aplicaciones ( Id_Aplicacion, Nombre, Descrip, Precio, "
                + "Puntaje, Coment, Id_Usuario, Imagen) "
                + "VALUES ( " + ap.getIdApp() + ", '" + ap.getNomApp() + "', '" + ap.getDescApp()
                + "', " + ap.getPrecioApp() + ", " + ap.getPuntajeApp() + ", '"
                + ap.getComentApp() + "', " + ap.getIdUsuario() + ", '" + ap.getImagen() + "')";

        try (Connection con = ConexionDaoMySql.getConexion();
                Statement st = con.createStatement()) {

            st.executeUpdate(query);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException("Error al agregar una aplicación a la tabla", ex);
        }

    }

    @Override
    public void update(Aplicacion apMod) throws DaoException {
        apMod.setImagen(apMod.getImagen().replace("\\", "/")); // provisorio: cambia la barra invertida por que no la lee mysql
        String query = "UPDATE aplicaciones SET"
                + " Nombre='" + apMod.getNomApp() + "',"
                + " Descrip='" + apMod.getDescApp() + "',"
                + " Precio=" + apMod.getPrecioApp() + ","
                + " Puntaje=" + apMod.getPuntajeApp() + ","
                + " Coment='" + apMod.getComentApp() + "',"
                + " Id_Usuario=" + apMod.getIdUsuario() + ","
                + " Imagen='" + apMod.getImagen() + "'"
                + " WHERE Id_Aplicacion=" + apMod.getIdApp();
        try (Connection con = ConexionDaoMySql.getConexion();
                Statement st = con.createStatement()) {

            st.executeUpdate(query);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException("Error al modificar la aplicación en la tabla", ex);
        }

    }
}
