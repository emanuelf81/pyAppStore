/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.servicios;

import com.example.dao.AplicacionDao;
import com.example.dao.DaoFactory;
import com.example.dominio.Aplicacion;
import com.example.dominio.Compra;
import com.example.dominio.Usuario;
import com.example.excepciones.DaoException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emanuel
 */
public class GestorAplicaciones {

    private final AplicacionDao appDao;
    private final GestorArchivos gestorAr;
    private final GestorCompras gestorComp;

    public GestorAplicaciones() {
        this.appDao = DaoFactory.getAplicacionesDao();
        this.gestorAr = new GestorArchivos();
        this.gestorComp = new GestorCompras();
    }

    public String nuevaAplicacion(String nomApp, String descripApp,
            double precioApp, int idUs, String imgApp) {
        String msj = "";
        try {
            List<Aplicacion> lstAp = appDao.readAll();
            for (Aplicacion ap : lstAp) {
                if (ap.getNomApp().equals(nomApp)) {
                    msj = "La aplicación ya existe.";
                    break;
                }
            }
            if (msj.equals("")) {
                Aplicacion ap = new Aplicacion(lstAp.size() + 1, nomApp, descripApp, precioApp, 0, "", idUs, imgApp);
                File dir = new File(imgApp);
                gestorAr.guardarImagen(dir.toPath(), ap);
                appDao.add(ap);
            }
        } catch (DaoException ex) {
            msj = "Error al registrar la aplicación.";
            System.out.println(msj);
        }
        return msj;
    }

    public List<Aplicacion> leerTodasAplicaciones() {
        List<Aplicacion> lstApp = new ArrayList();
        try {
            lstApp = appDao.readAll();
        } catch (DaoException ex) {
            Logger.getLogger(GestorAplicaciones.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al leer la tabla de aplicaciones.");
        }
        return lstApp;
    }

    public String modificarAplicacion(Aplicacion app) {
        String msj = "";
        try {
            appDao.update(app);
        } catch (DaoException ex) {
            msj = "Error al actualizar la aplicación.";
            System.out.println(msj);
        }
        return msj;
    }

    // filtros
    public List<Aplicacion> leerTodasAppsCompradas(List<Aplicacion> lstApp,Usuario us) {
        List<Aplicacion> lstRpt = new ArrayList();
        List<Compra> lstCompras = gestorComp.leerTodasCompras();
        for (Compra compra : lstCompras) {
            if (compra.getId_Usuario() == us.getIdUs()) {
                for (Aplicacion app : lstApp) {
                    if (compra.getId_Aplicacion() == app.getIdApp()) {
                        lstRpt.add(app);
                    }
                }
            }
        }
        return lstRpt;
    }

    public List<Aplicacion> aplicPorUsuario(List<Aplicacion> lstApp, Usuario us) {
        List<Aplicacion> lstAppAux = new ArrayList();
        for (Aplicacion app : lstApp) {
            if (app.getIdUsuario() == us.getIdUs()) {
                lstAppAux.add(app);
            }
        }
        return lstAppAux;
    }

    public List<Aplicacion> aplicOtrosUsuarios(List<Aplicacion> lstApp, Usuario us) {
        List<Aplicacion> lstAppAux = new ArrayList();
        for (Aplicacion app : lstApp) {
            if (app.getIdUsuario() != us.getIdUs()) {
                lstAppAux.add(app);
            }
        }
        return lstAppAux;
    }

    public List<Aplicacion> aplicPublicadas(List<Aplicacion> lstApp, Usuario us) {
        List<Aplicacion> lstAppAux = new ArrayList();
        for (Aplicacion app : lstApp) {
            if (app.getIdUsuario() == us.getIdUs()) {
                lstAppAux.add(app);
            }
        }
        return lstAppAux;
    }

    public List<Aplicacion> aplicBuscarPor(List<Aplicacion> lstApp, String buscar) {
        List<Aplicacion> lstAppAux = new ArrayList();
        for (Aplicacion app : lstApp) {
            if (app.getNomApp().toLowerCase().contains(buscar.toLowerCase())
                    || app.getDescApp().toLowerCase().contains(buscar.toLowerCase())) {
                lstAppAux.add(app);
            }
        }
        return lstAppAux;
    }
}
