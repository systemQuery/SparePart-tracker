
package query;

import Forms.Supplier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Addproduct;
import model.Suppliermodel;

public class Addproductquery {

    PreparedStatement ps,ps1;
    Connection con;
    JFrame frame=new JFrame();
    ResultSet rs,rs1;

    public Addproductquery() {
        con=db.DB.connect();
        if(con==null){
            System.out.println("no connect");
        }
    }
    
    public int submitMaruti(Addproduct additem) {
        int k=0;
        try{
           String sql2="select * from addproduct where code=?";
           ps1=con.prepareStatement(sql2);
           ps1.setString(1,additem.getCode());
           rs=ps1.executeQuery();
           if(rs.next())
           {
               JOptionPane.showMessageDialog(frame,"This Unique Code is already in use.\nPlease try some other code.","Error",JOptionPane.ERROR_MESSAGE);
           }
           else
           {
                String sql="insert into addproduct (partname,year,type,modelname,company,code,price,pricewithgst,supplier) values(?,?,?,?,?,?,?,?,?)";
                ps=con.prepareStatement(sql);
                ps.setString(1,additem.getPartname());
                ps.setInt(2,additem.getYear());
                ps.setString(3,additem.getType());
                ps.setString(4,additem.getModelname());
                ps.setString(5,additem.getCompany());
                ps.setString(6,additem.getCode());
                ps.setDouble(7,additem.getPrice());
                ps.setDouble(8,additem.getPricegst());
                ps.setString(9,additem.getSupplier()); 
                
                int i=ps.executeUpdate();
                if(i==1)
                {
                    k=i;
                   // JOptionPane.showMessageDialog(frame,"Data Inserted","Information",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("inserted "+i);
                }
               // con.close();
              }
           }catch(Exception e){
                    System.out.println(e);
                }
//      con.close();
        return k;
    }

    public ArrayList<Addproduct> showData() {
        ArrayList<Addproduct> list=new ArrayList<>();
        try{
            String sql="select * from addproduct";
            rs=con.createStatement().executeQuery(sql);
            while(rs.next())
            {
                Addproduct p=new Addproduct();
                p.setCode(rs.getString("code"));
                p.setCompany(rs.getString("company"));
                p.setModelname(rs.getString("modelname"));
                p.setPartname(rs.getString("partname"));
                p.setPrice(rs.getDouble("price"));
                p.setType(rs.getString("type"));
                p.setYear(rs.getInt("year"));
                p.setId(rs.getInt("id")); 
                p.setPricegst(rs.getDouble("pricewithgst")); 
                p.setSupplier(rs.getString("supplier")); 
                
                list.add(p);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public void updateMarutiData(Addproduct item) {
        try{
                String sql1="update addproduct set company=?,modelname=?,partname=?,price=?,type=?,year=?,pricewithgst=?,supplier=? where id=?";
                ps=con.prepareStatement(sql1);
               
                ps.setString(1,item.getCompany());
                ps.setString(2,item.getModelname());
                ps.setString(3,item.getPartname());
                ps.setDouble(4,item.getPrice());
                ps.setString(5,item.getType());
                ps.setInt(6,item.getYear());
                ps.setDouble(7,item.getPricegst());
                ps.setString(8,item.getSupplier());
                ps.setInt(9,item.getId());
                System.out.println("================");
                int i=ps.executeUpdate();
                System.out.println("================"+i);
                if(i==1)
                {
                    System.out.println("update "+i);
                   // JOptionPane.showMessageDialog(frame,"Product data updated","Information",JOptionPane.INFORMATION_MESSAGE);
                }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public ArrayList<Suppliermodel> getSupplierName() {
        ArrayList<Suppliermodel> list2=new ArrayList<>();
        try
        {
            String sql="select * from supplier";
            ps=con.prepareStatement(sql);
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                Suppliermodel s=new Suppliermodel();
                s.setName(rs.getString("name"));
                
                list2.add(s);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return list2;
    }
    
}
