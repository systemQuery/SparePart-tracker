
package Forms;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
//import static java.util.stream.DoubleStream.generate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MarutiStock;
import model.Sales;
import static model.Validate.forNumbers;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;
import query.Salesquery;

public class Salesdetails extends javax.swing.JFrame {

    public static Salesdetails sd=null;
    Salesquery sq=new Salesquery();
    MarutiStock obj=new MarutiStock();
    Sales saleitem=new Sales();
    DecimalFormat df=new DecimalFormat("##.#");
    
    public Salesdetails() {
        
        initComponents();
        String under="<html><u>Stock</u></html>";
        tostock.setText(under); 
    }
    
    public static Salesdetails getObj()
    {
        if(sd==null)
        {
            sd=new Salesdetails();
        }
        return sd;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        partnamesale = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        companysale = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pricesale = new javax.swing.JTextField();
        codesale = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        yearsale = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        typesale = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        availablesale = new javax.swing.JTextField();
        modelnamesale = new javax.swing.JTextField();
        retrievesale = new javax.swing.JButton();
        identity = new javax.swing.JTextField();
        salesadd = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        quantitysale = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        custname = new javax.swing.JTextField();
        custcontact = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        gstno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        custaddress = new javax.swing.JTextArea();
        delete = new javax.swing.JButton();
        tostock = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        saletable = new javax.swing.JTable();
        totalamt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        saveprint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sales Products");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel18.setText("SALES DETAILS");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(10, 0, 300, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1240, 40);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("PRODUCT SELLING DETAILS"));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Enter Spare Part Id:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 20, 130, 30);

        sid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sidKeyPressed(evt);
            }
        });
        jPanel3.add(sid);
        sid.setBounds(150, 20, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Part Name:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 70, 70, 30);

        partnamesale.setEditable(false);
        partnamesale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        partnamesale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(partnamesale);
        partnamesale.setBounds(130, 70, 210, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Company:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 110, 80, 30);

        companysale.setEditable(false);
        companysale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        companysale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(companysale);
        companysale.setBounds(130, 110, 210, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Model Name:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 150, 90, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Unique Code:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(380, 150, 90, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Price:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(380, 110, 60, 17);

        pricesale.setEditable(false);
        pricesale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pricesale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pricesale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pricesaleKeyTyped(evt);
            }
        });
        jPanel3.add(pricesale);
        pricesale.setBounds(470, 110, 210, 30);

        codesale.setEditable(false);
        codesale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codesale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(codesale);
        codesale.setBounds(470, 150, 210, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Model Year:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(380, 70, 80, 30);

        yearsale.setEditable(false);
        yearsale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearsale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yearsale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearsaleKeyTyped(evt);
            }
        });
        jPanel3.add(yearsale);
        yearsale.setBounds(470, 70, 210, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Type:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(710, 70, 50, 30);

        typesale.setEditable(false);
        typesale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        typesale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(typesale);
        typesale.setBounds(770, 70, 210, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Available:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(710, 110, 60, 30);

        availablesale.setEditable(false);
        availablesale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        availablesale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        availablesale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                availablesaleKeyTyped(evt);
            }
        });
        jPanel3.add(availablesale);
        availablesale.setBounds(770, 110, 210, 30);

        modelnamesale.setEditable(false);
        modelnamesale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modelnamesale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(modelnamesale);
        modelnamesale.setBounds(130, 150, 210, 30);

        retrievesale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        retrievesale.setText("Retrieve");
        retrievesale.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        retrievesale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrievesaleActionPerformed(evt);
            }
        });
        jPanel3.add(retrievesale);
        retrievesale.setBounds(370, 20, 90, 30);

        identity.setBackground(new java.awt.Color(153, 204, 255));
        identity.setBorder(null);
        jPanel3.add(identity);
        identity.setBounds(730, 20, 0, 14);

        salesadd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salesadd.setText("ADD");
        salesadd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        salesadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesaddActionPerformed(evt);
            }
        });
        jPanel3.add(salesadd);
        salesadd.setBounds(1050, 70, 110, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("(with GST)");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(380, 120, 70, 20);

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText(" CLEAR ALL");
        clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear);
        clear.setBounds(1050, 120, 110, 30);

        quantitysale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantitysale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quantitysale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantitysaleKeyTyped(evt);
            }
        });
        jPanel3.add(quantitysale);
        quantitysale.setBounds(770, 150, 210, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Quantity:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(710, 150, 60, 30);

        custname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        custname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(custname);
        custname.setBounds(130, 190, 210, 30);

        custcontact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        custcontact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        custcontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                custcontactKeyTyped(evt);
            }
        });
        jPanel3.add(custcontact);
        custcontact.setBounds(470, 190, 210, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Customer Name:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(20, 190, 110, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Address:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(710, 190, 60, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Contact:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(380, 190, 70, 30);

        gstno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gstno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(gstno);
        gstno.setBounds(130, 230, 210, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("GST Number:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(20, 234, 100, 20);

        custaddress.setColumns(20);
        custaddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        custaddress.setRows(5);
        custaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(custaddress);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(770, 190, 210, 70);

        delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete.setText("DELETE");
        delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete);
        delete.setBounds(1050, 170, 110, 30);

        tostock.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        tostock.setForeground(new java.awt.Color(51, 0, 0));
        tostock.setText("stock");
        tostock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tostock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tostockMouseClicked(evt);
            }
        });
        jPanel3.add(tostock);
        tostock.setBounds(570, 20, 50, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(20, 10, 1180, 270);

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("CUSTOMER SALES"));
        jPanel4.setLayout(null);

        saletable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr. No.", "PartName", "Company", "Model", "Type", "Code", "Quantity", "Price With GST(Per Part)", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        saletable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                saletableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(saletable);
        if (saletable.getColumnModel().getColumnCount() > 0) {
            saletable.getColumnModel().getColumn(0).setMinWidth(70);
            saletable.getColumnModel().getColumn(0).setMaxWidth(70);
            saletable.getColumnModel().getColumn(6).setMinWidth(70);
            saletable.getColumnModel().getColumn(6).setMaxWidth(70);
        }

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 1140, 230);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(20, 290, 1180, 270);

        totalamt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        totalamt.setText("0.00");
        totalamt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(totalamt);
        totalamt.setBounds(940, 570, 260, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel17.setText("Total Amount ");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(700, 570, 210, 30);

        saveprint.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        saveprint.setText("SAVE & PRINT");
        saveprint.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        saveprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveprintActionPerformed(evt);
            }
        });
        jPanel2.add(saveprint);
        saveprint.setBounds(40, 570, 170, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 1240, 620);

        setSize(new java.awt.Dimension(1243, 687));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pricesaleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pricesaleKeyTyped
        char a=evt.getKeyChar();
        if(!forNumbers(a) && a!='\b' && a!='.')
        {
            evt.consume();
            JOptionPane.showMessageDialog(this,"Only Numbers Allowed","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_pricesaleKeyTyped

    private void yearsaleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearsaleKeyTyped
        char a=evt.getKeyChar();
        if(!forNumbers(a) && a!='\b')
        {
            evt.consume();
            JOptionPane.showMessageDialog(this,"Only Numbers Allowed","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_yearsaleKeyTyped

    private void availablesaleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_availablesaleKeyTyped
        char a=evt.getKeyChar();
        if(!forNumbers(a) && a!='\b')
        {
            evt.consume();
            JOptionPane.showMessageDialog(this,"Only Numbers Allowed","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_availablesaleKeyTyped

    private void retrievesaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrievesaleActionPerformed
        if(empty())
        {
            try
            {
                obj.setId(Integer.parseInt(sid.getText()));
                ArrayList<MarutiStock> list2=new ArrayList<>();
                System.out.println("--------------"+sid.getText());
                list2=sq.retrieveFromStock(obj);

                Iterator<MarutiStock> itr=list2.iterator();
                while(itr.hasNext())
                {
                    MarutiStock additem=itr.next();

                    partnamesale.setText(additem.getPartname());
                    modelnamesale.setText(additem.getModelname());
                    pricesale.setText(Double.toString(additem.getPricewithgst()));
                    typesale.setText(additem.getType());
                    identity.setText(Integer.toString(additem.getId()));
                    yearsale.setText(Integer.toString(additem.getYear()));
                    companysale.setText(additem.getCompany());
                    codesale.setText(additem.getCode());
                    availablesale.setText(Integer.toString(additem.getQuantity()));
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
    }//GEN-LAST:event_retrievesaleActionPerformed
    int i=1;
    private void salesaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesaddActionPerformed
        if(emptyfields())
        {
            double totalprice=0;
            int a=Integer.parseInt(availablesale.getText());
            int b=Integer.parseInt(quantitysale.getText());
            Double price=Double.parseDouble(pricesale.getText());
            if(b<=a && b>0)
            {
                int remains=a-b;
                Sales sale=new Sales();
                sale.setQuantity(remains); 
                sale.setCode(codesale.getText());
                
                sq.stockUpdate(sale);           //stock update
                 
                ArrayList<Sales> list2=new ArrayList<>();
                DefaultTableModel model1=(DefaultTableModel)saletable.getModel();
                Double total=(b*price);
                totalprice=Double.parseDouble(totalamt.getText())+total;
                Double amount=Double.parseDouble(df.format(totalprice));
                totalamt.setText(Double.toString(amount));
                
                model1.addRow(new Object[]{i++,partnamesale.getText(),companysale.getText(),modelnamesale.getText(),typesale.getText(),codesale.getText(),quantitysale.getText(),pricesale.getText(),df.format(total)});
                clear();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Selling quantity should not be zero\nOR\n not greater than available quantity\n","ERROR",JOptionPane.ERROR_MESSAGE);
            }
//            saleitem.setPartname(partnamesale.getText());
//            saleitem.setCompany(companysale.getText());
//            saleitem.setModelname(modelnamesale.getText());
//            saleitem.setYear(Integer.parseInt(yearsale.getText()));
//            saleitem.setType(typesale.getText());
//            saleitem.setPricewithgst(Double.parseDouble(pricesale.getText()));
//            saleitem.setCode(codesale.getText());
//            saleitem.setQuantity(Integer.parseInt(quantitysale.getText()));
//            saleitem.setAvailable(Integer.parseInt(availablesale.getText()));

           // sq.saleProducts(saleitem);
            
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Please Enter All Fields","ERROR",JOptionPane.ERROR_MESSAGE);
        }
       // getstockdata();
        
    }//GEN-LAST:event_salesaddActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       DefaultTableModel model6=(DefaultTableModel)saletable.getModel();
        int rows=saletable.getRowCount();
        if(rows!=0)
        {
           for(int i=0;i<=model6.getRowCount()-1;i++) 
           {
               Sales sale=new Sales();
               sale.setCode(model6.getValueAt(i,5).toString());
               sale.setQuantity(Integer.parseInt(model6.getValueAt(i,6).toString()));
               
               int y=sq.addToStock(sale);
               if(y==1)
               {
                   System.out.println("----got it----");
               }
           }
        }
        clearall();
    }//GEN-LAST:event_clearActionPerformed

    private void quantitysaleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantitysaleKeyTyped
       char a=evt.getKeyChar();
        if(!forNumbers(a) && a!='\b')
        {
            evt.consume();
            JOptionPane.showMessageDialog(this,"Only Numbers Allowed","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_quantitysaleKeyTyped

    private void custcontactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custcontactKeyTyped
       char a=evt.getKeyChar();
        if(!forNumbers(a) && a!='\b')
        {
            evt.consume();
            JOptionPane.showMessageDialog(this,"Only Numbers Allowed","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_custcontactKeyTyped

    private void saletableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saletableKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_DELETE)
       {
           delete.doClick();
       }
    }//GEN-LAST:event_saletableKeyPressed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        double p,k;
        p=k=0;
        
        DefaultTableModel model3=(DefaultTableModel)saletable.getModel();
        int row=saletable.getSelectedRow();
        Sales sale=new Sales();
        
        try
        {
            p=Double.parseDouble(model3.getValueAt(row,8).toString());
            k=Double.parseDouble(totalamt.getText());
            totalamt.setText(df.format(k-p));
            
            sale.setCode(model3.getValueAt(row,5).toString());
            sale.setQuantity(Integer.parseInt(model3.getValueAt(row,6).toString()));
            
            sq.backToStock(sale);
            
            model3.removeRow(row); 
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void saveprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveprintActionPerformed
       if(emptyTable())
       {
           if(emptyCustomer())
           {
               Sales sale=new Sales();
              
               String invoice=getInvoice(12);
               sale.setCaddress(custaddress.getText());
               sale.setCcontact(custcontact.getText());
               sale.setCname(custname.getText());
               sale.setGstnumber(gstno.getText()); 
               sale.setTotalamt(Double.parseDouble(totalamt.getText()));
               
               DefaultTableModel model5=(DefaultTableModel)saletable.getModel();
               
               for(int i=0;i<=model5.getRowCount()-1;i++)
               {
                   //Sales sale1=new Sales();
                   sale.setPartname(model5.getValueAt(i,1).toString()); 
                   sale.setCompany(model5.getValueAt(i,2).toString());
                   sale.setModelname(model5.getValueAt(i,3).toString());
                   sale.setType(model5.getValueAt(i,4).toString()); 
                   sale.setCode(model5.getValueAt(i,5).toString());
                   sale.setQuantity(Integer.parseInt(model5.getValueAt(i,6).toString()));
                   sale.setPricewithgst(Double.parseDouble(model5.getValueAt(i,7).toString()));
                   sale.setAmount(Double.parseDouble(model5.getValueAt(i,8).toString()));
                   sale.setTotalamt(Double.parseDouble(totalamt.getText()));
                   sale.setInvoiceno(invoice); 
                   
                   int k=sq.submitSaleData(sale);
                   if(k==1)
                   {
                       
                   }
                   
               }
               
               try
               {
                   DefaultTableModel model6=(DefaultTableModel)saletable.getModel();
                   HashMap<String,Object> map=new HashMap<>();
                   map.put("name",custname.getText());
                   map.put("address",custaddress.getText());
                   map.put("contact",custcontact.getText());
                   map.put("gstnumber",gstno.getText());
                   map.put("totalamt",totalamt.getText());
                   map.put("invoice",invoice);
                   System.out.println("====ireport----------");
                   
                   JRTableModelDataSource datasource=new JRTableModelDataSource(model6);
                   String file="C:\\Users\\Administrator\\Documents\\NetBeansProjects\\MotorStock\\motorreport.jrxml";
                  // String report="C:\\Users\\Administrator\\Documents\\NetBeansProjects\\MotorStock\\motorreport.jrxml";
                   //InputStream file=new FileInputStream(new File(report));
                   //JasperDesign jd=JRXmlLoader.load(file);
                   JasperReport jr=JasperCompileManager.compileReport(file);
                   JasperPrint jp=JasperFillManager.fillReport(jr,map,datasource);
                   JasperViewer.viewReport(jp,false); 
                      clearall();      
               }catch(Exception e)
               {
                   e.printStackTrace();
               }
           }
           else
           {
               JOptionPane.showMessageDialog(this,"Please Fill in Customer Details","Error",JOptionPane.ERROR_MESSAGE);
           }
       }
       else
       {
           JOptionPane.showMessageDialog(this,"No Rows in the Table","Error",JOptionPane.ERROR_MESSAGE);
       }
      
    }//GEN-LAST:event_saveprintActionPerformed

    private void tostockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tostockMouseClicked
       MarutiStockDetails maruti=new MarutiStockDetails();
       maruti.getObj().setVisible(true); 
       this.dispose();
    }//GEN-LAST:event_tostockMouseClicked

    private void sidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sidKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
           retrievesale.doClick();
       }
    }//GEN-LAST:event_sidKeyPressed

    public void clear()
     {
         sid.setText(""); 
         partnamesale.setText("");
         typesale.setText("");
         modelnamesale.setText("");
         companysale.setText("");
         yearsale.setText("");
         pricesale.setText("");
         codesale.setText("");
         quantitysale.setText(""); 
         availablesale.setText("");
         
     }
    
     public void clearall()
     {
         DefaultTableModel model5=(DefaultTableModel)saletable.getModel();
         sid.setText(""); 
         partnamesale.setText("");
         typesale.setText("");
         modelnamesale.setText("");
         companysale.setText("");
         yearsale.setText("");
         pricesale.setText("");
         codesale.setText("");
         quantitysale.setText(""); 
         availablesale.setText("");
         custname.setText("");
         custcontact.setText("");
         custaddress.setText("");
         gstno.setText("");
         totalamt.setText("0.00"); 
         model5.setRowCount(0); 
         i=1;
     }
    
     public static String generate="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public String getInvoice(int len)
    {
        StringBuffer buffer=new StringBuffer(len);
        for(int i=0;i<len;i++)
        {
            int number=(int)(Math.random()*generate.length());
            buffer.append(generate.charAt(number));
        }
        return buffer.toString();
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
            java.util.logging.Logger.getLogger(Salesdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salesdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salesdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salesdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salesdetails().setVisible(true);
            }
        });
    }
    
     public boolean emptyfields()
    {
        if(partnamesale.getText().isEmpty())
        {
            return false;
        }
        else if(typesale.getText().isEmpty())
        {
            return false;
        }
        else if(pricesale.getText().isEmpty())
        {
            return false;
        }
        else if(companysale.getText().isEmpty())
        {
            return false;
        }
        else if(yearsale.getText().isEmpty())
        {
            return false;
        }
        else if(availablesale.getText().isEmpty())
        {
            return false;
        }
        else if(codesale.getText().isEmpty())
        {
            return false;
        }
        else if(modelnamesale.getText().isEmpty())
        {
            return false;
        }
        else if(quantitysale.getText().isEmpty())
        {
            return false;
        }
        return true;
    }
     
      public boolean empty()
    {
        if(sid.getText().isEmpty())
        {
            return false;
        }
        return true;
    }
      
      public boolean emptyTable()
      {
          int norows=saletable.getRowCount();
          if(norows==0)
          {
              return false;
          }
          return true;
      }
      
      public boolean emptyCustomer()
      {
          if(custaddress.getText().isEmpty())
          {
              return false;
          }
          else if(custcontact.getText().isEmpty())
          {
              return false;
         }
          else if(custname.getText().isEmpty())
          {
              return false;
          }
          else if(gstno.getText().isEmpty())
          {
              return false;
          }
          return true;
      }
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availablesale;
    private javax.swing.JButton clear;
    private javax.swing.JTextField codesale;
    private javax.swing.JTextField companysale;
    private javax.swing.JTextArea custaddress;
    private javax.swing.JTextField custcontact;
    private javax.swing.JTextField custname;
    private javax.swing.JButton delete;
    private javax.swing.JTextField gstno;
    private javax.swing.JTextField identity;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField modelnamesale;
    private javax.swing.JTextField partnamesale;
    private javax.swing.JTextField pricesale;
    private javax.swing.JTextField quantitysale;
    private javax.swing.JButton retrievesale;
    private javax.swing.JButton salesadd;
    private javax.swing.JTable saletable;
    private javax.swing.JButton saveprint;
    private javax.swing.JTextField sid;
    private javax.swing.JLabel tostock;
    private javax.swing.JTextField totalamt;
    private javax.swing.JTextField typesale;
    private javax.swing.JTextField yearsale;
    // End of variables declaration//GEN-END:variables

   
}
