package itp;

import java.sql.*;

public class ConnectionDemo {
	
	public static void main(String[]args) throws Exception{
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			
		   Statement st=con.createStatement();
		   ResultSet rs=st.executeQuery("select* from student");
		   
		   
		   while(rs.next())
		   {
		   int id=rs.getInt("id");
		   String Name=rs.getString("Name");
		   String gender=rs.getString("gender");
		   
		   System.out.print(id+" "+Name+" "+gender);
		   }
             st.close();
		   	 con.close();
		}
	}

		   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
		

