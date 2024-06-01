import java.util.Scanner;

class Discount
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int amount=s.nextInt();
float dis=0f;
if(amount>=500&&amount<=1000)
{
 dis=0.1f*(float)amount;
}
 if(amount>1000)
{
 dis=0.2f*(float)amount;
}
int fin=amount-(int)dis;
System.out.println(fin);
}
}
