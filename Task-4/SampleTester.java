import java.util.Scanner;
import java.util.HashMap;

class Sample {

    HashMap<String,Integer> hashmap=new HashMap<>();

    public void addStudent(String name,int grade)
    {
        hashmap.put(name,grade);
    }

    public void removeStudent(String name)
    {
        hashmap.remove(name);
    }

    public void displayStudents()
    {
        System.out.println(hashmap);
    }
}

class SampleTester{
    
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        Sample sample=new Sample();
        //add the name and grade of student
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter name");
            String name=scan.nextLine();
            System.out.println("Enter grade out of 100");
            int grade=scan.nextInt();

            System.out.println("Enter 1-to add , 2-- to break");
            int num=scan.nextInt();
            String empty=scan.nextLine();
            sample.addStudent(name, grade);
            System.out.println();
            if(num==2)
            {
                break;
            }
        }

        System.out.println("enter 1--remove or 2-- display");
        int number=scan.nextInt();

        if(number==1)
        {
        System.out.println("Enter name of student to remove");
        String name=scan.nextLine();
        sample.removeStudent(name);
        System.out.println("removed successfully");
        System.out.println();
        } 

        else if(number==2)
        {
            System.out.println();
            sample.displayStudents();
        }
        
    }
}