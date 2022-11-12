/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.servicios;

import com.example.dao.DaoFactory;
import com.example.excepciones.DaoException;
import com.example.dao.UsuarioDao;
import com.example.dominio.Usuario;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emanuel
 */
public class GestorUsuarios {

    private final UsuarioDao usDao;
    private GestorArchivos gestorAr;

    public GestorUsuarios() {
        this.usDao = DaoFactory.getUsuariosDao();
        this.gestorAr = new GestorArchivos();
    }

    public Usuario validarUsuario(String apodoUs, String pwUs) {
        Usuario usValidado = null;
        try {
            List<Usuario> lstUs = usDao.readAll();
            for (Usuario us : lstUs) {
                if (us.getAliasUs().equals(apodoUs) && us.getPwUs().equals(pwUs)) {
                    usValidado = us;
                    break;
                }
            }
        } catch (DaoException ex) {
            System.out.println("Error al validar el usuario");
        }
        return usValidado;
    }

    public String nuevoUsuario(String nomUs, String apeUs,
            long dniUs, String emailUs, String aliasUs, String pwUs, String imgUs, boolean isDev) {
        String msj = "";
        try {
            List<Usuario> lstUs = usDao.readAll();
            for (Usuario us : lstUs) {
                if (us.getNomUs().equals(nomUs) && us.getApeUs().equals(apeUs)) {
                    msj = "El usuario ya existe.";
                    break;
                } else if (us.getAliasUs().equals(aliasUs)) {
                    msj = "El alias de usuario ya existe.";
                    break;
                } else if (us.getEmailUs().equals(emailUs)) {
                    msj = "La dirección de email ya existe.";
                    break;
                }
            }
            if (msj.equals("")) {
                Usuario us = new Usuario(lstUs.size() + 1, nomUs, apeUs, dniUs, emailUs, aliasUs, pwUs, imgUs, isDev);
                File dir = new File(imgUs);
                gestorAr.guardarImagen(dir.toPath(), us);
                usDao.add(us);
            }
        } catch (DaoException ex) {
            msj = "Error al registrar el usuario.";
            System.out.println(msj);
        }
        return msj;
    }

    public String modificarUsuario(int idUs, String nomUs, String apeUs,
            long dniUs, String emailUs, String aliasUs, String pwUs, String imgSelUs, boolean isDev) {
        String msj = "";
        try {
            Usuario usMod = new Usuario(idUs, nomUs, apeUs, dniUs, emailUs, aliasUs, pwUs, imgSelUs, isDev);
            File dir = new File(imgSelUs);
            gestorAr.guardarImagen(dir.toPath(), usMod);
            usDao.update(usMod);
        } catch (DaoException ex) {
            msj = "Error al modificar el usuario.";
            System.out.println(msj);
        }
        return msj;
    }

    public Usuario buscarUsuario(int id) {
        try {
            List<Usuario> lstUs = usDao.readAll();
            for (Usuario usAux : lstUs) {
                if (id == usAux.getIdUs()) {
                    return usAux;
                }
            }
        } catch (DaoException ex) {
            Logger.getLogger(GestorUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al buscar un usuario.");
        }
        return null;
    }

}
