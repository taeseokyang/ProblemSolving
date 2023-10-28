import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int nums[] = new int[n];
        int dp[] = new int[n];
        int max = 1;
        String line = br.readLine();
        String chars[] = line.split(" ");
        for(int i=0;i<n;i++) nums[i] = Integer.parseInt(chars[i]);
        dp[0] = 1;
        for(int i=1;i<n;i++) {
            if (nums[i]>=nums[i-1]) dp[i] = dp[i-1] + 1;
            else dp[i] = 1;
            if (dp[i]>max) max = dp[i];
        }
        dp[n-1] = 1;
        for(int i=n-2;i>-1;i--) {
            if (nums[i]>=nums[i+1]) dp[i] = dp[i+1] +  1;
            else dp[i] = 1;
            if (dp[i]>max) max = dp[i];
        }
        System.out.print(max);
    }
}