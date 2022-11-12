/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.servicios;

import com.example.dao.CompraDao;
import com.example.dao.DaoFactory;
import com.example.dominio.Aplicacion;
import com.example.dominio.Compra;
import com.example.dominio.Usuario;
import com.example.excepciones.DaoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emanuel
 */
public class GestorCompras {

    private final CompraDao compraDao;
    private static final GestorAplicaciones gestorApp = new GestorAplicaciones();

    public GestorCompras() {
        this.compraDao = DaoFactory.getComprasDao();
    }

    public boolean nuevaCompra(int id_Aplicacion, int id_Usuario) {
        try {
            List<Compra> lstCompras = compraDao.readAll();
            Compra com = new Compra(lstCompras.size() + 1, id_Aplicacion, id_Usuario, 0, "");
            compraDao.add(com);
        } catch (DaoException ex) {
            System.out.println("Error al registrar la compra.");
            return false;
        }
        return true;
    }

    public List<Compra> leerTodasCompras() {
        List<Compra> lstCompras = new ArrayList();
        try {
            lstCompras = compraDao.readAll();
        } catch (DaoException ex) {
            Logger.getLogger(GestorAplicaciones.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al leer la tabla de compras.");
        }
        return lstCompras;
    }

    public String modificarCompra(Compra com) {
        String msj = "";
        try {
            compraDao.update(com);
        } catch (DaoException ex) {
            msj = "Error al actualizar la aplicación.";
            System.out.println(msj);
        }
        return msj;
    }

    public String calificarAppComprada(int idApp, Usuario us, int califApp, String comentApp) {
        String msj = "";
        int califTotal, cantCalif;
        // actualiza la compra en la BD aplicaciones_compradas
        List<Compra> lstCompras = leerTodasCompras();
        for (Compra compra : lstCompras) {
            if (compra.getId_Aplicacion() == idApp && compra.getId_Usuario() == us.getIdUs()) {
                compra.setCalificacion(califApp);
                compra.setComent(comentApp);
                msj = modificarCompra(compra);
                break;
            }
        }
        // calcula el promedio de calificaciones de la aplicación
        // tener en consideración que la apps no calificadas por defecto es = 0
        // promedio = valor entero entre 1 y 5 por redondeo.
        cantCalif = 0;
        califTotal = 0;
        for (Compra compra : lstCompras) {
            if (compra.getId_Aplicacion() == idApp) {
                califTotal += compra.getCalificacion();
                cantCalif++;
            }
        }
        int promCalif = 0;
        if (califTotal != 0 || cantCalif != 0) {
            promCalif = Math.round(califTotal / cantCalif);
        } else {
            promCalif = 0;
        }

        // actualiza el promedio de calificaciones en la BD aplicaciones
        List<Aplicacion> lstApps = gestorApp.leerTodasAplicaciones();
        for (Aplicacion app : lstApps) {
            if (app.getIdApp() == idApp) {
                app.setPuntajeApp(promCalif);
                msj = gestorApp.modificarAplicacion(app);
            }
        }
        System.out.println(msj);
        return msj;
    }
}
