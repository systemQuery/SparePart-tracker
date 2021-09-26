/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Suppliermodel;

/**
 *
 * @author Administrator
 */
public class Supplierquery {
    
    PreparedStatement ps;
    JFrame frame=new JFrame();
    ResultSet rs;
    Connection con;

    public Supplierquery() {
        con=db.DB.connect();
        if(con==null)
        {
             System.out.println("no connection"+con);
        }
    }
    
    public void inserting(Suppliermodel sm)
    {
        try{
            String sql="insert into supplier (name,mobile,address) values(?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setString(1,sm.getName());
            ps.setString(2,sm.getMobile());
            ps.setString(3,sm.getAddress());
            System.out.println("///////////////////////");
            int i=ps.executeUpdate();
            if(i==1)
            {
                JOptionPane.showMessageDialog(frame,"Supplier data inserted","Information",JOptionPane.INFORMATION_MESSAGE);
            }
              
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

    public void updating(Suppliermodel sm) {
        try
        {
            String sql="update supplier set name=?,mobile=?,address=? where id=?";
            ps=con.prepareStatement(sql);
            
            ps.setString(1,sm.getName());
            ps.setString(2,sm.getMobile());
            ps.setString(3,sm.getAddress());
            ps.setInt(4,sm.getId());
            
            int i=ps.executeUpdate();
            if(i==1)
            {
                JOptionPane.showMessageDialog(frame,"Supplier Data Updated","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public ArrayList<Suppliermodel> getSupplierData() {
        ArrayList<Suppliermodel> list1 = new ArrayList<>();
        try
        {
            String sql1="select * from supplier";
            ps=con.prepareStatement(sql1);
            rs=ps.executeQuery();
            while(rs.next())
            {
                Suppliermodel sup=new Suppliermodel();
                sup.setId(rs.getInt("id"));
                sup.setAddress(rs.getString("address"));
                sup.setMobile(rs.getString("mobile"));
                sup.setName(rs.getString("name")); 
                
                list1.add(sup);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return list1;
    }
    
}
