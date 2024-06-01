import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
System.out.println("Enter value to reverse it");
Scanner s=new Scanner(System.in);
int i=s.nextInt();
int rev=0;
while(i>0)
{
int d=i%10;
rev=d+rev*10;
i=i/10;
}
System.out.println(rev);
}
}