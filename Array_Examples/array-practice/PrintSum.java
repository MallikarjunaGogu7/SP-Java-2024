
//write a java program print the sum of all the items of the array
public class PrintSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum +arr[i];
        }
        System.out.println("the sum is: "+sum);
    }
}
