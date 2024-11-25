/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author ilton
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
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

        jLabelIdAgenda = new javax.swing.JLabel();
        jLabelId2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabelhora = new javax.swing.JLabel();
        jLabelServico = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelValor = new javax.swing.JLabel();
        textFieldHora = new java.awt.TextField();
        jComboBoxServico = new javax.swing.JComboBox<>();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jLabelData = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        textFieldId = new java.awt.TextField();
        textFieldValor = new java.awt.TextField();
        textFieldData = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelId1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIdAgenda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelIdAgenda.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIdAgenda.setText("Agenda");
        getContentPane().add(jLabelIdAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 110, -1));

        jLabelId2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelId2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId2.setText("Observação");
        getContentPane().add(jLabelId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 70, 20));
        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 220, 150));

        jLabelhora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelhora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelhora.setText("Hora");
        getContentPane().add(jLabelhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 40, -1));

        jLabelServico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelServico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelServico.setText("Serviço");
        getContentPane().add(jLabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 40, -1));

        jToggleButton2.setBackground(new java.awt.Color(102, 204, 0));
        jToggleButton2.setText("Agenda");
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 220, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Alan", "Barba", null, null, null, null},
                {"2", "Roney", "Cabelo", null, null, null, null},
                {"", null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jTable1.setToolTipText("");
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 540, 190));

        jLabelValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor.setText("Valor R$");
        getContentPane().add(jLabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 50, -1));

        textFieldHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldHoraActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, -1));

        jComboBoxServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barba", "Corte", "Sombrancelha", " ", " " }));
        jComboBoxServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 100, -1));

        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alan", "Pedro", "Nagib", " " }));
        jComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 100, -1));

        jLabelData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setText("Data");
        getContentPane().add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 40, -1));

        jLabelCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente.setText("Cliente");
        getContentPane().add(jLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 40, -1));

        jLabelId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("Id");
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 20, -1));

        textFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIdActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 100, -1));

        textFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldValorActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 100, -1));

        textFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDataActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/menuPrincipal.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 640, 370));

        jLabelId1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelId1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId1.setText("Id");
        getContentPane().add(jLabelId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 20, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldHoraActionPerformed

    private void textFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldIdActionPerformed

    private void textFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldValorActionPerformed

    private void textFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDataActionPerformed

    private void jComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClienteActionPerformed

    private void jComboBoxServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxServicoActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelId1;
    private javax.swing.JLabel jLabelId2;
    private javax.swing.JLabel jLabelIdAgenda;
    private javax.swing.JLabel jLabelServico;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JLabel jLabelhora;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton2;
    private java.awt.TextField textFieldData;
    private java.awt.TextField textFieldHora;
    private java.awt.TextField textFieldId;
    private java.awt.TextField textFieldValor;
    // End of variables declaration//GEN-END:variables
}
