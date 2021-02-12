/**
 * The purpose of this program is to calculate your age in minutes
 * 
 * �FLVS 2007
 * @author B. Jordan 
 * @version 06/01/08
 */
import java.util.Scanner;                       
public class AgeCalculatorV1
{
    public static void main(String[] args)
    {       
        Scanner in = new Scanner(System.in);    
        System.out.println("Please enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.nextLine();
        System.out.print("\n");
        
        System.out.print("Please enter your age in years: ");
        String userAge = in.next();
        int ageInYears = Integer.parseInt(userAge);
        
        double approxAgeInDays = ageInYears * 365.25;
        double ageInHours = approxAgeInDays * 24;
        double ageInMinutes = ageInHours * 60;

        String firstInitial = firstName.substring(0,1);
        String capsLastName = lastName.toUpperCase();
        String name = firstInitial + capsLastName;
        
        System.out.print("Name: " + name);       
        System.out.print("\t\t Age in Minutes: " + ageInMinutes);
    }
}