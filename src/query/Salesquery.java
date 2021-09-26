
package query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Addproduct;
import model.MarutiStock;
import model.Sales;

public class Salesquery {

    Connection con;
    PreparedStatement ps,ps1;
    ResultSet rs;
    JFrame frame=new JFrame();
    
    public Salesquery() {
    
        con=db.DB.connect();
        if(con==null)
        {
            System.out.println("no-----connection");
        }
    }
    
    public ArrayList<MarutiStock> retrieveFromStock(MarutiStock obj) {
         ArrayList<MarutiStock> list=new ArrayList<>();
        try{
            String sql="select * from marutistock where id=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getId());
            
            rs=ps.executeQuery();
            if(rs.next())
            {
                MarutiStock add=new MarutiStock();
               
                add.setCode(rs.getString("code"));
                add.setCompany(rs.getString("company"));
                add.setId(rs.getInt("id"));
                add.setPartname(rs.getString("partname"));
                add.setModelname(rs.getString("modelname"));
                add.setType(rs.getString("type"));
                add.setYear(rs.getInt("year"));
                add.setPricewithgst(rs.getDouble("pricewithgst")); 
                add.setQuantity(rs.getInt("quantity")); 
                
                list.add(add);
            }
            else
            {
                JOptionPane.showMessageDialog(frame,"Unknown Id","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
       return list; 
    }

    public void stockUpdate(Sales sale) {
       try
       {
           String sql1="update marutistock set quantity=? where code=?";
           ps=con.prepareStatement(sql1);
           ps.setInt(1,sale.getQuantity());
           ps.setString(2,sale.getCode());
           
           int i=ps.executeUpdate();
           if(i==1)
           {
               System.out.println("===updated==="+i);
           }
           
       }catch(Exception e)
       {
           e.printStackTrace();
       }
    }

    public void backToStock(Sales sale) {
       try
       {
           String sql2="select * from marutistock where code=?";
           ps=con.prepareStatement(sql2);
           ps.setString(1,sale.getCode());
           
           rs=ps.executeQuery();
           if(rs.next())
           {
               int stock=rs.getInt("quantity");
               int remains=sale.getQuantity()+stock;
               
               String sql3="update marutistock set quantity=? where code=?";
               ps1=con.prepareStatement(sql3);
               ps1.setInt(1,remains);
               ps1.setString(2,sale.getCode());
               
               int j=ps1.executeUpdate();
               if(j==1)
               {
                   System.out.println("---update---"+j);
               }
           }
       }catch(Exception e)
       {
           e.printStackTrace();
       }
    }

    public int submitSaleData(Sales sale) {
        int i=0;
        try
        {
            String sql3="insert into salestable (partname,modelname,type,company,pricewithgst,code,quantity,custname,custaddress,custcontact,gstnumber,totalamt,saledate,invoice) values (?,?,?,?,?,?,?,?,?,?,?,?,SYSDATE(),?)";
            ps=con.prepareStatement(sql3);
            
            ps.setString(1,sale.getPartname());
            ps.setString(2,sale.getModelname());
            ps.setString(3,sale.getType());
            ps.setString(4,sale.getCompany());
            ps.setDouble(5,sale.getPricewithgst());
            ps.setString(6,sale.getCode());
           // ps.setInt(7,sale.getAvailable());
            ps.setInt(7,sale.getQuantity());
            ps.setString(8,sale.getCname());
            ps.setString(9,sale.getCaddress());
            ps.setString(10,sale.getCcontact());
            ps.setString(11,sale.getGstnumber());
            ps.setDouble(12,sale.getTotalamt());
            ps.setString(13,sale.getInvoiceno());
            
            int j=ps.executeUpdate();
            if(j==1)
            {
                i=j;
                System.out.println("---sale inserted---");
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return i;
    }

    public int addToStock(Sales sale) {
       int p=0;
       try{
           String sql4="select * from marutistock where code=?";
           ps=con.prepareStatement(sql4);
           ps.setString(1,sale.getCode());
           rs=ps.executeQuery();
           if(rs.next())
           {
               int a=rs.getInt("quantity");
               int b=sale.getQuantity();
               int total=a+b;
               
               String sql5="update marutistock set quantity=? where code=?";
               ps1=con.prepareStatement(sql5);
               ps1.setInt(1,total);
               ps1.setString(2,sale.getCode());
               
               int j=ps1.executeUpdate();
               if(j==1)
               {
                   p=j;
                   System.out.println("===added----");
               }
           }
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       return p;
    }

    
}
