public class Q3 {
    public static int rangeBitwiseAnd(int left, int right) {
        int shiftCount = 0;

        // Shift both left and right until they are equal
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shiftCount++;
        }

        // Shift the common prefix back to its original place
        return left << shiftCount;
    }

    public static void main(String[] args) {
        // Default Test Cases
        int[][] testCases = {
            {5, 7},          // Output: 4
            {0, 0},          // Output: 0
            {1, 2147483647}  // Output: 0
        };

        // Run Test Cases
        for (int[] testCase : testCases) {
            System.out.println(rangeBitwiseAnd(testCase[0], testCase[1]));
        }
    }
}
