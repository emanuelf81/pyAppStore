/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gui;

import com.example.dominio.Usuario;
import com.example.servicios.GestorArchivos;
import com.example.servicios.GestorUsuarios;
import java.awt.Frame;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Emanuel
 */
public class JDUsuario extends javax.swing.JDialog {

    private final GestorUsuarios gestorUs;
    private final GestorArchivos gestorAr;
    private final Usuario us;
    private File fileNvaImgUs;
    private File fileImgUs;
    private final Frame jfa;

    public JDUsuario(java.awt.Frame parent, boolean modal, Usuario us) {
        super(parent, modal);
        this.jfa = parent;
        this.us = us;

        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        gestorUs = new GestorUsuarios();
        gestorAr = new GestorArchivos();
        this.fileNvaImgUs = null;
        dialogModo();
    }

    private void dialogModo() {
        if (us == null) {
            // Nuevo usuario
            this.setTitle("Nuevo Usuario");
            fileImgUs = new File(gestorAr.getImagenDefaultUsuario());
        } else {
            // Modificar Usuario
            this.setTitle("Modificar Usuario");
            JTFNomUs.setEnabled(false);
            JTFApeUs.setEnabled(false);
            JTFDniUs.setEnabled(false);
            fileImgUs = new File(us.getImgUs());
            rellenarInfoUsuario();
        }
        JLImgUs.setIcon(new ImageIcon(fileImgUs.getAbsolutePath()));
    }

    private void rellenarInfoUsuario() {
        //idUsuario = no se modifica, es único y mantiene el original
        JTFNomUs.setText(us.getNomUs());
        JTFApeUs.setText(us.getApeUs());
        JTFDniUs.setText(String.valueOf(us.getDniUs()));
        JTFEmailUs.setText(us.getEmailUs());
        JTFAliasUs.setText(us.getAliasUs());
        JPFPwUs.setText("");
        JPFPwUsR.setText("");
        //isDev = no se permite modificar, es identificatorio para uso del sistema.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPRegistrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFNomUs = new javax.swing.JTextField();
        JBAceptar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JTFEmailUs = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JPFPwUs = new javax.swing.JPasswordField();
        JPFPwUsR = new javax.swing.JPasswordField();
        JTFDniUs = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFApeUs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFAliasUs = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JLImgUs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre :");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contraseña :");

        JTFNomUs.setToolTipText("texto");

