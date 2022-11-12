/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Usuario;
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
public class UsuarioDaoMySql implements UsuarioDao {

    public UsuarioDaoMySql() {
    }

    // no lo estoy usando = validarUs(String nom, String pw)
    public Usuario validarUs(String nom, String pw) throws DaoException {
        Usuario oUs = null;
        String query = "SELECT * "
                + "FROM usuarios "
                + "WHERE Nombre = '" + nom + "' "
                + "AND Pw = '" + pw + "' ";
        try (Connection conn = ConexionDaoMySql.getConexion();
                Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                oUs = new Usuario(rs.getInt("Id_Usuario"), rs.getString("Nombre"),
                        rs.getString("Apellido"), rs.getLong("DNI"), rs.getString("Email"),
                        rs.getString("Nickname"), rs.getString("Pw"), rs.getString("Imagen"),
                        rs.getByte("IsDev") != 0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException("Error al recuperar los usuarios", ex);
        }
        return oUs;
    }

    @Override
    public List<Usuario> readAll() throws DaoException {
        List<Usuario> lstUs = new ArrayList();
        String query = "SELECT * "
                + "FROM usuarios ";
        try (Connection conn = ConexionDaoMySql.getConexion();
                Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                boolean isDev = rs.getByte("IsDev") != 0; // convierte el byte recibido a un boolean
                lstUs.add(new Usuario(rs.getInt("Id_Usuario"), rs.getString("Nombre"),
                        rs.getString("Apellido"), rs.getLong("DNI"), rs.getString("Email"),
                        rs.getString("Nickname"), rs.getString("Pw"), rs.getString("Imagen"),
                        isDev));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException("Error al recuperar los usuarios", ex);
        }
        return lstUs;
    }

    @Override
    public void add(Usuario us) throws DaoException {
        us.setImgUs(us.getImgUs().replace("\\", "/")); // provisorio: cambia la barra invertida por que no la lee mysql
        byte isDev = (byte) (us.getIsDev() ? 1 : 0); // convierte un boolean a byte
        String query = "INSERT INTO usuarios ( Id_Usuario, Nombre, Apellido, DNI, "
                + "Email, Nickname, Pw, Imagen, IsDev) "
                + "VALUES ( " + us.getIdUs() + ", '" + us.getNomUs() + "', '" + us.getApeUs()
                + "', " + us.getDniUs() + ", '" + us.getEmailUs() + "', '"
                + us.getAliasUs() + "', '" + us.getPwUs() + "', '" + us.getImgUs()
                + "', " + isDev + ")";

        try (Connection con = ConexionDaoMySql.getConexion();
                Statement st = con.createStatement()) {

            st.executeUpdate(query);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException("Error al agregar un usuario a la tabla", ex);
        }
    }

    @Override
    public void update(Usuario usMod) throws DaoException {
        usMod.setImgUs(usMod.getImgUs().replace("\\", "/")); // provisorio: cambia la barra invertida por que no la lee mysql
        byte isDev = (byte) (usMod.getIsDev() ? 1 : 0); // convierte un boolean a byte
        String query = "UPDATE usuarios SET"
                + " Nombre='" + usMod.getNomUs() + "',"
                + " Apellido='" + usMod.getApeUs() + "',"
                + " DNI=" + usMod.getDniUs() + ","
                + " Email='" + usMod.getEmailUs() + "',"
                + " Nickname='" + usMod.getAliasUs() + "',"
                + " Pw='" + usMod.getPwUs() + "',"
                + " Imagen='" + usMod.getImgUs() + "',"
                + " IsDev=" + isDev
                + " WHERE Id_Usuario=" + usMod.getIdUs();
        try (Connection con = ConexionDaoMySql.getConexion();
                Statement st = con.createStatement()) {

            st.executeUpdate(query);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException("Error al modificar el usuario en la tabla", ex);
        }
    }
}
