import java.util.Scanner;
class Smallest
{
public static void main(String args[])
{
System.out.println("Enter three values to check smallest among them");
Scanner s=new Scanner(System.in);
int a[]=new int[3];
int i;
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}
int small=a[0];
for(i=0;i<a.length;i++)
{
if(a[i]<small)
{
small=a[i];
}
}
System.out.println(small);
}
}