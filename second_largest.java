public class Solution {
    public int secondLargestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
            } 
            else if (nums[i] > second && nums[i] != max) {
                second = nums[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            return -1;
        }

        return second;
    }
} 