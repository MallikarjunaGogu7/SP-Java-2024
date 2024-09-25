
import java.util.Arrays;


// Write a program to Sort Numeric array in Ascending order
public class Ascending {
    public static void main(String[] args) {
        int arr [] =  { 3, 1, 5, 2, 7, 9};
        System.out.println("Original Array is: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array is: "+Arrays.toString(arr));
    }
}
