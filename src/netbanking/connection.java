package netbanking;

/**
 *
 * @author labib
 */

/*
jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
*/

import java.sql.*;

public class connection {
    
    Connection c;
    Statement s;

    public connection() {
        try{
            
            c = DriverManager.getConnection("jdbc:mysql:///kuet_bank", "root", "1234");
            s = c.createStatement();
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
            
    }
    
    
}
