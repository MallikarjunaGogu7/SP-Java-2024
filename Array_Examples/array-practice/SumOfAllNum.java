
import java.util.Scanner;
public class SumOfAllNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Array Limit: ");
        int l = input.nextInt();
        int a[] = new int[l];
        int sum = 0;
        for( int i=0; i<l; i++)
        {
            System.out.printf("Elements of a[%d] : ",i);
            a[i] = input.nextInt();
        }
        for (int s: a)
        {
            sum += s;
        }
        System.out.println("The Sum of All Array Elements are: "+sum);
    }
}
