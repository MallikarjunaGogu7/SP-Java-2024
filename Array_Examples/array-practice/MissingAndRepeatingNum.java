
import java.util.Arrays;

public class MissingAndRepeatingNum
{

    void findElement( int a[], int s)
    {
        // finding the Sum of  n natural numbers   (n*(n+1)) / 2
        long nsum = (s * ( s+1 )) / 2;

        // finding the Sum of Squares of n natural numbers  (n*(n+1)*(2*n+1)) / 6
        long nsqrsum = (nsum * (2 * s + 1)) / 3;

        long sqrsum = 0, sum = 0;

        for ( int i = 0; i < s;i++)
        {
            // sum of all elements in the array
            sum = sum + a[i];

            // sum squares of all elements in the array
            sqrsum = sqrsum +((long) a[i] * a[i]);
        }
        
        // finding a1^2 - a2^2
        long sqrdiff = sqrsum - nsqrsum;

        // finding a1 - a2
        long diff = sum - nsum;

        // finding a1 +a2  using mathematical identity
        // a1^2 - a2^2 = (a1+a2)(a1-a2)
        sum = sqrdiff / diff;

        //finding a1 using a1 + a2 and a1 - a2
        long a1 = (sum + diff) / 2;

        // finding a2
        long a2 = sum - a1;

        System.out.println("For array: "+Arrays.toString(a) + "\n");
        System.out.println("a1 is: " + a1);
        System.out.println("a2 is: " + a2);

        return;

    }
    public static void main(String[] args) {
        // creating an object of the class MissingAndRepeatingNum
        MissingAndRepeatingNum obj = new MissingAndRepeatingNum();
        int arr[] =  {1, 3, 4, 1, 5};
        int size = arr.length;

        obj.findElement(arr, size);

        int arr1[] = {4, 3, 2, 4, 1};
        size = arr1.length;

        System.out.println();
        obj.findElement(arr1, size);
    }
}