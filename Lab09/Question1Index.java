package Lab09;

public class Question1Index {
    public static void main(String[] args) {
        try
        {
            int arr[] = new int[6];
            arr[8] = 7; // Exception occurred.
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Accessing array element outside of specified limit");
        }
    }
}
