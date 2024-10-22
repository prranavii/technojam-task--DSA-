public class Q1 {
    public static void generatePascalTriangle(int n) {
        // Create a 2D array to store values of Pascal's Triangle
        int[][] pascal = new int[n][n];

        // Iterate through the rows
        for (int i = 0; i < n; i++) {
            // Each row starts with a 1
            pascal[i][0] = 1;

            // Print the first element of each row
            System.out.print(pascal[i][0] + " ");

            // Fill in the values for the rest of the row (except the first element)
            for (int j = 1; j <= i; j++) {
                // First and last element in each row are 1
                if (j == i) {
                    pascal[i][j] = 1;
                } else {
                    // Value is sum of two values directly above it
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }

                // Print the current value
                System.out.print(pascal[i][j] + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generatePascalTriangle(n);
    }
}