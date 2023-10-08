import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());
        int nums[] = new int[times];
        int dp[] = new int[times];
        for(int k=0;k<times;k++)nums[k] = Integer.parseInt(br.readLine());
        if ( times >= 1 ) dp[0] = nums[0];
        if ( times >= 2 ) dp[1] = nums[0] + nums[1];
        if ( times >= 3 ) dp[2] = Math.max(dp[1],Math.max(nums[0] , nums[1]) + nums[2]);
        for ( int k = 3 ; k < times ; k++ ) dp[k] = Math.max( dp[k-1] , Math.max( nums[k-1] + dp[k-3] , dp[k-2] ) + nums[k] );
        System.out.print(dp[times-1]);
    }
}