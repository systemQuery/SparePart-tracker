
package query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Addproduct;
import model.MarutiStock;

public class MarutistockQuery {
    
    Connection con;
    PreparedStatement ps,ps1,ps2;
    ResultSet rs;
    JFrame frame=new JFrame();

    public MarutistockQuery() {
        con=db.DB.connect();
        if(con==null)
        {
            System.out.println("no=====");
        }
    }
    
    public ArrayList<Addproduct> retrieve(Addproduct ap)
    {
        ArrayList<Addproduct> list=new ArrayList<>();
        try{
            String sql="select * from addproduct where id=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1,ap.getId());
            
            rs=ps.executeQuery();
            if(rs.next())
            {
                Addproduct add=new Addproduct();
                add.setCode(rs.getString("code"));
                add.setCompany(rs.getString("company"));
                add.setId(rs.getInt("id"));
                add.setPartname(rs.getString("partname"));
                add.setModelname(rs.getString("modelname"));
                add.setType(rs.getString("type"));
                add.setYear(rs.getInt("year"));
                add.setPricegst(rs.getDouble("pricewithgst")); 
                
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

    public int addStock(MarutiStock add) {
        int k=0;
       
        try{
            String sql1="select * from marutistock where code=?";
            ps=con.prepareStatement(sql1);
            
            ps.setString(1,add.getCode());
            rs=ps.executeQuery();
            if(rs.next())
            {
                int a=rs.getInt("quantity");
                int b=add.getQuantity();
                int total=a+b;
                //System.out.println("\\\\\\\\\\\\\\"+total);
                
                String sql2="update marutistock set pricewithgst=?,quantity=?,partname=?,type=?,modelname=?,year=?,company=? where code=?";
                ps1=con.prepareStatement(sql2);
                ps1.setDouble(1,add.getPricewithgst());
                ps1.setInt(2,total);
                ps1.setString(3,add.getPartname());
                ps1.setString(4,add.getType());
                ps1.setString(5,add.getModelname());
                ps1.setInt(6,add.getYear());
                ps1.setString(7,add.getCompany());
                ps1.setString(8,add.getCode());
                
                int f=ps1.executeUpdate();
                if(f==1)
                {
                    k=f;
                       System.out.println("updated....."+f);
                       //JOptionPane.showMessageDialog(frame,"Stock Updated","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else
            {
                String sql3="insert into marutistock (partname,type,modelname,year,company,pricewithgst,code,quantity) values(?,?,?,?,?,?,?,?)";
                ps2=con.prepareStatement(sql3);
                ps2.setString(1,add.getPartname());
                ps2.setString(2,add.getType());
                ps2.setString(3,add.getModelname());
                ps2.setInt(4,add.getYear());
                ps2.setString(5,add.getCompany());
                ps2.setDouble(6,add.getPricewithgst());
                ps2.setString(7,add.getCode());
                ps2.setInt(8,add.getQuantity());
                
                int j=ps2.executeUpdate();
                if(j==1)
                {
                    k=j;
                    System.out.println("=====inserted "+j);
                   // JOptionPane.showMessageDialog(frame,"New Stock Inserted","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return k;
    }

    public ArrayList<MarutiStock> getMarutiData() {
         ArrayList<MarutiStock> list=new ArrayList<>();
         try
         {
             String sql4="select * from marutistock";
             ps=con.prepareStatement(sql4);
             rs=ps.executeQuery();
             while(rs.next())
             {
                 MarutiStock ms=new MarutiStock();
                 
                 ms.setCode(rs.getString("code"));
                 ms.setCompany(rs.getString("company"));
                 ms.setId(rs.getInt("id"));
                 ms.setModelname(rs.getString("modelname"));
                 ms.setPartname(rs.getString("partname"));
                 ms.setPricewithgst(rs.getDouble("pricewithgst"));
                 ms.setQuantity(rs.getInt("quantity"));
                 ms.setType(rs.getString("type"));
                 ms.setYear(rs.getInt("year"));
                 
                 list.add(ms);
             }
         }catch(Exception e)
         {
             e.printStackTrace();
         }
         return list;
    }

    public void updateStock(MarutiStock maruti) {
       try
       {
           String sql5="update marutistock set quantity=?,partname=?,type=?,modelname=?,year=?,company=?,pricewithgst=? where code=?";
           ps=con.prepareStatement(sql5);
           ps.setInt(1,maruti.getQuantity());
           ps.setString(2,maruti.getPartname());
           ps.setString(3,maruti.getType());
           ps.setString(4,maruti.getModelname());
           ps.setInt(5,maruti.getYear());
           ps.setString(6,maruti.getCompany());
           ps.setDouble(7,maruti.getPricewithgst());
           ps.setString(8,maruti.getCode());
           
           int i=ps.executeUpdate();
           if(i==1)
           {
               //JOptionPane.showMessageDialog(frame,"Stock Updated","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
           }
       }catch(Exception e)
       {
           e.printStackTrace();
       }
    }
    
}
