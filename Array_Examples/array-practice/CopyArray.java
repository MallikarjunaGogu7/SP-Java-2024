public class CopyArray {
    // Write a Program to Copy all the Elements in one array to another array
    public static void main(String[] args) {
        
        int a[] = new int[] {11, 22, 33, 44, 55};

        int c[] = new int[a.length];

        for (int i = 0; i < a.length; i++)
        {
            c[i] = a[i];

        }

        System.out.println("The Original Array Elements is... ");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\n\nThe Copied Array Elements is...");
        // for (int i = 0; i < a.length; i++)
        // {
        //     System.out.print(c[i]+" ");
        // }
        for (int cp:c)
        {
            System.out.print(cp+" ");
        }
    }
}
