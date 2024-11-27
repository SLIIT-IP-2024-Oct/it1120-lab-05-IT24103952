import java.util.Scanner;
public class IT24103952Lab5Q2{
public static void main(String[]args){
Scanner scanner= new Scanner(System.in);
System.out.println("Enter the new member");
int newMember=scanner.nextInt();
if(newMember<0){
System.out.println("Invaild! new member cannot be a negative number");
}else{
String prize;
switch (newMember){

case 0: prize = "No Prize";
       break;
case 1:
       prize = "Pen";
       break;
case 2:
       prize = "Umbrella";
       break;
case 3:
       prize = "Bag";
       break;
case 4:
       prize = "Travelling chair";
       break;
default:
       prize="Head phone";
}
System.out.println("Prize: " +prize);
}
scanner.close();
}
}
