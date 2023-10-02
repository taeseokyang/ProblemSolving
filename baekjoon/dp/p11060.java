import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());
        int nums[] = new int[times];
        int dp[] = new int[times];
        String line = br.readLine();
        String chars[] = line.split(" ");
        for(int k=0;k<times;k++) {
            nums[k] = Integer.parseInt(chars[k]);
            dp[k] = 1001;
        }
        if (nums[0] != 0) dp[0] = 1;
        for ( int k = 0 ; k < times-1 ; k++ )
            if (dp[k] != 1001)
                for ( int r = 1 ; r <= nums[k] ; r++ )
                    if (k+r<times) dp[k+r] = Math.min( dp[k+r] , dp[k]+1 );
        if (dp[times-1] == 1001) dp[times-1] = 0;
        if (times == 1) dp[times-1] = 1;
        System.out.print(dp[times-1]-1);
    }
}