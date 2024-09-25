public class AddMatrixEx {
    
    // write a java program add two matrices
    public static void main(String[] args) {
        //creating two matrices
        int x[][] = { {1, 1, 1 }, {2, 2, 2 }, {3, 3, 3 } };
        int y[][] = { {1, 1, 1 }, {2, 2, 2 }, {3, 3, 3 } };

        //creating another matrix to store the sum of two matrices
        int z[][] = new int[3][3];  // 3 rows and 3 cols

        // adding and printing addition of 2 matrices
        for (int i=0; i<3;i++)
        {
            for (int j=0; j<3; j++)
            {
                z[i][j] = x[i][j] + y[i][j]; // use - for substraction
                System.out.println(z[i][j]+" ");
            }
            System.out.println(); // new line
        }
    }
}
