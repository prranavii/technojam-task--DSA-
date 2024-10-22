public class Q2 {
    public static int climbStairs(int n) {
        // Base cases
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        // Variables to store the number of ways to reach the (n-1) and (n-2) steps
        int oneStepBefore = 2;
        int twoStepsBefore = 1;
        int allWays = 0;

        // Calculate the number of ways for each step from 3 to n
        for (int i = 3; i <= n; i++) {
            allWays = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = allWays;
        }

        return allWays;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(climbStairs(n));  // Output: 2
    }
}



//Time complexity = (O)n
