package sql;

public class Employee {

	private static int id;
    private static String name;
	private static int age;
	private static int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		Employee.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		Employee.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		Employee.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		Employee.salary = salary;
	}
	
	
}
