
import java.util.Scanner;

public class Array_Sum_Cubic {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array limit : ");
        int l = input.nextInt();
        int a [] = new int[l];
        int sum = 0;
        for (int i =0;i<l; i++)
        {
            System.out.printf("Elements of a[%d] : ",i);
            a[i] = input.nextInt();
        }
        for (int c:a)
        {
            sum = sum + (c*c*c);
        }
        System.out.println("Sum of the Cubic array Elements is : "+sum);
    }
}
