
package Forms;


import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Addproduct;
import model.MarutiStock;
import static model.Validate.forNumbers;
import query.MarutistockQuery;

public class MarutiStockDetails extends javax.swing.JFrame {

    MarutiStock additem=new MarutiStock();
    Addproduct add=new Addproduct();
    MarutistockQuery spq=new MarutistockQuery();
    public MarutiStockDetails() {
        initComponents();
        String under="<html><u>Add Product</u></html>";
        String line="<html><u>Sales</u></html>";
        sales.setText(line); 
        gotoproducts.setText(under); 
        getstockdata();
//        String cars[]={"Swift Diesel","Swift Petrol","WagonR","Ertiga","Alto","Alto K10","Car 800","Zen","Van","Alto 800","Others"};
//        for(int i=0;i<cars.length;i++)
//        {
//             mname.addItem(cars[i]);
//        }
    }

    public static MarutiStockDetails sp=null;
    
    public static MarutiStockDetails getObj()
    {
        if(sp==null)
        {
            sp=new MarutiStockDetails();
        }
        return sp;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        partnamemaruti = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        companymaruti = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pricemaruti = new javax.swing.JTextField();
        codemaruti = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        yearmaruti = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        typemaruti = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        quantitymaruti = new javax.swing.JTextField();
        modelnamemaruti = new javax.swing.JTextField();
        retrieve = new javax.swing.JButton();
        identity = new javax.swing.JTextField();
        addstock = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        marutistocktable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        stocksearch = new javax.swing.JTextField();
        gotoproducts = new javax.swing.JLabel();
        sales = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Stock");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setText("ADD STOCK");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 230, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1200, 40);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("ADD MARUTI STOCK"));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Enter Spare Part Id:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 20, 130, 30);

        pid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pidKeyPressed(evt);
            }
        });
        jPanel3.add(pid);
        pid.setBounds(150, 20, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Part Name:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 70, 70, 30);

        partnamemaruti.setEditable(false);
        partnamemaruti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        partnamemaruti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(partnamemaruti);
        partnamemaruti.setBounds(150, 70, 170, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Company:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 120, 80, 30);

        companymaruti.setEditable(false);
        companymaruti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        companymaruti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(companymaruti);
        companymaruti.setBounds(150, 120, 170, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Model Name:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 170, 90, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Unique Code:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(380, 180, 90, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Price:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(380, 120, 60, 17);

        pricemaruti.setEditable(false);
        pricemaruti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pricemaruti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pricemaruti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pricemarutiKeyTyped(evt);
            }
        });
        jPanel3.add(pricemaruti);
        pricemaruti.setBounds(470, 120, 180, 30);

        codemaruti.setEditable(false);
        codemaruti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codemaruti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(codemaruti);
        codemaruti.setBounds(470, 170, 180, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Model Year:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(380, 80, 80, 17);

        yearmaruti.setEditable(false);
        yearmaruti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearmaruti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yearmaruti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearmarutiKeyTyped(evt);
            }
        });
        jPanel3.add(yearmaruti);
        yearmaruti.setBounds(470, 70, 180, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Type:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(710, 70, 40, 30);

        typemaruti.setEditable(false);
        typemaruti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        typemaruti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(typemaruti);
        typemaruti.setBounds(770, 70, 170, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Quantity:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(710, 120, 60, 30);

        quantitymaruti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantitymaruti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quantitymaruti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantitymarutiKeyTyped(evt);
            }
        });
        jPanel3.add(quantitymaruti);
        quantitymaruti.setBounds(770, 120, 170, 30);

        modelnamemaruti.setEditable(false);
        modelnamemaruti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modelnamemaruti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(modelnamemaruti);
        modelnamemaruti.setBounds(150, 170, 170, 30);

        retrieve.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        retrieve.setText("Retrieve");
        retrieve.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        retrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveActionPerformed(evt);
            }
        });
        jPanel3.add(retrieve);
        retrieve.setBounds(370, 20, 90, 30);

        identity.setBackground(new java.awt.Color(153, 204, 255));
        identity.setBorder(null);
        jPanel3.add(identity);
        identity.setBounds(730, 20, 0, 14);

        addstock.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addstock.setText("ADD");
        addstock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        addstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstockActionPerformed(evt);
            }
        });
        jPanel3.add(addstock);
        addstock.setBounds(990, 70, 110, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("(with GST)");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(380, 135, 70, 20);

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText("CLEAR");
        clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear);
        clear.setBounds(990, 120, 110, 30);

        update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.setText("UPDATE");
        update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update);
        update.setBounds(990, 170, 110, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(20, 20, 1130, 220);

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("MARUTI STOCK"));
        jPanel4.setLayout(null);

        marutistocktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "PartName", "Type", "ModelName", "Year", "Company", "Price(with GST)", "Code", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        marutistocktable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marutistocktableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(marutistocktable);
        if (marutistocktable.getColumnModel().getColumnCount() > 0) {
            marutistocktable.getColumnModel().getColumn(0).setMinWidth(70);
            marutistocktable.getColumnModel().getColumn(0).setMaxWidth(70);
            marutistocktable.getColumnModel().getColumn(4).setMinWidth(80);
            marutistocktable.getColumnModel().getColumn(4).setMaxWidth(80);
            marutistocktable.getColumnModel().getColumn(7).setMinWidth(70);
            marutistocktable.getColumnModel().getColumn(7).setMaxWidth(70);
        }

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 1090, 280);

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel12.setText("Search:");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(20, 20, 70, 30);

        stocksearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        stocksearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        stocksearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stocksearchKeyReleased(evt);
            }
        });
        jPanel4.add(stocksearch);
        stocksearch.setBounds(90, 20, 350, 30);

        gotoproducts.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        gotoproducts.setForeground(new java.awt.Color(51, 0, 0));
        gotoproducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gotoproducts.setText("jLabel13");
        gotoproducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoproducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoproductsMouseClicked(evt);
            }
        });
        jPanel4.add(gotoproducts);
        gotoproducts.setBounds(540, 20, 100, 30);

        sales.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        sales.setForeground(new java.awt.Color(51, 0, 0));
        sales.setText("Sales");
        sales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesMouseClicked(evt);
            }
        });
        jPanel4.add(sales);
        sales.setBounds(700, 20, 50, 30);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(20, 250, 1130, 360);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 1210, 640);

        setSize(new java.awt.Dimension(1204, 704));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pricemarutiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pricemarutiKeyTyped
        char a=evt.getKeyChar();
        if(!forNumbers(a) && a!='\b' && a!='.')
        {
            evt.consume();
            JOptionPane.showMessageDialog(this,"Only Numbers Allowed","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_pricemarutiKeyTyped

    private void yearmarutiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearmarutiKeyTyped
        char a=evt.getKeyChar();
        if(!forNumbers(a) && a!='\b')
        {
            evt.consume();
            JOptionPane.showMessageDialog(this,"Only Numbers Allowed","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_yearmarutiKeyTyped

    private void quantitymarutiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantitymarutiKeyTyped
       char a=evt.getKeyChar();
        if(!forNumbers(a) && a!='\b')
        {
            evt.consume();
            JOptionPane.showMessageDialog(this,"Only Numbers Allowed","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_quantitymarutiKeyTyped

    private void retrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveActionPerformed
       if(empty())
       {
           try
           {
                add.setId(Integer.parseInt(pid.getText())); 
                ArrayList<Addproduct> list2=new ArrayList<>();
                System.out.println("--------------"+pid.getText());
                list2=spq.retrieve(add);

                Iterator<Addproduct> itr=list2.iterator();
                while(itr.hasNext())
                {
                    Addproduct additem=itr.next();

                    partnamemaruti.setText(additem.getPartname());
                    modelnamemaruti.setText(additem.getModelname());
                    pricemaruti.setText(Double.toString(additem.getPricegst()));
                    typemaruti.setText(additem.getType());
                    identity.setText(Integer.toString(additem.getId()));
                    yearmaruti.setText(Integer.toString(additem.getYear()));
                    companymaruti.setText(additem.getCompany());
                    codemaruti.setText(additem.getCode()); 
                }
           }catch(Exception e)
           {
              JOptionPane.showMessageDialog(this,"Unknown Id","Warning",JOptionPane.WARNING_MESSAGE);
           }
       }
       else
       {
            JOptionPane.showMessageDialog(this,"Please Enter Id","Warning",JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_retrieveActionPerformed

    private void addstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstockActionPerformed
       if(emptyfields())
       {
           additem.setPartname(partnamemaruti.getText());
           additem.setCompany(companymaruti.getText());
           additem.setModelname(modelnamemaruti.getText());
           additem.setYear(Integer.parseInt(yearmaruti.getText()));
           additem.setType(typemaruti.getText());
           additem.setPricewithgst(Double.parseDouble(pricemaruti.getText()));
           additem.setCode(codemaruti.getText());
           additem.setQuantity(Integer.parseInt(quantitymaruti.getText()));
           
           int i=spq.addStock(additem);
           if(i==1)
           {
               clear.doClick();
           }
       }
       else
       {
           JOptionPane.showMessageDialog(this,"Please Enter All Fields","ERROR",JOptionPane.ERROR_MESSAGE);
       }
       getstockdata();
       
    }//GEN-LAST:event_addstockActionPerformed

    private void marutistocktableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marutistocktableMouseClicked
       try
       {
           DefaultTableModel model3=(DefaultTableModel)marutistocktable.getModel();
           int r=marutistocktable.getSelectedRow();
           
           //pid.setText(model3.getValueAt(r,0).toString()); 
            partnamemaruti.setText(model3.getValueAt(r,1).toString());
            typemaruti.setText(model3.getValueAt(r,2).toString());
            modelnamemaruti.setText(model3.getValueAt(r,3).toString());
            yearmaruti.setText(model3.getValueAt(r,4).toString());
            companymaruti.setText(model3.getValueAt(r,5).toString());
            pricemaruti.setText(model3.getValueAt(r,6).toString());
            codemaruti.setText(model3.getValueAt(r,7).toString());
            quantitymaruti.setText(model3.getValueAt(r,8).toString());
           
       }catch(Exception e)
       {
           e.printStackTrace();
       }
    }//GEN-LAST:event_marutistocktableMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       clearall();
    }//GEN-LAST:event_clearActionPerformed

    private void stocksearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stocksearchKeyReleased
        String text=stocksearch.getText();
        filter(text);
        getstockdata();
    }//GEN-LAST:event_stocksearchKeyReleased

    private void gotoproductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoproductsMouseClicked
       Addproductframe apf=new Addproductframe();
       apf.getObj().setVisible(true); 
       this.dispose();
    }//GEN-LAST:event_gotoproductsMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       if(emptyfields())
       {
           MarutiStock maruti=new MarutiStock();
           maruti.setCode(codemaruti.getText());
           maruti.setQuantity(Integer.parseInt(quantitymaruti.getText()));
           maruti.setCompany(companymaruti.getText());
           maruti.setModelname(modelnamemaruti.getText());
           maruti.setPartname(partnamemaruti.getText());
           maruti.setPricewithgst(Double.parseDouble(pricemaruti.getText())); 
           maruti.setType(typemaruti.getText());
           maruti.setYear(Integer.parseInt(yearmaruti.getText()));
           
           spq.updateStock(maruti);
           getstockdata();
       }
       else
       {
            JOptionPane.showMessageDialog(this,"Please Select a Field From The Table","ERROR",JOptionPane.ERROR_MESSAGE);
       }
       clear.doClick();
    }//GEN-LAST:event_updateActionPerformed

    private void pidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pidKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
           retrieve.doClick();
       }
    }//GEN-LAST:event_pidKeyPressed

    private void salesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesMouseClicked
       Salesdetails sd=new Salesdetails();
       sd.getObj().setVisible(true); 
       this.dispose();
    }//GEN-LAST:event_salesMouseClicked

    public boolean empty()
    {
        if(pid.getText().isEmpty())
        {
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(MarutiStockDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarutiStockDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarutiStockDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarutiStockDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarutiStockDetails().setVisible(true);
            }
        });
    }

     public boolean emptyfields()
    {
        if(partnamemaruti.getText().isEmpty())
        {
            return false;
        }
        else if(typemaruti.getText().isEmpty())
        {
            return false;
        }
        else if(pricemaruti.getText().isEmpty())
        {
            return false;
        }
        else if(companymaruti.getText().isEmpty())
        {
            return false;
        }
        else if(yearmaruti.getText().isEmpty())
        {
            return false;
        }
        else if(quantitymaruti.getText().isEmpty())
        {
            return false;
        }
        else if(codemaruti.getText().isEmpty())
        {
            return false;
        }
        else if(modelnamemaruti.getText().isEmpty())
        {
            return false;
        }
        return true;
    }
     
     public void getstockdata()
     {
         DefaultTableModel model=(DefaultTableModel)marutistocktable.getModel();
         ArrayList<MarutiStock> list=new ArrayList<>();
         list=spq.getMarutiData();
         model.setRowCount(0); 
         Iterator<MarutiStock> itr=list.iterator();
         while(itr.hasNext())
         {
             MarutiStock stock=itr.next();
             model.addRow(new Object[]{stock.getId(),stock.getPartname(),stock.getModelname(),stock.getType(),stock.getYear(),stock.getCompany(),stock.getPricewithgst(),stock.getCode(),stock.getQuantity()});
         }
     }
     
     public void clearall()
     {
         partnamemaruti.setText("");
         typemaruti.setText("");
         modelnamemaruti.setText("");
         companymaruti.setText("");
         yearmaruti.setText("");
         pricemaruti.setText("");
         codemaruti.setText("");
         quantitymaruti.setText(""); 
     }
     
     private void filter(String query)
     {
         DefaultTableModel model2=(DefaultTableModel)marutistocktable.getModel();
         TableRowSorter<DefaultTableModel> sort=new TableRowSorter<DefaultTableModel>(model2);
         marutistocktable.setRowSorter(sort); 
         sort.setRowFilter(RowFilter.regexFilter("(?i)"+query));
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addstock;
    private javax.swing.JButton clear;
    private javax.swing.JTextField codemaruti;
    private javax.swing.JTextField companymaruti;
    private javax.swing.JLabel gotoproducts;
    private javax.swing.JTextField identity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTable marutistocktable;
    private javax.swing.JTextField modelnamemaruti;
    private javax.swing.JTextField partnamemaruti;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pricemaruti;
    private javax.swing.JTextField quantitymaruti;
    private javax.swing.JButton retrieve;
    private javax.swing.JLabel sales;
    private javax.swing.JTextField stocksearch;
    private javax.swing.JTextField typemaruti;
    private javax.swing.JButton update;
    private javax.swing.JTextField yearmaruti;
    // End of variables declaration//GEN-END:variables
}
