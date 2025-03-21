/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.Controlador;
import Model.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author MarcMorenoPineda
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        //Cambiar color de fondo
        getContentPane().setBackground(new Color(0, 24, 78));
        
        setIconImage (new ImageIcon(getClass().getResource("/Imagenes/inicio.png")).getImage());
        
        this.setLocationRelativeTo(null); 
        this.setResizable(true); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createPlanet = new javax.swing.JButton();
        createBeing = new javax.swing.JButton();
        deleteBeing = new javax.swing.JButton();
        listPlanet1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        exitProgram = new javax.swing.JButton();
        listBeingPlanet2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setForeground(new java.awt.Color(0, 24, 78));

        createPlanet.setBackground(new java.awt.Color(0, 24, 78));
        createPlanet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createPlanet.setForeground(new java.awt.Color(0, 24, 78));
        createPlanet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crearPlaneta.png"))); // NOI18N
        createPlanet.setToolTipText("");
        createPlanet.setBorder(null);
        createPlanet.setContentAreaFilled(false);
        createPlanet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createPlanet.setMinimumSize(new java.awt.Dimension(100, 80));
        createPlanet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlanetActionPerformed(evt);
            }
        });

        createBeing.setBackground(new java.awt.Color(0, 24, 78));
        createBeing.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createBeing.setForeground(new java.awt.Color(0, 24, 78));
        createBeing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crearSer.png"))); // NOI18N
        createBeing.setBorder(null);
        createBeing.setContentAreaFilled(false);
        createBeing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createBeing.setMaximumSize(new java.awt.Dimension(449, 109));
        createBeing.setMinimumSize(new java.awt.Dimension(100, 80));
        createBeing.setOpaque(true);
        createBeing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBeingActionPerformed(evt);
            }
        });

        deleteBeing.setBackground(new java.awt.Color(0, 24, 78));
        deleteBeing.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBeing.setForeground(new java.awt.Color(0, 24, 78));
        deleteBeing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarSer.png"))); // NOI18N
        deleteBeing.setBorder(null);
        deleteBeing.setContentAreaFilled(false);
        deleteBeing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBeing.setMinimumSize(new java.awt.Dimension(100, 80));
        deleteBeing.setOpaque(true);
        deleteBeing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBeingActionPerformed(evt);
            }
        });

        listPlanet1.setBackground(new java.awt.Color(0, 24, 78));
        listPlanet1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listPlanet1.setForeground(new java.awt.Color(0, 24, 78));
        listPlanet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listadoPlanetas.png"))); // NOI18N
        listPlanet1.setBorder(null);
        listPlanet1.setContentAreaFilled(false);
        listPlanet1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listPlanet1.setMaximumSize(new java.awt.Dimension(449, 109));
        listPlanet1.setMinimumSize(new java.awt.Dimension(100, 80));
        listPlanet1.setOpaque(true);
        listPlanet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPlanet1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/final startucom.jpg"))); // NOI18N

        exitProgram.setBackground(new java.awt.Color(0, 24, 78));
        exitProgram.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        exitProgram.setForeground(new java.awt.Color(0, 24, 78));
        exitProgram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        exitProgram.setBorder(null);
        exitProgram.setContentAreaFilled(false);
        exitProgram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitProgram.setOpaque(true);
        exitProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitProgramActionPerformed(evt);
            }
        });

        listBeingPlanet2.setBackground(new java.awt.Color(0, 24, 78));
        listBeingPlanet2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listBeingPlanet2.setForeground(new java.awt.Color(0, 24, 78));
        listBeingPlanet2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listadoSeres.png"))); // NOI18N
        listBeingPlanet2.setBorder(null);
        listBeingPlanet2.setContentAreaFilled(false);
        listBeingPlanet2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listBeingPlanet2.setMinimumSize(new java.awt.Dimension(100, 80));
        listBeingPlanet2.setOpaque(true);
        listBeingPlanet2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBeingPlanet2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/startucom.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(339, 339, 339)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(listBeingPlanet2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createBeing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createPlanet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteBeing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(listPlanet1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jLabel4))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createPlanet, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createBeing, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBeing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listPlanet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listBeingPlanet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createPlanetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlanetActionPerformed
        
