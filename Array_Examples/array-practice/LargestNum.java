public class LargestNum
{
    public static void main(String[] args) {
        int arr[] = {3, 7, 10, 77, 9};
        int max = arr[0];
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("The Largest Element that Present in Array is: "+max);
    }
}