package View;

import Controller.Controlador;
import static Controller.Controlador.getSerByName;
import Model.Planeta;
import Model.Ser;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author MarcMorenoPineda
 */
public class deleteBeing extends javax.swing.JDialog {

    /**
     * Creates new form deleteBeing
     */
    public deleteBeing(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Cambiar color de fondo
        getContentPane().setBackground(new Color(0, 24, 78));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        DeleteBeing = new javax.swing.JComboBox<>();
        saveCreatePlanet3 = new javax.swing.JButton();
        cancelCreatePlanet1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 24, 78));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deleteBeing.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        DeleteBeing.setBackground(new java.awt.Color(45, 45, 45));
        DeleteBeing.setFont(new java.awt.Font("Space Bd BT", 0, 14)); // NOI18N
        DeleteBeing.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBeing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBeingActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteBeing, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 140, 40));

        saveCreatePlanet3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveCreatePlanet3.setForeground(new java.awt.Color(0, 153, 255));
        saveCreatePlanet3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/destruir.png"))); // NOI18N
        saveCreatePlanet3.setBorder(null);
        saveCreatePlanet3.setContentAreaFilled(false);
        saveCreatePlanet3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveCreatePlanet3.setOpaque(true);
        saveCreatePlanet3.setPreferredSize(new java.awt.Dimension(446, 109));
        saveCreatePlanet3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCreatePlanet3ActionPerformed(evt);
            }
        });
        getContentPane().add(saveCreatePlanet3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, -1, 101));

        cancelCreatePlanet1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelCreatePlanet1.setForeground(new java.awt.Color(255, 0, 0));
        cancelCreatePlanet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        cancelCreatePlanet1.setBorder(null);
        cancelCreatePlanet1.setContentAreaFilled(false);
        cancelCreatePlanet1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelCreatePlanet1.setMinimumSize(new java.awt.Dimension(446, 109));
        cancelCreatePlanet1.setOpaque(true);
        cancelCreatePlanet1.setPreferredSize(new java.awt.Dimension(446, 109));
        cancelCreatePlanet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelCreatePlanet1ActionPerformed(evt);
            }
        });
        getContentPane().add(cancelCreatePlanet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 680, -1, 101));

        jLabel1.setBackground(new java.awt.Color(0, 24, 78));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel de control copia.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 1020, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/final startucom.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 790, -1, 74));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBeingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBeingActionPerformed

    }//GEN-LAST:event_DeleteBeingActionPerformed

    /**
     * -------------
     * ELIMINAR SER
     * -------------
     * 
     * Eliminaremos el ser de la población en la que se encuentra.
     * 
     * @param evt 
     */
    private void saveCreatePlanet3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCreatePlanet3ActionPerformed

        System.out.println("[deleteBeing] entra");
        // Recogeremos el nombre del ser seleccionado
        String beingDelete = (String) DeleteBeing.getSelectedItem();

        //lo pasaremos por el seres
        Ser s = getSerByName(new Ser(beingDelete));

        //recorremos todos los planetas
        for (Planeta planet : Controlador.getAllPlanet()) {

            System.out.println("[deleteBeing] entra al primer for");
            for (Ser ser : planet.getPopulation()) {

                System.out.println("[deleteBeing] entra al segundo for");
                //eliminaremos el ser de getPopulation
                planet.getPopulation().remove(s);

                JOptionPane.showMessageDialog(this, "[ OK ] Ser " + s.getName() + " eliminado de la existencia", "Ser eliminado", JOptionPane.INFORMATION_MESSAGE);

                System.out.println("[deleteBeing] ser eliminado");
                dispose();
            }
        }
    }//GEN-LAST:event_saveCreatePlanet3ActionPerformed

    /**
     * --------------------
     * SALIR DE LA VENTANA
     * --------------------
     * 
     * Usaremos la propiedad dispose() para cerrar la ventana actual
     * 
     * @param evt 
     */
    private void cancelCreatePlanet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelCreatePlanet1ActionPerformed

        //Cerraremos la ventana actual
        dispose();
    }//GEN-LAST:event_cancelCreatePlanet1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        // Limpiamos el ComboBox antes de agregar los elementos
        DeleteBeing.removeAllItems();

        // Obtenemos la lista de planetas desde el controlador
        Controlador.getAllPlanet();

        //Set<Ser>Planetas = Controlador.getPopulation();
        // Llenamos el JComboBox con los nombres de los seres
        for (Planeta p : Controlador.getAllPlanet()) {

            for (Ser s : p.getPopulation()) {

                DeleteBeing.addItem(s.getName());
            }
        }
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(deleteBeing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteBeing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteBeing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteBeing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                deleteBeing dialog = new deleteBeing(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DeleteBeing;
    private javax.swing.JButton cancelCreatePlanet1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton saveCreatePlanet3;
    // End of variables declaration//GEN-END:variables
}
