package Arrays;

import java.util.HashMap;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> neededIndex = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            if(neededIndex.get(nums[i]) != null)
            {
                result[0] = neededIndex.get(nums[i]);
                result[1] = i;
                break;
            }
            else
            {
                int needed = target - nums[i];
                neededIndex.put(needed, i);
            }
        }
        return result;

    }
    
    public static void main(String[] args) {
        int[] nums = {2,11,7,15};
        int[] result = twoSum(nums,9);
        System.out.println(result[0]+"   "  + result[1]);
    }
}
