import java.util.Scanner;

class Product_main 
{
    public static void main (String[] args) {
        System.out.println("enter product information");
        System.out.println("(Product id, Price, Quantity)");

        
        Scanner s=new Scanner(System.in);
        
        int pid[]=new int[5];
        int price[]=new int[5];
        int quan[]=new int[5];
        int i;
        
        for(i=0;i<pid.length;i++)
        {
            System.out.println("");
            System.out.println("Enter Product id :");
            pid[i]=s.nextInt();
            System.out.println("Enter Price :");
            price[i]=s.nextInt();
            System.out.println("Quantity :");
            quan[i]=s.nextInt();
        }
        
        Product p=new Product(pid,price,quan,pid.length);
        
        System.out.println("");
        System.out.println("Enter 0 to see Highest price with id or 1 to see Toatl amount");
        int n=s.nextInt();
        
        if(n==0)
        {
            p.findHigh();
        }
        
        if(n==1)
        {
            System.out.println("");
            System.out.println("Total spend :"+p.totalSpend());
        }
        
        s.close();
        
    }
}

class Product
{
    private int size;
     private int pid[]=new int[size];
     private int price[]=new int[size];
     private int quan[]=new int[size];
    
    public Product(int pid[], int price[], int quan[],int size)
    {
        this.size=size;
        this.pid=pid;
        this.price=price;
        this.quan=quan;
    }
    
    public void dispalyInfo()
    {
       int i;
      //  System.out.print(quan.length);
        
        /*for(int i:pid)
        {
            System.out.println(i);
        }
        */
        for(i=0;i<size;i++)
        {
            System.out.println("PRODUCT ID :"+pid[i]+" PRICE :"+price[i]+" QUANTITY :"+quan[i]);
        }
        
    }
    
    public int totalSpend()
    {
        int i;
        int sum=0;
        
        for(i=0;i<size;i++)
        {
         sum=(price[i]*quan[i])+sum;
         
        }
        
        return sum;
    }
    
    public void findHigh()
    {
        int max=price[0];
        int i;
        int finder=0;
        for(i=0;i<size;i++)
        {
            if(max<price[i])
            {
                max=price[i];
                finder=i;
            }
        }
        System.out.println("");
        System.out.println("Product id :"+pid[finder]+" Price :"+max);
        
    }
    
}