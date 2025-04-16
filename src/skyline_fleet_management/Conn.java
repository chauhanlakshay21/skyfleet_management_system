package skyline_fleet_management;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    
    public Conn() {
         try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              c = DriverManager.getConnection("jdbc:mysql://localhost:3306/skyline_fleet_management?useSSL=false&serverTimezone=UTC", "root", "Lakshay@1");

              s = c.createStatement();
          } catch (Exception e) {
           e.printStackTrace();
      
          }
 
     }   
}

