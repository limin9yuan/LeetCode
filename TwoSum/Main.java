package LeetCode.TwoSum;
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

import java.util.HashMap;
import java.util.Map;

public class Main {


    public int[] twoSum(int[] nums, int target){

        if (nums == null || nums.length < 2)
            return new int[]{0,0};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{0, 0};

    }


    public static void main(String[] args) {
	    int[] array = {2, 7, 11, 15};
        int target = 22;
        Main main = new Main();
        int[] result = main.twoSum(array, target);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
