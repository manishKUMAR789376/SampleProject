package SqlData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestApplication {
 

   public static void main(String[] args) throws ClassNotFoundException {
     
      try {
    		Class.forName("com.mysql.jdbc.Driver");
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","1234");
      
         Statement stmt = con.createStatement();
         stmt.execute("drop table if exists sal");
       		 stmt.execute("create table sal(sal int,hra int)");
       		 stmt.executeUpdate("insert into sal values(15990,2343)");
       		 stmt.executeUpdate("insert into sal values(1565,6554)");
       		stmt.executeUpdate("delete from sal where sal=1565");
       		stmt.executeUpdate("insert into sal values(14455,54345)");
       		stmt.execute("alter table sal add (email_id varchar(12))");
       		
       		

         
         System.out.println("Created table in given database..."); 
        
       
      }
       catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}