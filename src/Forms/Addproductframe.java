
package Forms;

import static Forms.MarutiStockDetails.sp;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Addproduct;
import model.Suppliermodel;
import static model.Validate.forNumbers;
import query.Addproductquery;

public class Addproductframe extends javax.swing.JFrame {

    public static Addproductframe pf=null;
    JFrame frame=new JFrame();
    Addproduct additem=new Addproduct();
    Addproductquery addquery=new Addproductquery();
    public Addproductframe() {
        initComponents();
        String under="<html><u>Add Stock</u></html>";
        gotostock.setText(under); 
        suppliername();
        
//        String cars[]={"Swift Diesel","Swift Petrol","WagonR","Ertiga","Alto","Alto K10","Car 800","Zen","Van","Alto 800","Others"};
//        for(int i=0;i<cars.length;i++)
//        {
//             mname.addItem(cars[i]);
//        }
        tabledata();
    }
    public static Addproductframe getObj()
    {
        if(pf==null)
        {
            pf=new Addproductframe();
        }
        return pf;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        company = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        supplier = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        protable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        productsearch = new javax.swing.JTextField();
        gotostock = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Products Details");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel5.setText("ADD SPARE PARTS");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, -2, 370, 43);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1220, 40);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("ADD PRODUCT"));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Part Name:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 20, 70, 30);

        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(name);
        name.setBounds(110, 20, 170, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Company:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 70, 80, 30);

        company.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        company.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(company);
        company.setBounds(110, 70, 170, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Model Name:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 120, 90, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Price:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(360, 70, 40, 20);

        price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });
        jPanel3.add(price);
        price.setBounds(440, 70, 180, 30);

