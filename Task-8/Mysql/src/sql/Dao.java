package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Dao {
	
    static Employee employee=new Employee();
	static Connection con=null;


	public static void connect()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","007boo");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static Employee insertEmployee()
	{
		 String query="insert into employee_details(empcode,empname,empage,esalary) values(?,?,?,?) ";
		 
		 try
		 {
			 PreparedStatement smt=con.prepareStatement(query);
			 smt.setInt(1, employee.getId());
			 smt.setString(2, employee.getName());
			 smt.setInt(3, employee.getAge());
			 smt.setInt(4, employee.getSalary());
			 
			 smt.executeUpdate();
			 con.close();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		System.out.println("successfully inserted :)");
		return employee;
	}
}
