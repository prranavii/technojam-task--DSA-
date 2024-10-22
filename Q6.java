public class Q6 {
    public static long number_spiral(long y, long x) {
        // Case 1: y >= x (along vertical parts of the spiral)
        if (y >= x) {
            if (y % 2 == 1) {  // Odd row number, spirals downwards
                return y * y - (x - 1);
            } else {           // Even row number, spirals upwards
                return (y - 1) * (y - 1) + x;
            }
        }
        // Case 2: x > y (along horizontal parts of the spiral)
        else {
            if (x % 2 == 1) {  // Odd column number, spirals leftward
                return (x - 1) * (x - 1) + y;
            } else {           // Even column number, spirals rightward
                return x * x - (y - 1);
            }
        }
    }

    public static void main(String[] args) {
        // Default Test Cases
        long[][] test_cases = {
            {2, 3},  // Output: 8
            {1, 1},  // Output: 1
            {4, 2}   // Output: 15
        };

        // Run Test Cases
        for (long[] test_case : test_cases) {
            System.out.println(number_spiral(test_case[0], test_case[1]));
        }
    }
}



//Time Complexity:
//The time complexity is O(1) for each test case since the solution involves direct mathematical calculations.
//Space Complexity:
//The space complexity is O(1), using only a few variables to store intermediate values.