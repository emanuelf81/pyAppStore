/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gui;

import com.example.dominio.Aplicacion;
import com.example.dominio.Compra;
import com.example.dominio.Usuario;
import com.example.gui.JPApp;
import com.example.servicios.GestorAplicaciones;
import com.example.servicios.GestorCompras;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public class JFPrincipal extends javax.swing.JFrame {

    private final Usuario us;
    private JPApp jpa;
    private final GestorAplicaciones gestorApp;
    private final GestorCompras gestorCompra;
    private final List<Aplicacion> lstApp;

    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal(Usuario us) {
        this.us = us;
        this.gestorApp = new GestorAplicaciones();
        this.gestorCompra = new GestorCompras();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("App Store");
        this.setVisible(true);
        this.lstApp = gestorApp.leerTodasAplicaciones();
        mostrarAplicaciones("");
        usuarioActual();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPUsuario = new javax.swing.JPanel();
        JLUsuario = new javax.swing.JLabel();
        JBImgUs = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        JBPublicarApp = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        JLAppPublicadas = new javax.swing.JLabel();
        JLAppCompradas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JTBuscarApp = new javax.swing.JTextField();
        JBBuscarApp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JCBMostrar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JPContApp = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPUsuario.setBackground(new java.awt.Color(153, 255, 204));
        JPUsuario.setToolTipText("");

        JLUsuario.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        JLUsuario.setForeground(new java.awt.Color(0, 0, 0));
        JLUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLUsuario.setText(".");

        JBImgUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBImgUsActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label2.setText("Apps Publicadas:");

        label3.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label3.setText("Apps Compradas:");

        JBPublicarApp.setText("Publicar App");
        JBPublicarApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPublicarAppActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label1.setText("Usuario:");

        JLAppPublicadas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        JLAppPublicadas.setForeground(new java.awt.Color(0, 0, 0));
        JLAppPublicadas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLAppPublicadas.setText(".");

        JLAppCompradas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        JLAppCompradas.setForeground(new java.awt.Color(0, 0, 0));
        JLAppCompradas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLAppCompradas.setText(".");

        javax.swing.GroupLayout JPUsuarioLayout = new javax.swing.GroupLayout(JPUsuario);
        JPUsuario.setLayout(JPUsuarioLayout);
        JPUsuarioLayout.setHorizontalGroup(
            JPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPUsuarioLayout.createSequentialGroup()
                .addGroup(JPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPUsuarioLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(JPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPUsuarioLayout.createSequentialGroup()
                                .addComponent(label3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLAppCompradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(JPUsuarioLayout.createSequentialGroup()
                                .addGroup(JPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPUsuarioLayout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPUsuarioLayout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLAppPublicadas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPUsuarioLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBPublicarApp, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(JBImgUs, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPUsuarioLayout.setVerticalGroup(
            JPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBImgUs, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPUsuarioLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(JPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLUsuario)
                            .addComponent(label1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(JLAppPublicadas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(JLAppCompradas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBPublicarApp)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        JBBuscarApp.setMnemonic('b');
        JBBuscarApp.setText("Buscar ");
        JBBuscarApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarAppActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Mostrar :");

        JCBMostrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponibles para Comprar", "Publicadas", "Compradas", "Todas" }));
        JCBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBBuscarApp, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JCBMostrar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTBuscarApp, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBBuscarApp)
                    .addComponent(JTBuscarApp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPContApp.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout JPContAppLayout = new javax.swing.GroupLayout(JPContApp);
        JPContApp.setLayout(JPContAppLayout);
        JPContAppLayout.setHorizontalGroup(
            JPContAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
        );
        JPContAppLayout.setVerticalGroup(
            JPContAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(JPContApp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBImgUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBImgUsActionPerformed
        int rpt = JOptionPane.showConfirmDialog(this,
                "Desea modificar su información de usuario?",
                "Usuario",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rpt == 0) {
            this.setEnabled(false);
            JDUsuario jdu = new JDUsuario(this, false, us);
        }
    }//GEN-LAST:event_JBImgUsActionPerformed

    private void JBPublicarAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPublicarAppActionPerformed
        this.setEnabled(false);
        JDAplicacion jda = new JDAplicacion(this, false, us);
    }//GEN-LAST:event_JBPublicarAppActionPerformed

    private void JBBuscarAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarAppActionPerformed
        String buscar = JTBuscarApp.getText();
        mostrarAplicaciones(buscar);
    }//GEN-LAST:event_JBBuscarAppActionPerformed

    private void JCBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBMostrarActionPerformed
        String buscar = JTBuscarApp.getText();
        mostrarAplicaciones(buscar);
    }//GEN-LAST:event_JCBMostrarActionPerformed

    private void usuarioActual() {
        if (us != null) {
            JLUsuario.setText(us.getAliasUs());
            JBImgUs.setIcon(new ImageIcon(us.getImgUs()));
            JLAppPublicadas.setText(String.valueOf(gestorApp.aplicPorUsuario(lstApp, us).size()));
            JLAppCompradas.setText(String.valueOf(gestorApp.leerTodasAppsCompradas(lstApp, us).size()));

            //JOptionPane.showMessageDialog(this, "Hola " + us.getNomUs() + "!!!");
            //ver de poner un timer de 2 seg. y luego se cierre solo.
        } else {
            JLUsuario.setText("***");
            JLAppPublicadas.setText("0");
            JLAppCompradas.setText("0");
        }
    }

    private void mostrarAplicaciones(String buscar) {
        List<Aplicacion> lstAppAux = new ArrayList();
        JPContApp.removeAll();
        JPContApp.setLayout(new GridLayout(0, 1));
        if (!lstApp.isEmpty()) {
            int cont = 0;
            switch (JCBMostrar.getSelectedIndex()) {
                case 0: // Disponibles para Comprar = Todas App no propias - Compradas
                    lstAppAux = gestorApp.aplicOtrosUsuarios(lstApp, us);
                    List<Aplicacion> lstCompradas = gestorApp.leerTodasAppsCompradas(lstApp, us);
                    for (int i = 0; i < lstAppAux.size(); i++) {
                        for (int j = 0; j < lstCompradas.size(); j++) {
                            if (lstAppAux.get(i).getIdApp() == lstCompradas.get(j).getIdApp()) {
                                lstAppAux.remove(i);
                                i--;
                                break;
                            }
                        }
                    }
                    break;
                case 1: // Publicadas
                    lstAppAux = gestorApp.aplicPublicadas(lstApp, us);
                    break;
                case 2: // Compradas
                    lstAppAux = gestorApp.leerTodasAppsCompradas(lstApp, us);
                    break;
                default: // Todas
                    lstAppAux = lstApp;
            }

            // filtro buscar por
            List<Compra> lstCompraAux = gestorCompra.leerTodasCompras();
            if (!"".equals(buscar)) {
                lstAppAux = gestorApp.aplicBuscarPor(lstAppAux, buscar);
            }
            if (!lstAppAux.isEmpty()) {
                // oculta o muestra botones comprar o calificar
                boolean btnComprar, btnCalificar;
                // mostrar app
                for (Aplicacion app : lstAppAux) {
                    btnComprar = true;
                    btnCalificar = false;
                    // oculta botones comprar en el caso que sean propias, ya compradas o todas
                    if (JCBMostrar.getSelectedIndex() != 0) {
                        btnComprar = false;
                    }
                    // muestra boton calificar en el caso que ya estén compradas y no han sido calificadas
                    if (JCBMostrar.getSelectedIndex() == 2) {
                        for (Compra compra : lstCompraAux) {
                            if (app.getIdApp() == compra.getId_Aplicacion()
                                    && compra.getId_Usuario() == us.getIdUs()
                                    && compra.getCalificacion() == 0) {
                                btnCalificar = true;
                                break;
                            }
                        }
                    }
                    jpa = new JPApp(this, app, btnComprar, btnCalificar, us);
                    JPContApp.add(jpa);
                    if (cont % 2 == 0) {
                        jpa.setBackground(Color.gray);
                    } else {
                        jpa.setBackground(Color.cyan);
                    }
                    cont++;
                }
            } else {
                JOptionPane.showMessageDialog(this, "No hay aplicaciones para mostrar.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay aplicaciones para mostrar.(2)");
        }
        JPContApp.repaint();
        JPContApp.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscarApp;
    private javax.swing.JButton JBImgUs;
    private javax.swing.JButton JBPublicarApp;
    private javax.swing.JComboBox<String> JCBMostrar;
    private javax.swing.JLabel JLAppCompradas;
    private javax.swing.JLabel JLAppPublicadas;
    private javax.swing.JLabel JLUsuario;
    private javax.swing.JPanel JPContApp;
    private javax.swing.JPanel JPUsuario;
    private javax.swing.JTextField JTBuscarApp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    // End of variables declaration//GEN-END:variables
}
