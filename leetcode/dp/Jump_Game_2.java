class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int dp[] = new int[len];
        for(int i=0;i<len-1;i++)
            for(int j=i+1;j<Math.min(i+nums[i]+1,len);j++)
                if(dp[j]==0) dp[j] = dp[i] + 1;
        return dp[len-1];
    }
}