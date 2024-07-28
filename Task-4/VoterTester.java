import java.util.Scanner;

class Voter{

    private int voter_id;
    private String name;
    private int age;

    public Voter(int voter_id,String name,int age)
    {
        this.voter_id=voter_id;
        this.name=name;
        ageChecker(age);
    }

    void ageChecker(int age)
    {
        if(age>=18)
        {
            this.age=age;
        }
        else
        {
            throw new ArithmeticException();
        }
    }
}

class VoterTester{
    public static void main (String args[])
    {
    Scanner scan=new Scanner(System.in);
    try
    {
        System.out.println("Enter Voter-id");
        int voter_id=scan.nextInt();
        String empty=scan.nextLine();
        System.out.println("Enter name");
        String name=scan.nextLine();
        System.out.println("Enter age");
        int age=scan.nextInt();

        Voter voter=new Voter(voter_id, name, age);
    }
    catch(Exception e)
    {
        System.out.println();
        System.out.println("Invalid age for voter");
    }
}
}