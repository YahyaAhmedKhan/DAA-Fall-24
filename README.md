# DAA-Fall-24

## Homework 1

Please use the following template to implement your solutions. You can add more methods if needed. 

Three test cases with the expected answers are provided for each question. Three more testcase will be used for grading. The answers for the test cases are not provided. 

## Java Template

```java
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

        int[] answers2 = { 4, 3, 1 };

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
```

## Python Template

```python
class Solutions:

    @staticmethod
    def count_inversions(arr):
        return 0

    @staticmethod
    def find_first_one(arr):
        return 0

    @staticmethod
    def random_vs_linear_search(arr, target):
        return ""

    @staticmethod
    def min_additions_for_beautiful_sequence(seq):
        return 0


if __name__ == "__main__":

    # Question 1
    testcase1 = [
        [5, 2, 6, 1],
        [4, 7, 3, 5, 1],
        [6, 5, 4, 3, 2, 1]
    ]

    answers1 = [4, 7, 15]

    for i in range(3):
        ans = Solutions.count_inversions(testcase1[i])
        if ans == answers1[i]:
            print(f"Test case {i} passed!")
        else:
            print(f"Test case {i} failed!")

    # Question 2
    testcase2 = [
        [0, 0, 0, 0, 1, 1, 1],
        [0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1],
        [0, 1]
    ]

    answers2 = [4, 3, 1]

    for i in range(3):
        ans = Solutions.find_first_one(testcase2[i])
        if ans == answers2[i]:
            print(f"Test case {i} passed!")
        else:
            print(f"Test case {i} failed!")

    # Question 4
    testcase4 = [
        [1, 2, 3, 1],
        [1, 2, 3, 3, 2, 1],
        [2, 4, 3, 2, 4, 3]
    ]

    answers4 = [1, 0, 3]

    for i in range(3):
        ans = Solutions.min_additions_for_beautiful_sequence(testcase4[i])
        if ans == answers4[i]:
            print(f"Test case {i} passed!")
        else:
            print(f"Test case {i} failed!")

    # Grading Test Cases
    GradingTestCases1 = [
        [5, 2, 6, 1, 2, 1, 4, 5, 2, 5, 6, 7, 3, 2, 5],
        [4, 6, 2, 7, 9, 4, 3, 5, 1, 5, 7, 2, 5],
        [6, 5, 4, 3, 2, 1, 1, 4, 4, 5, 2, 4, 5, 1, 1, 8, 9, 3, 3]
    ]

    GradingTestCases2 = [
        [0, 1, 1, 1],
        [0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1],
        [0] * 39 + [1] * 10
    ]

    GradingTestCases4 = [
        [1, 2, 2, 3, 5, 6, 4, 1, 4, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1],
        [1, 2, 2, 3, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 3, 2, 1, 3, 6, 1, 7, 9, 0, 1, 4],
        [4, 2, 4, 5, 2, 4, 5, 6, 2, 5, 2, 6, 8, 2, 4, 6, 2, 5, 4, 4]
    ]

    for i in range(3):
        ans = Solutions.count_inversions(GradingTestCases1[i])
        print(f"Grading Test case {i} : {ans}")
    for i in range(3):
        ans = Solutions.find_first_one(GradingTestCases2[i])
        print(f"Grading Test case {i} : {ans}")
    for i in range(3):
        ans = Solutions.min_additions_for_beautiful_sequence(GradingTestCases4[i])
        print(f"Grading Test case {i} : {ans}")
```

## C++ Template

```cpp
#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solutions
{
public:
    static int countInversions(vector<int> &arr)
    {
        return 0;
    }

    static int findFirstOne(vector<int> &arr)
    {
        return 0;
    }

    static string randomVsLinearSearch(vector<int> &arr, int target)
    {
        return "";
    }

    static int minAdditionsForBeautifulSequence(vector<int> &seq)
    {
        return 0;
    }
};

int main()
{
    // Question 1
    vector<vector<int>> testcase1 = {
        {5, 2, 6, 1},
        {4, 7, 3, 5, 1},
        {6, 5, 4, 3, 2, 1}};

    vector<int> answers1 = {4, 7, 15};

    for (int i = 0; i < 3; i++)
    {
        int ans = Solutions::countInversions(testcase1[i]);
        if (ans == answers1[i])
        {
            cout << "Test case " << i << " passed!" << endl;
        }
        else
        {
            cout << "Test case " << i << " failed!" << endl;
        }
    }

    // Question 2
    vector<vector<int>> testcase2 = {
        {0, 0, 0, 0, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 1}};

    vector<int> answers2 = {4, 3, 1};

    for (int i = 0; i < 3; i++)
    {
        int ans = Solutions::findFirstOne(testcase2[i]);
        if (ans == answers2[i])
        {
            cout << "Test case " << i << " passed!" << endl;
        }
        else
        {
            cout << "Test case " << i << " failed!" << endl;
        }
    }

    // Question 4
    vector<vector<int>> testcase4 = {
        {1, 2, 3, 1},
        {1, 2, 3, 3, 2, 1},
        {2, 4, 3, 2, 4, 3}};

    vector<int> answers4 = {1, 0, 3};

    for (int i = 0; i < 3; i++)
    {
        int ans = Solutions::minAdditionsForBeautifulSequence(testcase4[i]);
        if (ans == answers4[i])
        {
            cout << "Test case " << i << " passed!" << endl;
        }
        else
        {
            cout << "Test case " << i << " failed!" << endl;
        }
    }

    // Grading Test Cases

    vector<vector<int>> GradingTestCases1 = {
        {5, 2, 6, 1, 2, 1, 4, 5, 2, 5, 6, 7, 3, 2, 5},
        {4, 6, 2, 7, 9, 4, 3, 5, 1, 5, 7, 2, 5},
        {6, 5, 4, 3, 2, 1, 1, 4, 4, 5, 2, 4, 5, 1, 1, 8, 9, 3, 3}};

    vector<vector<int>> GradingTestCases2 = {
        {0, 1, 1, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

    vector<vector<int>> GradingTestCases4 = {
        {1, 2, 2, 3, 5, 6, 4, 1, 4, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1},
        {1, 2, 2, 3, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 3, 2, 1, 3, 6, 1, 7, 9, 0, 1, 4},
        {4, 2, 4, 5, 2, 4, 5, 6, 2, 5, 2, 6, 8, 2, 4, 6, 2, 5, 4, 4}};

    for (int i = 0; i < 3; i++)
    {
        int ans = Solutions::countInversions(GradingTestCases1[i]);
        cout << "Grading Test case " << i << " : " << ans << endl;
    }
    for (int i = 0; i < 3; i++)
    {
        int ans = Solutions::findFirstOne(GradingTestCases2[i]);
        cout << "Grading Test case " << i << " : " << ans << endl;
    }
    for (int i = 0; i < 3; i++)
    {
        int ans = Solutions::minAdditionsForBeautifulSequence(GradingTestCases4[i]);
        cout << "Grading Test case " << i << " : " << ans << endl;
    }

    return 0;
}
```