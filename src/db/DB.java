
package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    
    static Connection con;
    public static Connection connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/garagestock786", "root", "root");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
    
    public static void main(String[] args)
    {
        System.out.println("---=========------"+connect());
    }
    
}
