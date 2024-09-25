
import java.util.Scanner;

//Write a program to Array Elements to Print all Positive Numbers
public class ArrayNum_Positive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Array Limit: ");
        int l = input.nextInt();
        int a [] = new int[l];
        for (int i=0; i<l; i++)
        {
            System.out.printf("Elements of a[%d]: ",i);
            a[i] = input.nextInt();
        }
        for (int p:a)
        {
            if(p>0)
                System.out.println(p);
        }
    }
}
