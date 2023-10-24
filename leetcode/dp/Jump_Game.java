class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        boolean dp[] = new boolean[len];
        dp[0] = true;
        for(int i=0;i<len-1;i++)
            if (dp[i] == true)
                for(int j=i+1;j<Math.min(i+nums[i]+1,len);j++)
                    if(dp[j]==false) dp[j] = true;
        return dp[len-1];
    }
}