class Solution {
    public int largestElement(int[] nums) {
    int n = nums.length;
    int max = 0;
    for(int i = 0; i < n-1; i++){
        max = Math.max(nums[i],nums[i+1]);
    }
    return max;
    }
}