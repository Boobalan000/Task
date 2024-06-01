class Pattern
{
public static void main(String args[])
{
int i,j,k;
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
if((i==1&&j>0)||(i==2&&j==1)||(i==3&&j==1)||(i==4&&j==1))
{
System.out.print("4 ");
}
if(i==0||j==0)
{
System.out.print("5 ");
}
if((i==2&&j>1)||(i==3&&j==2)||(i==4&&j==2))
{
System.out.print("3 ");
}
if((i==3&&j>2)||(i==4&&j==3))
{
System.out.print("2 ");
}
if(i==4&&j==4)
{
System.out.print("1 ");
}
}
System.out.println();
}
}
} 