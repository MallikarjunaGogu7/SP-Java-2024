
import java.util.Arrays;
import java.util.Collections;

public class Descending{
    public static void main(String[] args) {
        
        Integer arr[] = {1, 4, 66, 88, 99};
        System.out.println("Original array is: "+Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending sorted Array is: "+ Arrays.toString(arr));
    }
}