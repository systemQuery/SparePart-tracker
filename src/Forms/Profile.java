
package Forms;

import java.awt.event.KeyEvent;

public class Profile extends javax.swing.JFrame {
int a,b;
    public Profile() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        supplier = new javax.swing.JButton();
        addparts = new javax.swing.JButton();
        swiftp = new javax.swing.JButton();
        sales = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome To Sai Automobile & Spare Parts");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 104, 202));
        jPanel1.setLayout(null);

        supplier.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        supplier.setText("Supplier");
        supplier.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierActionPerformed(evt);
            }
        });
        supplier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                supplierKeyPressed(evt);
            }
        });
        jPanel1.add(supplier);
        supplier.setBounds(600, 40, 260, 50);

        addparts.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addparts.setText("Add Spare Parts");
        addparts.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        addparts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpartsActionPerformed(evt);
            }
        });
        addparts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addpartsKeyPressed(evt);
            }
        });
        jPanel1.add(addparts);
        addparts.setBounds(600, 120, 260, 50);

        swiftp.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        swiftp.setText("Add Stock");
        swiftp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        swiftp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swiftpActionPerformed(evt);
            }
        });
        swiftp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                swiftpKeyPressed(evt);
            }
        });
        jPanel1.add(swiftp);
        swiftp.setBounds(600, 200, 260, 50);

        sales.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sales.setText("Sales Details");
        sales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });
        sales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                salesKeyPressed(evt);
            }
        });
        jPanel1.add(sales);
        sales.setBounds(600, 280, 260, 50);

        exit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exit.setText("Exit");
        exit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        exit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exitKeyPressed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(600, 360, 260, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shutterstock_570992530.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 460);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 60, 950, 470);

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sai Automobile & Spare Parts");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 540, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 940, 60);

        setSize(new java.awt.Dimension(943, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
       int x=evt.getXOnScreen();
       int y=evt.getYOnScreen();
       
       this.setLocation(x-a,y-b);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
      a=evt.getX();
      b=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierActionPerformed
        Supplier sup=new Supplier();
        sup.getObj().setVisible(true); 
    }//GEN-LAST:event_supplierActionPerformed

    private void addpartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpartsActionPerformed
        Addproductframe addpro=new Addproductframe();
        addpro.setVisible(true);

    }//GEN-LAST:event_addpartsActionPerformed

    private void swiftpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swiftpActionPerformed
        MarutiStockDetails sp=new MarutiStockDetails();
        sp.getObj().setVisible(true);
    }//GEN-LAST:event_swiftpActionPerformed

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed
       Salesdetails sale=new Salesdetails();
       sale.getObj().setVisible(true); 
    }//GEN-LAST:event_salesActionPerformed

    private void addpartsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addpartsKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
          addparts.doClick();
       }
    }//GEN-LAST:event_addpartsKeyPressed

    private void swiftpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_swiftpKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
           swiftp.doClick();
       }
    }//GEN-LAST:event_swiftpKeyPressed

    private void salesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salesKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER)
      {
          sales.doClick();
      }
    }//GEN-LAST:event_salesKeyPressed

    private void supplierKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER)
      {
          supplier.doClick();
      }
    }//GEN-LAST:event_supplierKeyPressed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       System.exit(0); 
    }//GEN-LAST:event_exitActionPerformed

    private void exitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exitKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
           exit.doClick();
       }
    }//GEN-LAST:event_exitKeyPressed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addparts;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton sales;
    private javax.swing.JButton supplier;
    private javax.swing.JButton swiftp;
    // End of variables declaration//GEN-END:variables
}
