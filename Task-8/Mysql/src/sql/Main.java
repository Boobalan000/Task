package sql;

import java.util.Scanner;

public class Main {
	
public static void main(String args[])
{
	Employee employee=new Employee();
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter employee id :");
	int id=scan.nextInt();
	String empty=scan.nextLine();
	System.out.println("Enter employee name :");
	String name=scan.nextLine();
	System.out.println("Enter employee age :");
	int age=scan.nextInt();
	System.out.println("Enter employee salary :");
	int salary=scan.nextInt();
	
	employee.setId(id);
	employee.setName(name);
	employee.setAge(age);
	employee.setSalary(salary);
	
	Dao.connect();
	Dao.insertEmployee();
	scan.close();

}

}
