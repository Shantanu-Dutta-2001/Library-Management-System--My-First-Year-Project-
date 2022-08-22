/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author Dell
 */
public class Connect
{
 public static Connection getCon()
  {
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryms","root","sudeshna1");
          return con;
      }
      catch(Exception e)
      {
         System.out.println(e);
         return null;
      }
      
          
  }
     
}
