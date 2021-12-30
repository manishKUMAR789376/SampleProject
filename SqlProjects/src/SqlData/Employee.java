package SqlData;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;



public class Employee {
	public static void main(String[] args)  {
	
		try {
			/*Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","1234");
		Statement st =  con.createStatement();*/
			Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","1234");
	      
	         Statement st = con.createStatement();
		st.execute("drop table if exists Employe");
		st.execute("create table Employe(emp_id int, emp_name  varchar(30), sal int, dept int )");
		st.executeUpdate("insert into Employe values(1, 'mani', 35000, 10)");
		st.executeUpdate("insert into Employe values(2, 'virat', 45000, 10)");
		st.executeUpdate("insert into Employe values(1, 'abd', 25000, 20)");
		st.execute("alter table Employe add location varchar(30)");
		st.execute("delete from Employe where EMP_id=2");
		
		/*ResultSet r=st.executeQuery("SELECT * FROM EMPLOYE");
		ResultSetMetaData m= (ResultSetMetaData) r.getMetaData();//r.getMetaData(
		for(int i=1;i<=m.getColumnCount();i++) {
			System.out.println(m.getColumnName(i)+"");
		}
		System.out.println();
		while(r.next()) {
			for(int i=1;i<=m.getColumnCount();i++) {
				System.out.println(((ResultSetMetaData) r).getColumnName(i)+"");
			}
			System.out.println();*/
			
		//}
		System.out.println("created THE EMPLOYE TABLE");
		
		}
		catch(Exception e) {
			System.out.println("sql syntax error");
		}
		 
	   }
	}
