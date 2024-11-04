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
