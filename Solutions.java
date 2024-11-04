public class Solutions {

    public static int countInversions(int[] arr) {

        return 0;
    }

    public static int findFirstOne(int[] arr) {
        return 0;

    }

    public static String randomVsLinearSearch(int[] arr, int target) {
        return "";

    }

    public static int minAdditionsForBeautifulSequence(int[] seq) {
        return 0;

    }

    public static void main(String[] args) {

        // Question 1
        int[][] testcase1 = {
                { 5, 2, 6, 1 },
                { 4, 7, 3, 5, 1 },
                { 6, 5, 4, 3, 2, 1 }
        };

        int[] answers1 = { 4, 7, 15 };

        for (int i = 0; i < 3; i++) {
            int ans = countInversions(testcase1[i]);
            if (ans == answers1[i]) {
                System.out.println("Test case " + i + " passed!");
            } else {
                System.out.println("Test case " + i + " failed!");
            }
        }

        // Question 2
        int[][] testcase2 = {
                { 0, 0, 0, 0, 1, 1, 1 },
                { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 0, 1 }
        };

        int[] answers2 = { 5, 4, 1 };

        for (int i = 0; i < 3; i++) {
            int ans = findFirstOne(testcase2[i]);
            if (ans == answers2[i]) {
                System.out.println("Test case " + i + " passed!");
            } else {
                System.out.println("Test case " + i + " failed!");
            }
        }

        // Question 4
        int[][] testcase4 = {
                { 1, 2, 3, 1 },
                { 1, 2, 3, 3, 2, 1 },
                { 2, 4, 3, 2, 4, 3 }
        };

        int[] answers4 = { 1, 0, 3 };

        for (int i = 0; i < 3; i++) {
            int ans = minAdditionsForBeautifulSequence(testcase4[i]);
            if (ans == answers4[i]) {
                System.out.println("Test case " + i + " passed!");
            } else {
                System.out.println("Test case " + i + " failed!");
            }
        }

        // Grading Test Cases

        int[][] GradingTestCases1 = {
                { 5, 2, 6, 1, 2, 1, 4, 5, 2, 5, 6, 7, 3, 2, 5 },
                { 4, 6, 2, 7, 9, 4, 3, 5, 1, 5, 7, 2, 5 },
                { 6, 5, 4, 3, 2, 1, 1, 4, 4, 5, 2, 4, 5, 1, 1, 8, 9, 3, 3 }
        };

        int[][] GradingTestCases2 = {
                { 0, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
        };

        int[][] GradingTestCases4 = {
                { 1, 2, 2, 3, 5, 6, 4, 1, 4, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1 },
                { 1, 2, 2, 3, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 3, 2, 1, 3, 6, 1, 7, 9, 0, 1, 4 },
                { 4, 2, 4, 5, 2, 4, 5, 6, 2, 5, 2, 6, 8, 2, 4, 6, 2, 5, 4, 4 }
        };

        for (int i = 0; i < 3; i++) {
            int ans = countInversions(GradingTestCases1[i]);
            System.out.println("Grading Test case " + i + " : " + ans);
        }
        for (int i = 0; i < 3; i++) {
            int ans = findFirstOne(GradingTestCases2[i]);
            System.out.println("Grading Test case " + i + " : " + ans);
        }
        for (int i = 0; i < 3; i++) {
            int ans = minAdditionsForBeautifulSequence(GradingTestCases4[i]);
            System.out.println("Grading Test case " + i + " : " + ans);
        }
    }
}