        JBAceptar.setMnemonic('a');
        JBAceptar.setText("Aceptar");
        JBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAceptarActionPerformed(evt);
            }
        });

        JBCancelar.setMnemonic('c');
        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Email:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Repetir Contraseña :");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DNI :");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Apellido :");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Alias de Usuario :");

        JLImgUs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JLImgUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLImgUsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPRegistrarLayout = new javax.swing.GroupLayout(JPRegistrar);
        JPRegistrar.setLayout(JPRegistrarLayout);
        JPRegistrarLayout.setHorizontalGroup(
            JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRegistrarLayout.createSequentialGroup()
                .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPRegistrarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPRegistrarLayout.createSequentialGroup()
                                .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFApeUs, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(JTFDniUs)
                                    .addComponent(JTFNomUs)))
                            .addGroup(JPRegistrarLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFEmailUs)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLImgUs, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPRegistrarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFAliasUs)
                            .addComponent(JPFPwUs)
                            .addComponent(JPFPwUsR))
                        .addGap(99, 99, 99)))
                .addContainerGap())
            .addGroup(JPRegistrarLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(JBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        JPRegistrarLayout.setVerticalGroup(
            JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPRegistrarLayout.createSequentialGroup()
                        .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFNomUs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFApeUs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFDniUs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(JLImgUs, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFEmailUs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFAliasUs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JPFPwUs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JPFPwUsR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBAceptar)
                    .addComponent(JBCancelar))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
        if (jfa != null) {
            jfa.setEnabled(true);
            jfa.setVisible(true);
        }
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAceptarActionPerformed
        boolean band = true;
        String msjGestor; // msj = "" --> OK / msj != "" --> Error gestores.

        // verifica que no falte ingresar información.
        JPFPwUs.selectAll();
        JPFPwUsR.selectAll();
        if (JTFNomUs.getText().equals("") || JTFApeUs.getText().equals("")
                || JTFDniUs.getText().equals("") || JTFEmailUs.getText().equals("")
                || JTFAliasUs.getText().equals("") || JPFPwUs.getSelectedText().equals("")
                || JPFPwUsR.getSelectedText().equals("")) {
            // **** falta if verificar que el email tenga formato de email
            JOptionPane.showMessageDialog(this,
                    "Olvidó ingresar información.",
                    "Usuarios", JOptionPane.ERROR_MESSAGE);
            band = false;
        }
        // mediante expresiones regulares verifica que el texto tenga formato de correo ejemplo: usuario@dominio.com 
        if (!JTFEmailUs.getText().matches("\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")) {
            JOptionPane.showMessageDialog(this,
                    "Escriba una direccion de e-mail valida.\nEjemplo: usuario@dominio.com",
                    "Usuarios", JOptionPane.ERROR_MESSAGE);
            band = false;
        }

        // verifica que la repetición de la contraseñas sean iguales.
        if (!JPFPwUs.getSelectedText().equals(JPFPwUsR.getSelectedText())) {
            JOptionPane.showMessageDialog(this,
                    "Contraseñas incorrectas.",
                    "Usuarios", JOptionPane.ERROR_MESSAGE);
            JPFPwUs.setText("");
            JPFPwUsR.setText("");
            band = false;
        }

        // verifica si ha seleccionado una imagen de usuario.
        if (fileNvaImgUs == null && band == true) { // <--- No hay nueva imagen
            int rpt = JOptionPane.showConfirmDialog(this,
                    "No ha seleccionado una nueva imagen de usuario.\nDesea hacerlo ahora?",
                    "Usuarios", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (rpt == 0) { // <--- YES
                band = false;
            }
        }

        // Guarda o actualiza el usuario en la tabla. 
        if (band) {
            boolean isDev;
            if (us == null) { // Nuevo usuario
                isDev = false; // es desarrollador --> por defecto al registrarse no lo es
                msjGestor = gestorUs.nuevoUsuario(JTFNomUs.getText(),
                        JTFApeUs.getText(), Long.valueOf(JTFDniUs.getText()), JTFEmailUs.getText(),
                        JTFAliasUs.getText(), JPFPwUs.getSelectedText(), fileImgUs.getPath(), isDev);
            } else { // Modifica usuario
                isDev = us.getIsDev(); // isDev --> devuelve el mismo valor recibido,
                msjGestor = gestorUs.modificarUsuario(us.getIdUs(), JTFNomUs.getText(),
                        JTFApeUs.getText(), Long.valueOf(JTFDniUs.getText()), JTFEmailUs.getText(),
                        JTFAliasUs.getText(), JPFPwUs.getSelectedText(), fileImgUs.getPath(), isDev);
            }

            if (msjGestor.equals("")) {
                JOptionPane.showMessageDialog(this, "Operación exitosa!!!");
                this.dispose();
                if (jfa != null) {
                    jfa.dispose();
                }
                JDLoginUsuario jdl = new JDLoginUsuario(null, false);
            } else {
                JOptionPane.showMessageDialog(this, msjGestor,
                        "Usuarios", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_JBAceptarActionPerformed

    private void JLImgUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLImgUsMouseClicked
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Jpg, Gif & Png imagenes", "jpg", "gif", "png");
        chooser.setFileFilter(filter);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            fileNvaImgUs = chooser.getSelectedFile();
            if (fileNvaImgUs.getName().endsWith("jpg") || this.fileNvaImgUs.getName().endsWith("png") || this.fileNvaImgUs.getName().endsWith("gif")) {
                fileImgUs = fileNvaImgUs;
            } else {
                fileNvaImgUs = null;
                JOptionPane.showMessageDialog(this, "Solo imágenes de 120 x 120px \ny con extensión .jpg, .png o .gif",
                        "Selección de Imagen", JOptionPane.ERROR_MESSAGE);
            }
            JLImgUs.setIcon(new ImageIcon(fileImgUs.getPath()));
        }
    }//GEN-LAST:event_JLImgUsMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAceptar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JLabel JLImgUs;
    private javax.swing.JPasswordField JPFPwUs;
    private javax.swing.JPasswordField JPFPwUsR;
    private javax.swing.JPanel JPRegistrar;
    private javax.swing.JTextField JTFAliasUs;
    private javax.swing.JTextField JTFApeUs;
    private javax.swing.JTextField JTFDniUs;
    private javax.swing.JTextField JTFEmailUs;
    private javax.swing.JTextField JTFNomUs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
