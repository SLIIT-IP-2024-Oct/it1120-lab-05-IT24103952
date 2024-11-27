import java.util.Scanner;
public class IT24103952Lab5Q1{
public static void main(String[]args){
Scanner scanner= new Scanner(System.in);
System.out.println("Enter number1");
int num1 =scanner.nextInt();
System.out.println("Enter number2");
int num2 =scanner.nextInt();
System.out.println("Enter number3");
int num3 =scanner.nextInt();
 int largestNumber=(num1>num2)
?(num1>num3?num1:num3)
:(num2>num3?num2:num3);
int smallestNumber=(num1<num2)
?(num1<num3?num1:num3)
:(num2<num3?num2:num3);
System.out.println("Largest number:" + largestNumber);
System.out.println("smallest number:" + smallestNumber);
scanner.close();
}
}