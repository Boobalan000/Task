import java.util.Scanner;

class AgeNotWithinRangeException extends Exception{

}

class NameNotValidException extends Exception{

}

class Student{

    private int roll_no;
    private String name;
    private int age;
    private String course;

    public Student(int roll_no, String name,int age,String course) throws AgeNotWithinRangeException,NameNotValidException
    {
        this.roll_no=roll_no;
        ageChecker(age);
        nameChecker(name);
        this.course=course;
    }

    void ageChecker(int age)throws AgeNotWithinRangeException
    {
        if(age>=15 && age<=21)
        {
            this.age=age;
        }
        else
        {
            throw new AgeNotWithinRangeException();
        }
    }

    void nameChecker(String name)throws NameNotValidException
    {
        char a[]=new char[name.length()];

        for(int i=0;i<name.length();i++)
        {
            a[i]=name.charAt(i);
        }
        for(int i=0;i<name.length();i++)
        {
            if((a[i]>=65 && a[i]<=90)||(a[i]>=97 && a[i]<=122))
            {
                this.name=name;
            }

            else
            {
                throw new NameNotValidException();
            }
        }
    }
}

class StudentTester{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("Enter roll_no");
            int roll_no=scan.nextInt();
            String empty=scan.nextLine();
            System.out.println("Enter name");
            String name=scan.nextLine();
            System.out.println("Enter age");
            int age=scan.nextInt();
            System.out.println("Enter course");
            String course=scan.next();

            Student student=new Student(roll_no, name, age, course);
        }
        catch(Exception e)
        {
            System.out.println();
            System.out.println(e);
        }
    }
}