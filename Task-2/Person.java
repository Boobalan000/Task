import java.util.Scanner;
class Person
{
int age=18;
String name="John";

void setName(String name)
{
this.name=name;
}

String getName()
{
return name;
}

void setAge(int age)
{
this.age=age;
}

int getAge()
{
return age;
}

public static void main(String args [])
{
System.out.println("It contain default values to change press:1 or to display press any numbers");
Scanner s=new Scanner(System.in);
int n=s.nextInt();

Person p=new Person();

if(n==1)
{
System.out.println("Enter Name and Age");
String name=s.next();
int age=s.nextInt();
p.setName(name);
p.setAge(age);
System.out.println();
System.out.println("Name : " + p.getName());
System.out.println("Age  : " + p.getAge());
}

else
{
System.out.println();
System.out.println("Name : " + p.getName());
System.out.println("Age  : " + p.getAge());
}
}
}








