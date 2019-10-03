package com.company;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @org.junit.jupiter.api.Test
    public void twoSum() throws Exception {
        int[] test1 = {2, 7, 11, 15};
        int target1 = 18;
        int[] solution1 = {1, 2};

        int[] test2 = {2, 7};
        int target2 = 9;
        int[] solution2 = {0, 1};

        int[] test3 = {2, 3, 2};
        int target3 = 4;
        int[] solution3 = {0, 2};

        int[] result1 = TwoSum.twoSum(test1, target1);
        assertArrayEquals(solution1, result1);

        int[] result2 = TwoSum.twoSum(test2, target2);
        assertArrayEquals(solution2, result2);

        int[] result3 = TwoSum.twoSum(test3, target3);
        assertArrayEquals(solution3, result3);
    }
}