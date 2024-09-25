//write a java program print the elements of an array present on odd position

public class PrintOddNum
{
    public static void main(String[] args) {
        int a[] = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println("The Odd Numbers are..");
        for (int i = 0; i< a.length; i++)
            if(a[i]%2 != 0)
                System.out.print(a[i]+" ");
    }
}