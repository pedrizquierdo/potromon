/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.fokemones.ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.fokemones.entities.Entrenador;

/**
 *
 * @author zBook
 */
public class EntrenadoresListado extends javax.swing.JFrame {

    /**
     * Creates new form EntrenadoresListado
     */
    public EntrenadoresListado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPotromon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEntrenadores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPotromon.setForeground(new java.awt.Color(0, 0, 0));
        btnPotromon.setText("Ver potromones del entrenador");
        btnPotromon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotromonActionPerformed(evt);
            }
        });
        jPanel1.add(btnPotromon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ENTRENADORES POTROMONES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        btnEditar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        tblEntrenadores.setAutoCreateRowSorter(true);
        tblEntrenadores.setBackground(new java.awt.Color(153, 153, 153));
        tblEntrenadores.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 12)); // NOI18N
        tblEntrenadores.setForeground(new java.awt.Color(0, 0, 0));
        tblEntrenadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Nombre", "Apodo"
            }
        ));
        jScrollPane1.setViewportView(tblEntrenadores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 287, 292));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        loadTable();
        tblEntrenadores.removeColumn(tblEntrenadores.getColumnModel().getColumn(0));
        
    }//GEN-LAST:event_formWindowOpened
    /**
     * Method that is executed when the Add button is pressed
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        //Create an instance of EntrenadoresForm with the corresponding parameters.
        EntrenadoresForm form = new EntrenadoresForm(this, true, 0);
        form.setVisible(true);
        loadTable();

        
    }//GEN-LAST:event_btnAgregarActionPerformed
        /**
         * Method that is executed when the Edit button is pressed.
         */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       
        int renglon = tblEntrenadores.getSelectedRow();
        int idEntrenador = Integer.parseInt(tblEntrenadores.getModel().getValueAt(renglon, 0).toString());
        
        EntrenadoresForm form = new EntrenadoresForm(this, true, idEntrenador);
        form.setVisible(true);
        
        loadTable();

    }//GEN-LAST:event_btnEditarActionPerformed

        /**
         * Method that is executed when the Delete button is pressed.
         */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int renglon = tblEntrenadores.getSelectedRow();
        int idEntrenador = Integer.parseInt(tblEntrenadores.getModel().getValueAt(renglon, 0).toString());
        
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar el registro?", "Eliminar registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        
        if(Entrenador.delete(idEntrenador)){
            JOptionPane.showMessageDialog(this, "El registro se eliminó con éxito", "Registro eliminado", JOptionPane.INFORMATION_MESSAGE);
            loadTable();
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        } 
        
    }//GEN-LAST:event_btnEliminarActionPerformed
    /**
     * Method that is executed when the Potromon button is pressed.
     */
    private void btnPotromonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotromonActionPerformed

       // Obtener el índice de la fila seleccionada en la tabla de entrenadores
    int renglon = tblEntrenadores.getSelectedRow();

       // Obtener el ID del entrenador de la columna correspondiente en la fila seleccionada
    int idEntrenador = Integer.parseInt(tblEntrenadores.getModel().getValueAt(renglon, 0).toString());

       // Crear una instancia de PotromonesListado pasando el ID del entrenador
    PotromonesListado potromonesListado = new PotromonesListado(idEntrenador);

       // Hacer visible la ventana de PotromonesListado
    potromonesListado.setVisible(true);

        
        
    }//GEN-LAST:event_btnPotromonActionPerformed
    /**
     * Method to load the data into the table.
     */
    private void loadTable(){
        List<Entrenador> entrenadores = Entrenador.getAll();
        DefaultTableModel modeloTabla = (DefaultTableModel)tblEntrenadores.getModel();
        modeloTabla.setRowCount(0);
        
        for(Entrenador e: entrenadores) {
            modeloTabla.addRow(new Object[] {
            e.getId(),
            e.getNombre(),
            e.getApodo()
            });
        }
        
    }
    
    
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
            java.util.logging.Logger.getLogger(EntrenadoresListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntrenadoresListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntrenadoresListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntrenadoresListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntrenadoresListado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPotromon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEntrenadores;
    // End of variables declaration//GEN-END:variables
}
