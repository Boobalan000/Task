import java.util.Scanner;

class Book
{
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    Book(int id, String title, String author, Boolean available)
    {
        this.id=id;
        this.title=title;
        this.author=author;
        isAvailable=available;
    }

    public void setId(int i)
    {
        id=i;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public boolean getAvailable()
    {
        return isAvailable;
    }
}

class Library
{
    Book book[];
    private int count=5;

    Library()
    {
     book=new Book[20];
     book[0]=new Book(1,"The Unproposed Guy","Bhavik Sarkhedi",true);
     book[1]=new Book(2,"You Are Still the One","Himanshu Rai",true);
     book[2]=new Book(3,"I Too Had A Love Story","Ravinder Singh",true);
     book[3]=new Book(4,"The Girl Who Knew Too Much", "Ravinder Singh",true);
     book[4]=new Book(5,"Wish I Could Tell You","Durjoy Datta",true);
    }

    //method to display book details to the user 
    public void display()
    {
        for(int i=0; i<book.length;i++)
        {
            if(book[i]!=null&&book[i].getId()!=0)
            {
                System.out.println();
                System.out.println("Book id: "+book[i].getId()+"   "+"Title: "+book[i].getTitle()+"   "+"Author: "+book[i].getAuthor());
            }
        }
    }

    //method to add value to Book instance variables using Book constructor
    public void add(int id, String title, String author, boolean status)
    {
        book[count]=new Book(id,title,author,status);
        count++;
    }

    //method to remove book details from array of books
    public void remove(int id)
    {
        for(int i=0;i<book.length;i++)
        {
            if(id==book[i].getId())
            {
                book[i]=null;
                System.out.println("Successfully removed");
                break;
            }
        }
    }

    //method to search the book details using id
    public void search(int id)
    {
        for(int i=0;i<book.length;i++)
        {
            if(id==book[i].getId())
            {
                System.out.println();
                System.out.println("Book Title: "+book[i].getTitle());
                System.out.println("Book Author: "+book[i].getAuthor());
                break;
            }
        }
    }

}

class BookManagementSystem
{
    public static void main(String[] args) 
    {
        Library lib=new Library();
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number listed below for Book operation: ");
        System.out.println("1--Add ");
        System.out.println("2--Remove");
        System.out.println("3--Search");
        System.out.println("4--Display");

        int num=scan.nextInt();

        switch(num)
        {
            case 1:
            {
                System.out.println();
                System.out.println("How much books you need add : like 1 or 2");
                int n=scan.nextInt();
                for(int i=0;i<n;i++)
                {
                    System.out.println("Enter id of book");
                    int id=scan.nextInt();
                    if(id<=5)
                    {
                        System.out.println();
                        System.out.println("Invalid id ");
                        System.out.println("1 to 5 is already in our library");
                        break;
                    }
                    String empty=scan.nextLine();
                    System.out.println("Enter title of book");
                    String title=scan.nextLine();
                    System.out.println("Enter author name");
                    String author=scan.nextLine();
                    //empty=scan.nextLine();
                    System.out.println("Enter status of book: like is available or not, true or false");
                    boolean status=scan.nextBoolean();
                    lib.add(id,title,author,status);
                }

                System.out.println("Do you want to overview books in our library, 1--yes 2--no");
                int number=scan.nextInt();
                if(number==1)
                {
                    lib.display();
                }
                else
                {
                    break;
                }

                break;
            }

            case 2:
            {
                System.out.println();
                System.out.println("Enter id of book to remove");
                int id=scan.nextInt();
                lib.remove(id);
                System.out.println();
                System.out.println("Do you want to overview the books, 1--yes, 2--no");
                int number=scan.nextInt();
                if(number==1)
                {
                    lib.display();
                }
                break;
            }

            case 3:
            {
                System.out.println();
                System.out.println("Enter id of book to search");
                int id=scan.nextInt();
                lib.search(id);
                break;
            }

            case 4:
            {
                lib.display();
                break;
            }

            default :
            {
                System.out.println("Invalid data");
                break;
            }

        }
    }
}