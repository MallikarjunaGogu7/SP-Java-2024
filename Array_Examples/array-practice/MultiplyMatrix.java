
//Write a java program to print multiple of two matrices
public class MultiplyMatrix
{
    public static void main(String[] args) {
        //creating two matrices
        int a[][] = { {2, 2, 2}, {3, 3, 3}, {1, 1, 1}};

        int b[][] = { {1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        // create a another one matrices to store the multiple of  matrix a and matrix b
        int c[][] = new int[3][3];
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                c[i][j] = 0;
                for (int k=0; k<3; k++)
                {
                    c[i][j] += a[i][k] * b[k][j];
                } // end of k loop
                System.out.print(c[i][j] + "  "); // printing matrix element
            } // end of j loop
            System.out.println(); // new line
        }
    }
}