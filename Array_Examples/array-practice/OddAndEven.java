
//write a java program print Odd and Even Numbers from an Array
public class OddAndEven
{
    public static void main(String[] args) {
        int a[] = {1,13,3,4,5,6,7,8,9};
        // printing the Odd numbers
        System.out.println("\nThe Odd Numbers in Given Array are...");
        for (int i = 0; i < a.length; i++)
            if (a[i] %2!=0)
                System.out.print(a[i] + " ");

        // Printing the Even numbers
        System.out.println("\nThe Even Numbers in Given Array are...");
        for (int i = 0; i < a.length; i++)
            if (a[i]%2==0)
                System.out.print(a[i] + " ");
    }
}