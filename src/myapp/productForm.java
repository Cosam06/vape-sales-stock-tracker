/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Sam
 */
public class productForm extends javax.swing.JFrame {

    /**
     * Creates new form productForm
     */
    public productForm() {
        initComponents();
         this.setLocationRelativeTo(null);    
    }
   
    
    
    Color navcolor = new Color(204,204,204);
    Color headcolor = new Color(255,102,102);
    Color bodycolor = new Color(102,102,102);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        search2 = new javax.swing.JTextField();
        search3 = new javax.swing.JTextField();
        search4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(630, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel1.setText("Product Form");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 0, 210, 40);

        close.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        close.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                closeKeyPressed(evt);
            }
        });
        jPanel2.add(close);
        close.setBounds(670, 10, 20, 23);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        add.setBackground(new java.awt.Color(204, 204, 204));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD");
        add.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 80, 30));

        edit.setBackground(new java.awt.Color(204, 204, 204));
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EDIT");
        edit.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 80, 30));

        delete.setBackground(new java.awt.Color(204, 204, 204));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DELETE");
        delete.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 80, 30));

        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search.setOpaque(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 180, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PRICE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        search2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search2.setOpaque(false);
        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });
        jPanel1.add(search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, 30));

        search3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search3.setOpaque(false);
        search3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search3ActionPerformed(evt);
            }
        });
        jPanel1.add(search3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 180, 30));

        search4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search4.setOpaque(false);
        search4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search4ActionPerformed(evt);
            }
        });
        jPanel1.add(search4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 180, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("PRODUCT ADRESS:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("PRODUCT NAME:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("QUANTITY:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("STATUS:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable", "Our of stock" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 272, 120, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("PRODUCT ID:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 190, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(bodycolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseExited

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(bodycolor);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(navcolor);
    }//GEN-LAST:event_editMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(bodycolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search2ActionPerformed

    private void search3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search3ActionPerformed

    private void search4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search4ActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int a=JOptionPane.showConfirmDialog(null,"Confirm Exit?");
        if(a==JOptionPane.YES_OPTION);
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_closeKeyPressed

    }//GEN-LAST:event_closeKeyPressed

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
            java.util.logging.Logger.getLogger(productForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JLabel close;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField search;
    private javax.swing.JTextField search2;
    private javax.swing.JTextField search3;
    private javax.swing.JTextField search4;
    // End of variables declaration//GEN-END:variables
}
