/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.servicios;

import com.example.dominio.Aplicacion;
import com.example.dominio.Usuario;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emanuel
 */
public class GestorArchivos {

    private final String DIR_IMG_USUARIO = "./Archivos/ImgUsuario";
    private final String DIR_IMG_APLICACION = "./Archivos/ImgAplic";
    private final String IMG_DEFAULT_USUARIO = "./IconoDefaultUser.png";
    private final String IMG_DEFAULT_APP = "./IconoDefaultApp.png";

    public GestorArchivos() {
    }

    public void validarDirectorios() {
        try {
            if (Files.notExists(Paths.get(DIR_IMG_USUARIO))) {
                Files.createDirectories(Paths.get(DIR_IMG_USUARIO));
            }
            if (Files.notExists(Paths.get(DIR_IMG_APLICACION))) {
                Files.createDirectories(Paths.get(DIR_IMG_APLICACION));
            }
        } catch (IOException ex) {
            Logger.getLogger(GestorArchivos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al validar los directorios de las imágenes.");
        }
    }

    public void guardarImagen(Path origenImg, Object obj) {
        validarDirectorios();

        // Extensiones permitidas
        String exten = ".png";
        if (origenImg.toString().endsWith(".jpg")) {
            exten = ".jpg";
        } else if (origenImg.toString().endsWith(".gif")) {
            exten = ".gif";
        }

        int alea = (int) (1 + (Math.random() * 1000)); // genera un núm. aleatorio porque cuando modifico una imagen y tiene el mismo nombre al primer login me sigue trayendo la imagen anterior.

        try {
            File rutaDestino = null;
            if (obj instanceof Usuario) {
                Usuario us = (Usuario) obj;
                rutaDestino = new File(DIR_IMG_USUARIO + "/img" + alea + us.getNomUs() + us.getApeUs() + exten);
                Files.copy(origenImg, rutaDestino.toPath(), REPLACE_EXISTING, COPY_ATTRIBUTES);
                us.setImgUs(rutaDestino.getAbsolutePath());
            } else if (obj instanceof Aplicacion) {
                Aplicacion ap = (Aplicacion) obj;
                rutaDestino = new File(DIR_IMG_APLICACION + "/img" + alea + ap.getNomApp() + ap.getIdUsuario() + exten);
                Files.copy(origenImg, rutaDestino.toPath(), REPLACE_EXISTING, COPY_ATTRIBUTES);
                ap.setImagen(rutaDestino.getAbsolutePath());
            }
        } catch (IOException ex) {
            Logger.getLogger(GestorArchivos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al guardar la nueva imagen.");
        }
    }

    public String getImagenDefaultUsuario() {
        return new File(IMG_DEFAULT_USUARIO).getAbsolutePath();
    }

    public String getImagenDefaultApp() {
        return new File(IMG_DEFAULT_APP).getAbsolutePath();
    }

}
