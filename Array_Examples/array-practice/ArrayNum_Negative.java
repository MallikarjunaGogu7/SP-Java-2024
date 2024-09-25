
import java.util.Scanner;
//Write a program to array elements print all Negative number
public class ArrayNum_Negative {
    public static void main(String[] args) {
        Scanner input  = new Scanner (System.in);
        System.out.println("Enter the Array Limit: ");
        int l = input.nextInt();
        int a [] = new int[l];
        for (int i=0; i<l;i++)
        {
            System.out.printf("Elements of a[%d]: ",i);
            a[i] = input.nextInt();
        }
        System.out.println("\n Negative Array Elements..\n");
        for(int n:a)
        {
            if(n<0)
                System.out.println(n);
        }
        // // for (int i = 0;i<a.length;i++){
        // for(int i = 0; i < l;i++){
        //     if(a[i]<0)
        //         System.out.println(a[i]);
        // }
    }
}
