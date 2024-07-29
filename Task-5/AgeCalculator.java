import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
class AgeCalculator{

    static void ageCalculator(LocalDate dob,LocalDate current_date)
    {
        Period period=Period.between(dob, current_date);
        System.out.println("Your age is: "+period.getYears()+" years, "+period.getMonths()+" months, and "+period.getDays()+" days");
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter yor 'Date of Birth in yyyy-mm-dd': ");
        String dateStr=scan.nextLine();
        String dmy[]=dateStr.split("-");
        int year=Integer.parseInt(dmy[0]);
        int month=Integer.parseInt(dmy[1]);
        int day=Integer.parseInt(dmy[2]);
        
        try
        {
            LocalDate dob=LocalDate.of(year, month, day);
            LocalDate cur_date=LocalDate.now();
            ageCalculator(dob, cur_date);
        }
        catch(Exception e)
        {
            System.out.println("Invalid value");
            System.out.println("Enter in this format 2024-12-31 ");
        }
    }
}