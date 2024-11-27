import java.util.Scanner;
public class IT24103952Lab5Q3{
public static void main(String[]args){
Scanner scanner= new Scanner(System.in);
int roomChargesPerDay=48000;
double DISCOUNT_3_TO_4_DAYS=10.0;
double DISCOUNT_5_OR_MORE_DAYS=20.0;
int MIN_DAY= 1;
int MAX_DAY=31;
System.out.println("Enter the date (1 to 31)");
int startDate=scanner.nextInt();
System.out.println("Enter the date(1 to 31)");
int endDate=scanner.nextInt();

if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Dates must be between 1 and 31.");
            scanner.close();
            return;
        }
 if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            scanner.close();
            return;
        }
int numberOfDays=endDate -startDate+1;
 double discountRate = 0.0;
   if (numberOfDays >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        } else if (numberOfDays >= 3) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        }

         
        double totalAmount = numberOfDays * roomChargesPerDay;
double discountAmount = totalAmount * discountRate/100 ;
        double finalAmount = totalAmount - discountAmount;

System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Total amount: Rs " + totalAmount);
        System.out.println("Discount: Rs " + discountAmount);
        System.out.println("Final amount to be paid: Rs " + finalAmount);

        scanner.close();
    }
}


