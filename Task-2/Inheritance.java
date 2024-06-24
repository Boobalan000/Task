class Inheritance 
{
 public static void main (String[] args)
 {
     Person p=new Employee();
 }   
}

class Person
{
     String name="Muthusamy";
     int age =22;
     String school="SKV";
     String college="MEC";
     int tenth_percent=90;
     int twelveth_percent=80;
     float cgpa=8.6f;
     String company;
     String field_of_work;
}

class Employee extends Person
{
    int employee_id=1010;
    int salary=45000;
    String comp=super.company="A2B";
    String field=super.field_of_work="Software developer";
    
    Employee()
    {
        
        System.out.println("Name        :"+super.name);
        System.out.println("Age         :"+super.age);
        System.out.println("company     :"+ comp );
        System.out.println("Designation :"+ field);
    }
}
   