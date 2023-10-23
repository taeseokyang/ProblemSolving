class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int dp[] = new int[len];
        int max = 0;
        int max_idx = 0;
        for (int i =0 ; i<len ; i++){
            if(height[i]>max){
                max = height[i];
                max_idx = i;
            }
        }
        // left side max check
        int before_max = 0;
        for (int i =0 ; i<=max_idx ; i++){
            if (before_max<height[i]) before_max = height[i];
            dp[i] =  before_max;
        }
        // right side max check
        before_max = 0;
        for ( int i =len-1 ; i>max_idx ; i-- ){
            if (before_max<height[i]) before_max = height[i];
            dp[i] =  before_max;
        }
        int sum = 0;
        for ( int i = 0 ; i<len ; i++ ) sum += dp[i] - height[i];
        return sum;
    }
}