//Crearemos "createPlanet" en view antes de nada
        createPlanet createP = new createPlanet(this,true); 
        createP.setLocationRelativeTo(null); //al darle valor null, la pantalla
                                             //se colocará en el centro
        createP.setVisible(true); //se pone TRUE para que sea visible
    }//GEN-LAST:event_createPlanetActionPerformed

    private void createBeingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBeingActionPerformed

//Verificaremos si hay planetas creados o no, en caso de que no saldremos
        if (Controlador.okPlanets() && Controlador.okPlanets()) {
            
            JOptionPane.showMessageDialog(this, "[ ! ] No existen planetas. Debes crear al menos uno antes", "Advertencia", JOptionPane.WARNING_MESSAGE);
        
            return; // saldremos sin abrir createBeing
            
        } else{
            
        //Crearemos "createBeing" en view antes de nada
            createBeing createB = new createBeing(this,true); 
            createB.setLocationRelativeTo(null); //al darle valor null, la pantalla
                                                 //se colocará en el centro
            createB.setVisible(true); //se pone TRUE para que sea visible   
        }
    }//GEN-LAST:event_createBeingActionPerformed

    private void deleteBeingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBeingActionPerformed

//Verificaremos si hay seres creados o no, en caso de que no saldremos
        if (!Controlador.okBeing()) {
            
            JOptionPane.showMessageDialog(this, "[ ! ] No existen seres. Debes registrar al menos uno antes", "Advertencia", JOptionPane.WARNING_MESSAGE);
        
            return; // saldremos sin abrir createBeing
            
        } else{
        
        //Crearemos "deleteBeing" en view antes de nada
            deleteBeing deleteB = new deleteBeing(this,true); 
            deleteB.setLocationRelativeTo(null); //al darle valor null, la pantalla
                                                 //se colocará en el centro
            deleteB.setVisible(true); //se pone TRUE para que sea visible
        }
    }//GEN-LAST:event_deleteBeingActionPerformed

    private void listPlanet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPlanet1ActionPerformed
        
//Verificaremos si hay planetas creados o no, en caso de que no saldremos
        if (Controlador.okPlanets()) {
            
            JOptionPane.showMessageDialog(this, "[ ! ] No existen planetas. Debes crear al menos uno antes", "Advertencia", JOptionPane.WARNING_MESSAGE);
        
            return; // saldremos sin abrir createBeing
            
        } else{
            
        //Crearemos "listBeingPlanet" en view antes de nada
            listPlanet listP = new listPlanet(this,true); 
            listP.setLocationRelativeTo(null); //al darle valor null, la pantalla
                                                    //se colocará en el centro
            listP.setVisible(true); //se pone TRUE para que sea visible
        }
    }//GEN-LAST:event_listPlanet1ActionPerformed

    private void exitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitProgramActionPerformed
        
//Saldremos del programa
        dispose();
    }//GEN-LAST:event_exitProgramActionPerformed

    private void listBeingPlanet2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBeingPlanet2ActionPerformed

//Verificaremos si hay seres creados o no, en caso de que no saldremos
        if (!Controlador.okBeing()) {
            
            JOptionPane.showMessageDialog(this, "[ ! ] No existen seres. Debes registrar al menos uno antes", "Advertencia", JOptionPane.WARNING_MESSAGE);
        
            return; // saldremos sin abrir createBeing
            
        } else{
            
        //Crearemos "listBeingPlanet" en view antes de nada
            listBeingPlanet listB = new listBeingPlanet(this,true); 
            listB.setLocationRelativeTo(null); //al darle valor null, la pantalla
                                                    //se colocará en el centro
            listB.setVisible(true); //se pone TRUE para que sea visible
        }
    }//GEN-LAST:event_listBeingPlanet2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createBeing;
    private javax.swing.JButton createPlanet;
    private javax.swing.JButton deleteBeing;
    private javax.swing.JButton exitProgram;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton listBeingPlanet2;
    private javax.swing.JButton listPlanet1;
    // End of variables declaration//GEN-END:variables
}
