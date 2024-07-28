import java.util.Scanner;

interface Taxable
{
    float incomeTax=10.5f;
    float saleTax=7f;

    int calcTax();
}


class Employee implements Taxable 
{
    private int empid;
    private String name;
    private int salary;
    
    Employee(int empid, String name,int salary )
    {
        this.empid=empid;
        this.name=name;
        this.salary=salary;
    }
    public int calcTax()
    {
        float rem=0; 

        float tax= incomeTax*(float)(salary*0.01);
        return (int)tax;
    }
}


class Product implements Taxable
{
    private int pid;
    private int price;
    private int quantity;

    Product(int pid, int price, int quantity)
    {
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    public int calcTax()
    {
        float tax= saleTax*(float)(price*0.01);
        return (int)tax;
    }
}

class DriverMain
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number ");   
        System.out.println("1--Employee data");
        System.out.println("2--Product data");
        int n=scan.nextInt();

        if(n==1)
        {
            System.out.println();
            System.out.println("Enter employee id:");
            int id=scan.nextInt();
            String empty=scan.nextLine();
            System.out.println("Enter employee name: ");
            String name=scan.nextLine();
            System.out.println("Enter employee salary: ");
            int salary=scan.nextInt();
            
            Employee employ=new Employee(id, name, salary);
            System.out.println();
            System.out.println("Annual tax: "+employ.calcTax());
        }
        else if(n==2)
        {
            System.out.println();
            System.out.println("Enter product id: ");
            int id=scan.nextInt();
            System.out.println("Enter price of product: ");
            int price=scan.nextInt();
            System.out.println("Enter quantity of product: ");
            int quantity=scan.nextInt();

            Product p=new Product(id, price, quantity);
            System.out.println();
            System.out.println("Sales tax per product: "+p.calcTax());
        }
        else 
        {
            System.out.println();
            System.out.println("Invalid data");
            return;
        }
    }
}