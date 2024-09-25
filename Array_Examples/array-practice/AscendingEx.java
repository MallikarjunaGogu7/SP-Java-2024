
// Write a java Program to sort the elements of an array in ascending order
public class AscendingEx {
    public static void main(String[] args) {
        
        // Initialize array
        int[] arr = new int[] { 1, 33, 5, 77, 9, 2, 1};
        int temp ;

        //Displaying elements of Oringinal Array
        System.out.println("Elements of Original Array: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }

        // Sort the array in ascending order
        for (int i = 0;i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        // Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}
