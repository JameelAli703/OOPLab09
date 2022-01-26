package Lab09;
import java.util.Scanner;

public class Question01 {
    //1. Write a code to handle ArithmeticException and IndexOutOfBoundsException
    public static void main(String[] args) {
        System.out.println("Program Running ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st  value : ");
        int  value = sc.nextInt();
        System.out.println("Enter 2st  value : ");
        int  value2 = sc.nextInt();
        try{
            int x = value/value2;  // Exception
            int y = value/value2*value;
        }
        catch (ArithmeticException ae) {
            System.out.println(value+"/"+value2+" Not Possible");
        }
        catch (Exception ee){
            System.out.println("After Exception");
        }
        System.out.println("Program Done");
    }
}
