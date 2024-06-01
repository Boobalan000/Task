import java.util.Scanner;
class Checker
{
public static void main(String args[])
{
System.out.println("Enter value to check it's sign");
Scanner s=new Scanner(System.in);
Float a=s.nextFloat();
if(a>=0)
{
System.out.println("Positive");
}
else
{
System.out.println("Negative");
}
}
}