        add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add.setText("ADD");
        add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add);
        add.setBounds(1010, 50, 90, 30);

        update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.setText("UPDATE");
        update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update);
        update.setBounds(1010, 90, 90, 30);

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText("CLEAR");
        clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear);
        clear.setBounds(1010, 130, 90, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Unique Code:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(350, 117, 90, 30);

        code.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        code.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(code);
        code.setBounds(440, 120, 180, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Type:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(670, 20, 60, 30);

        type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(type);
        type.setBounds(730, 20, 180, 30);

        year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        year.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearKeyTyped(evt);
            }
        });
        jPanel3.add(year);
        year.setBounds(440, 20, 180, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Model Year:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(350, 20, 80, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("(per part)");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(350, 80, 60, 20);

        mname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(mname);
        mname.setBounds(110, 120, 170, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Supplier:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(670, 70, 60, 30);

        supplier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        supplier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(supplier);
        supplier.setBounds(730, 70, 180, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(20, 20, 1160, 180);

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("PRODUCT DETAILS"));
        jPanel4.setLayout(null);

        protable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Type", "Model Name", "Company", "Year", "Price", "Price with GST", "Unique code", "Supplier"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        protable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                protableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(protable);
        if (protable.getColumnModel().getColumnCount() > 0) {
            protable.getColumnModel().getColumn(0).setMinWidth(66);
            protable.getColumnModel().getColumn(0).setMaxWidth(66);
        }

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(30, 60, 1110, 280);

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel11.setText("Search:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(30, 20, 70, 30);

        productsearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        productsearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        productsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productsearchKeyReleased(evt);
            }
        });
        jPanel4.add(productsearch);
        productsearch.setBounds(100, 20, 350, 30);

        gotostock.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        gotostock.setForeground(new java.awt.Color(51, 0, 0));
        gotostock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gotostock.setText("Add Stock");
        gotostock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotostock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotostockMouseClicked(evt);
            }
        });
        jPanel4.add(gotostock);
        gotostock.setBounds(540, 20, 100, 30);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(20, 210, 1160, 360);

        pid.setEditable(false);
        pid.setForeground(new java.awt.Color(153, 204, 255));
        pid.setBorder(null);
        pid.setOpaque(false);
        jPanel2.add(pid);
        pid.setBounds(1170, 570, 30, 10);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 1220, 600);

        setSize(new java.awt.Dimension(1223, 665));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       clear();
    }//GEN-LAST:event_clearActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       if(empty())
       {
           Double a=Double.parseDouble(price.getText());
           Double b=((28*a)/100);
           
           System.out.println(a+"##########"+b);
           additem.setCompany(company.getText().toUpperCase());
           additem.setModelname(mname.getText().toUpperCase());
           additem.setPrice(Double.parseDouble(price.getText()));
           additem.setPartname(name.getText().toUpperCase());
           additem.setType(type.getText().toUpperCase());
           additem.setYear(Integer.parseInt(year.getText()));
           additem.setCode(code.getText().toUpperCase().toUpperCase()); 
           additem.setPricegst(a+b);
           additem.setSupplier(supplier.getSelectedItem().toString()); 
            
           System.out.println("==================");
           int i=addquery.submitMaruti(additem);
           if(i==1)
           {
               clear();
           }
           tabledata();
           //clear();
       }
       else
       {
           JOptionPane.showMessageDialog(frame,"Please Enter All Fields","Warning",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_addActionPerformed

    private void yearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearKeyTyped
       char a=evt.getKeyChar();
       if(!forNumbers(a) && a!='\b')
       {
           evt.consume();
          JOptionPane.showMessageDialog(this,"Only Numbers Allowed","Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_yearKeyTyped

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
        char a=evt.getKeyChar();
       if(!forNumbers(a) && a!='\b' && a!='.')
       {
           evt.consume();
          JOptionPane.showMessageDialog(this,"Only Numbers Allowed","Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_priceKeyTyped

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         if(forUpdate())
       {
           Double a=Double.parseDouble(price.getText());
           Double b=((28*a)/100);
           System.out.println("--------------------");
           additem.setId(Integer.parseInt(pid.getText()));
           additem.setCompany(company.getText().toUpperCase());
           additem.setModelname(mname.getText().toUpperCase()); 
           additem.setPrice(Double.parseDouble(price.getText()));
           additem.setPartname(name.getText().toUpperCase());
           additem.setType(type.getText().toUpperCase());
           additem.setYear(Integer.parseInt(year.getText()));
           additem.setCode(code.getText().toUpperCase()); 
           additem.setPricegst(a+b); 
           additem.setSupplier(supplier.getSelectedItem().toString()); 
           
           System.out.println("88888888888888888888");
           addquery.updateMarutiData(additem);
           tabledata();
           clear();
       }
       else
       {
           JOptionPane.showMessageDialog(frame,"Please Enter All Fields","Warning",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_updateActionPerformed

    private void protableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_protableMouseClicked
       
        try{
        DefaultTableModel model3=(DefaultTableModel)protable.getModel();
            int r=protable.getSelectedRow();
            
            pid.setText(model3.getValueAt(r,0).toString()); 
            name.setText(model3.getValueAt(r,1).toString());
            type.setText(model3.getValueAt(r,2).toString());
            mname.setText(model3.getValueAt(r,3).toString());
            company.setText(model3.getValueAt(r,4).toString());
            year.setText(model3.getValueAt(r,5).toString());
            price.setText(model3.getValueAt(r,6).toString());
            
           // code.setText(model3.getValueAt(r,8).toString());
            supplier.setSelectedItem(model3.getValueAt(r,9));
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_protableMouseClicked

    private void productsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productsearchKeyReleased
        String text=productsearch.getText();
        filter(text);
        tabledata();
    }//GEN-LAST:event_productsearchKeyReleased

    private void gotostockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotostockMouseClicked
       MarutiStockDetails msd=new MarutiStockDetails();
       msd.getObj().setVisible(true); 
       this.dispose();
    }//GEN-LAST:event_gotostockMouseClicked

    public boolean empty()
    {
        if(name.getText().isEmpty())
        {
            return false;
        }
        else if(mname.getText().isEmpty())
        {
            return false;
        }
        else if(price.getText().isEmpty())
        {
            return false;
        }
        else if(company.getText().isEmpty())
        {
            return false;
        }
        else if(year.getText().isEmpty())
        {
            return false;
        }
//        else if(type.getText().isEmpty())
//        {
//            return false;
//        }
        else if(code.getText().isEmpty())
        {
            return false;
        }
        return true;
    }
    
    public boolean forUpdate()
    {
        if(name.getText().isEmpty())
        {
            return false;
        }
        else if(mname.getText().isEmpty())
        {
            return false;
        }
        else if(price.getText().isEmpty())
        {
            return false;
        }
        else if(company.getText().isEmpty())
        {
            return false;
        }
        else if(year.getText().isEmpty())
        {
            return false;
        }

        return true;
    }
    
    public void clear()
    {
        name.setText("");
        mname.setText("");
        company.setText("");
        price.setText("");
        year.setText("");
        code.setText("");
        type.setText("");
        supplier.setSelectedIndex(0);
    }
   
    public void tabledata(){
        DefaultTableModel model1= (DefaultTableModel)protable.getModel();
        ArrayList<Addproduct> list1=new ArrayList<>(); 
        model1.setRowCount(0);
        list1=addquery.showData();
        
        for(Addproduct ap:list1)
        {
            model1.addRow(new Object[]{ap.getId(),ap.getPartname(),ap.getType(),ap.getModelname(),ap.getCompany(),ap.getYear(),ap.getPrice(),ap.getPricegst(),ap.getCode(),ap.getSupplier()});
        }
    }
    
    public void suppliername()
    {
        ArrayList<Suppliermodel> list2=new ArrayList<>();
        list2=addquery.getSupplierName();
        
        for(Suppliermodel s:list2)
        {
            supplier.addItem(s.getName()); 
        }
    }
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
            java.util.logging.Logger.getLogger(Addproductframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addproductframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addproductframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addproductframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addproductframe().setVisible(true);
            }
        });
    }
    
    private void filter(String query)
    {
        DefaultTableModel model3=(DefaultTableModel)protable.getModel();
        TableRowSorter<DefaultTableModel> sorter=new TableRowSorter<DefaultTableModel>(model3);
        protable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)"+query));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JTextField code;
    private javax.swing.JTextField company;
    private javax.swing.JLabel gotostock;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField price;
    private javax.swing.JTextField productsearch;
    private javax.swing.JTable protable;
    private javax.swing.JComboBox supplier;
    private javax.swing.JTextField type;
    private javax.swing.JButton update;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
