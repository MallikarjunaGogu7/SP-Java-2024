public class SumRowCol
{
    public static void main(String[] args) {
        int rows, cols, sumRow, sumCol;

        int a[][] = { {1, 2, 3}, {2, 2, 2}, {3, 3, 3}};
        
        rows = a.length;
        cols = a[0].length;

        // Calculating the Sum of rows
        for (int i=0; i<rows; i++)
        {
            sumRow = 0;
            for (int j=0; j<cols; j++)
            {
                sumRow += a[i][j];
            }
            System.out.println("Sum of "+(i+1)+"row is: "+sumRow);
        }
        for (int i=0; i<cols; i++)
        {
            sumCol = 0;
            for( int j=0; j<rows; j++)
            {
                sumCol += a[j][i];
            }
            System.out.println("Sum of "+(i+1)+"col is: "+sumCol);
        }
    }
}