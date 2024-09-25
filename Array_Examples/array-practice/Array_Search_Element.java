import java.util.Scanner;

public class Array_Search_Element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the limit of array : ");
        int l = input.nextInt();
        int a [] = new int[l];
        for(int i=0;i<l;i++)
        {
            System.out.printf("Element of a[%d] :",i);
            a[i] = input.nextInt();
        }
        System.out.println("Enter the Search Array Element :");
        int s = input.nextInt();
        int i,f=0;
        for( i=0; i<l; i++)
        {
            if(a[i]==s)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.printf("The Element is Found in the Position : %d", i+1);
            System.out.printf("\nThe Element is found in the Index : %d", i);
        }
        else{
            System.out.println("The Element Is Not Found");
        }

    }
}
