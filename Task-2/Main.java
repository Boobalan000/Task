import java.util.Scanner;

class Main 
{
    public static void main (String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        
        Account a=new Account();
        


        a=new Account(123456789012l,"Salem");
        
        int n=s.nextInt();
        
        switch(n)
        {
            case 1:
                {
                    a.deposit();
                    break;
                }
            case 2:
                {
                    a.withdraw();
                    break;
                }
            case 3:
                {
                    a.displayBalance();
                    break;
                }
            default:
                {
                    System.out.println("Invalid data");
                }
        }
        
        
    }
}

class Account
{
    private int balance=1000;
    private int pin=1234;
    private long accno;
    private String branch;
    
    
    Scanner sc =new Scanner(System.in);
    
    public Account(long accno, String branch)
    {
        this.accno=accno;
        this.branch=branch;
    }
    
    public Account()
    {
        System.out.println("Enter 1-Deposit");
        System.out.println("Enter 2-Withdraw");
        System.out.println("Enter 3-Display balance");
    }
    
    public void deposit()
    {
        System.out.println("");
        System.out.println("Enter account number :");
        long acc=sc.nextLong();
        
        if(acc>99999999999l&&acc<1000000000000l&&acc!=accno)
        {
            System.out.println("Enter amount :");
            int amt =sc.nextInt();
            System.out.println("Successfully sent");
        }
        else if(acc>99999999999l&&acc<1000000000000l&&acc==accno)
        {
            System.out.println("Enter amount :");
            int amt =sc.nextInt();
            balance+=amt;
            System.out.println("Successfully added to your account");

            System.out.println("");
            System.out.println("Would you like to check balance?");
            System.out.println("1--Yes");
            System.out.println("0--No");

            int n=sc.nextInt();

            if(n==1)
            {
                System.out.println("");
                System.out.println("Balance :"+balance);
            }
            else
            {
                return;
            }
        }
        else
        {
            System.out.println("Account number is 12 digit");
        }
    }
    
    public void withdraw()
    {
        System.out.println("");
        System.out.println("Enter amount to withdraw :");
        int amt=sc.nextInt();
        System.out.println("Enter PIN :");
        int p=sc.nextInt();
        if(p==pin)
        {
            System.out.println("Collect your cash");
            balance-=amt;
        }
        else
        {
            System.out.println("Wrong pin");
        }
        System.out.println("");
        System.out.println("Would you like to check balance?");
        System.out.println("1--Yes");
        System.err.println("0--No");
        int n=sc.nextInt();

        if(n==1)
        {
            System.out.println("");
            System.out.println("Balance :"+balance);
        }
        else
        {
            return;
        }

    }
    
    public void displayBalance()
    {
        System.out.println("");
        System.out.println("Balance :"+balance);
        
    }
    
    
}