
import java.util.Scanner;

// Write a Program to Calculate Average of Array Elements

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Arrray Limit: ");
        int l = input.nextInt();
        int a [] = new int[l];
        int sum = 0;
        for (int i = 0; i < l; i++)
        {
            System.out.printf("\nElements of a[%d]: ",i);
            a[i] =input.nextInt();
        }

        for( int i = 0; i < l; i++)
        {
            sum = sum + a[i];
        }
        double avg  = sum  / l;
        System.out.println("The sum of the Array elements is: "+sum);
        System.out.println("The Average of the Array Elements is :"+avg);

    }
}
