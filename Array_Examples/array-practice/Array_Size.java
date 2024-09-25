
import java.util.Scanner;

public class Array_Size {
    //Write a program in to array size to be user input print it
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int l = input.nextInt();
    int [] a = new int[l];
    for(int i=0; i<l; i++)
    {
        System.out.printf("Elements of a[%d] :",i);
        a[i] = input.nextInt();
    }
    System.out.println("\nDisplay the Array Elements...\n");
    for(int e:a)
    {
        System.out.print(e+" ");
    }
    }
}
