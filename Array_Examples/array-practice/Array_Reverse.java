
import java.util.Scanner;

public class Array_Reverse {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array lImit : ");
        int l = input.nextInt();
        int a [] = new int[l];
        for(int i=0;i<l; i++)
        {
            System.out.printf("Element of a[%d] :",i);
            a[i] = input.nextInt();
        }
        System.out.println("\nDisplay Reverse Ordr in Array Elements...\n");
        for(int i=l-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
