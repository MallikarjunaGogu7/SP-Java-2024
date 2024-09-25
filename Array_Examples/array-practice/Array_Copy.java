import java.util.Scanner;

public class Array_Copy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  the array limit: ");
        int l = input.nextInt();
        int [] a = new int[l];
        int [] c = new int[l];

        for(int i=0; i<l; i++)
        {
            System.out.printf("Element of a[%d] :",i);
            a[i] = input.nextInt();
        }
        for(int i=0; i<l;i++)
        {
            c[i] = a[i];
        }

        System.out.println("original Array Elements..");
        for(int i=0; i<l; i++)
        {
            System.out.printf("\na[%d] = %d",i,a[i]);
        }
        System.out.print("\n\nCopy Array Elements one to another array ..");
        for(int i=0;i<l; i++)
        {
            System.out.printf("\nc[%d] = %d",i,c[i]);
        }
    }
}
