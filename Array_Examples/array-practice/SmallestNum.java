
// Print the Smallest value in the array
public class SmallestNum {
    public static void main(String[] args) {
        int arr[] = {4,8,16,32,2};
        int min = arr[0];
        for (int i=0;i<arr.length; i++)
        {
            if (arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("Small num is: "+ min);
    }
}
