class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int dp[] = new int[nums.length];
        int max = nums[0];
        dp[0] = nums[0];
        for(int i = 1;i<len;i++){
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
            if (max<dp[i])max = dp[i];
        }
        return max;
    }
}