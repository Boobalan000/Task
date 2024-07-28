import java.util.Scanner;

class Week_days{
    private int index;
    private String week[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    public void setInedx(int index)
    {
        this.index=index;
    }
    public String getDay()
    {
        return week[index];
    }
}

class Test{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("Enter within 0-6 to print days");
            int index=scan.nextInt();
            System.out.println();
            Week_days wd=new Week_days();
            wd.setInedx(index);
            System.out.println(wd.getDay());
        }
        catch(Exception e)
        {
            System.out.println("Wrong input");
            System.out.println("Enter number within 0-6");
        }
    }
}