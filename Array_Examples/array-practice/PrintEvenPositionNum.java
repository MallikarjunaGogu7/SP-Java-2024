
//write a java program print the elements of an array present on even position
public class PrintEvenPositionNum
{
    public static void main(String[] args) {
        
        int arr[] = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("\nElements of given array present on even position: \n");
		// Loop through the array by incrementing value of i by 2
		// Here, i will start from 1 as first even positioned element is present at
		// position 1.

        for (int i = 1; i<arr.length; i=i+2)
        {
            System.out.print(arr[i] + " ");
        }
    }
}