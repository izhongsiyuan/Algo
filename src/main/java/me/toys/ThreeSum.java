package me.toys;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1. sort the array, then loop the array, when we get the value of current element, we can calculate the target sum that
// we need to find from the rest of elements, so the problem can be simplified to two sum
// 2. for the two sum question, we can set two pointers, one is at the start of the array and the other is at the end of
// the array, then we check the sum of pointed elements, 2.1 -> if sum is smaller than target, than move the front
// pointer to the next element; 2.2 -> if the sum is larger than the target, than move the behind pointer to the
// previous element
// 3. end loop until the two pointer meets, and record all the results
// 4. deduplication: 4.1-> Loop the array to get the target, the element of looped is the min value of 3 numbers, so
// when meet positive number, break, the largest index we need to loop is len(nums)-3; 4.2-> when moving the pointers,
// if meet the same number, skip that number until find a different number
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> outputs = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i>0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int smallIndex = i + 1;
            int largeIndex = nums.length - 1;
            if (i == nums.length - 1) {
                largeIndex = nums.length - 2;
            }
            int target = 0 - nums[i];
            while (smallIndex < largeIndex) {
                if (nums[smallIndex] + nums[largeIndex] < target) {
                    smallIndex += 1;
                    while(smallIndex < largeIndex && nums[smallIndex] == nums[smallIndex - 1]) {
                        smallIndex += 1;
                    }

                } else if (nums[smallIndex] + nums[largeIndex] > target) {
                    largeIndex -= 1;
                    while(largeIndex > smallIndex && nums[largeIndex] == nums[largeIndex + 1]) {
                        largeIndex -= 1;
                    }
                } else {
                    outputs.add(Arrays.asList(nums[smallIndex], nums[largeIndex], nums[i]));
                    smallIndex += 1;
                    largeIndex -= 1;
                    while(smallIndex < largeIndex && nums[smallIndex] == nums[smallIndex - 1]) {
                        smallIndex += 1;
                    }
                    while(largeIndex > smallIndex && nums[largeIndex] == nums[largeIndex + 1]) {
                        largeIndex -= 1;
                    }
                }
            }
        }
        return outputs;
    }
}
