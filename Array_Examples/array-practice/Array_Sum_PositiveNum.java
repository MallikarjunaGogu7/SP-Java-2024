
import java.util.Scanner;

public class Array_Sum_PositiveNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Array Limit: ");
        int l = input.nextInt();
        int a [] = new int[l];
        int sum = 0;
        for (int i = 0; i<l; i++)
        {
            System.out.printf("Elements of a[%d]: ",i);
            a[i] = input.nextInt();
        }

        for (int p:a)
        {
            if(p>0)
                sum = sum + p;
        }
        System.out.println("The Sum of Array Positive Elements is: "+sum);
    }
    
}
