
package Forms;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Suppliermodel;
import static model.Validate.forNumbers;
import query.Supplierquery;
public class Supplier extends javax.swing.JFrame {

    Suppliermodel sm=new Suppliermodel();
    Supplierquery sq=new Supplierquery();
    public Supplier() {
        initComponents();
        supplierData();
        String under="<html><u>Add Product</u></html>";
        addpro.setText(under); 
    }
    
     public static Supplier sup=null;
    
    public static Supplier getObj()
    {
        if(sup==null)
        {
            sup=new Supplier();
        }
        return sup;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        addpro = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        suppliertable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supplier Details");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 30)); // NOI18N
        jLabel1.setText("Supplier Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, -6, 230, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 870, 40);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Supplier"));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Supplier Name:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 20, 100, 30);

        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(name);
        name.setBounds(120, 20, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mobile No. :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 70, 90, 30);

        mobile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileKeyTyped(evt);
            }
        });
        jPanel3.add(mobile);
        mobile.setBounds(120, 70, 180, 30);

        add.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add.setText("Add");
        add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add);
        add.setBounds(20, 130, 100, 30);

        clear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear);
        clear.setBounds(260, 130, 100, 30);

        address.setColumns(20);
        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        address.setRows(5);
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(address);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(460, 20, 230, 89);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Address:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(390, 30, 70, 20);

        update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.setText("Update");
        update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update);
        update.setBounds(140, 130, 100, 30);

        id.setEditable(false);
        id.setBackground(new java.awt.Color(153, 204, 255));
        id.setBorder(null);
        jPanel3.add(id);
        id.setBounds(460, 130, 0, 14);

        addpro.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        addpro.setForeground(new java.awt.Color(51, 0, 0));
        addpro.setText("Add Product");
        addpro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addpro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addproMouseClicked(evt);
            }
        });
        jPanel3.add(addpro);
        addpro.setBounds(460, 130, 110, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(20, 30, 810, 180);

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("SUPPLIER DATA"));
        jPanel4.setLayout(null);

        suppliertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Mobile", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        suppliertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppliertableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(suppliertable);
        if (suppliertable.getColumnModel().getColumnCount() > 0) {
            suppliertable.getColumnModel().getColumn(0).setMinWidth(70);
            suppliertable.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(20, 30, 770, 240);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(20, 230, 810, 300);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 870, 560);

        setSize(new java.awt.Dimension(876, 626));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
      clear();
    }//GEN-LAST:event_clearActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(empty())
       {
           sm.setMobile(mobile.getText());
           sm.setName(name.getText().toUpperCase());
           sm.setAddress(address.getText()); 
           System.out.println("-------------------------");
           sq.inserting(sm);
           supplierData();
       }
       else
       {
           JOptionPane.showMessageDialog(this,"Please Enter all the fields","Alert",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_addActionPerformed

    private void mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyTyped
       char s=evt.getKeyChar();
       if(!forNumbers(s) && s!='\b')
       {
           evt.consume();
           JOptionPane.showMessageDialog(this,"Only Numbers Allowed","Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_mobileKeyTyped

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       if(empty())
       {
          sm.setName(name.getText().toUpperCase());
          sm.setMobile(mobile.getText());
          sm.setAddress(address.getText());
          sm.setId(Integer.parseInt(id.getText()));
          
          sq.updating(sm);
          supplierData();
       }
      
    }//GEN-LAST:event_updateActionPerformed

    private void suppliertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppliertableMouseClicked
       DefaultTableModel model1=(DefaultTableModel)suppliertable.getModel();
       int r=suppliertable.getSelectedRow();
       
       id.setText(model1.getValueAt(r,0).toString());
       name.setText(model1.getValueAt(r,1).toString());
       mobile.setText(model1.getValueAt(r,2).toString());
       address.setText(model1.getValueAt(r,3).toString());
    }//GEN-LAST:event_suppliertableMouseClicked

    private void addproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addproMouseClicked
       Addproductframe frame=new Addproductframe();
       frame.getObj().setVisible(true); 
       this.dispose();
    }//GEN-LAST:event_addproMouseClicked

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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }
    
    public void supplierData()
    {
        DefaultTableModel model2=(DefaultTableModel)suppliertable.getModel();
        ArrayList<Suppliermodel> list=new ArrayList<>();
        model2.setRowCount(0); 
        list=sq.getSupplierData();
        
        for(Suppliermodel s:list)
        {
            model2.addRow(new Object[]{s.getId(),s.getName(),s.getMobile(),s.getAddress()});
        }
    }
    
    public void clear()
    {
        name.setText("");
        mobile.setText("");
        address.setText(""); 
    }
    
    public boolean empty()
    {
        if(name.getText().isEmpty())
        {
            return false;
        }
        else if(mobile.getText().isEmpty())
        {
            return false;
        }
        else if(address.getText().isEmpty())
        {
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel addpro;
    private javax.swing.JTextArea address;
    private javax.swing.JButton clear;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField name;
    private javax.swing.JTable suppliertable;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
