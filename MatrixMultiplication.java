public class MatrixMultiplication {

        public static void main(String[] args) {
            // Example Matrices
            int[][] A = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            int[][] B = {
                    {7, 8},
                    {9, 10},
                    {11, 12}
            };

            int rowsA = A.length;
            int colsA = A[0].length;
            int rowsB = B.length;
            int colsB = B[0].length;

            // Check if multiplication is possible
            if (colsA != rowsB) {
                System.out.println("Matrix multiplication not possible (columns of A != rows of B).");
                return;
            }

            // Result matrix
            int[][] C = new int[rowsA][colsB];

            // Multiply matrices
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // Display the result
            System.out.println("Resultant Matrix:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
}

