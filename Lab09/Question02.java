package Lab09;
import java.util.Scanner;
public class Question02{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value 1 : ");
        int a=sc.nextInt();
        System.out.print("Enter the value 2 : ");
        try {
            int b=sc.nextInt();
        }
        catch (Exception e){
            System.out.println("Invalid number");
        }

        finally {
            System.out.println("Finally block here");
        }


    }
}
