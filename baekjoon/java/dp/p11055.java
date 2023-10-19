import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Main {
    static int dp[] = new int[1000];
    static int nums[] = new int[1000];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max_dp = 0;
        String datas[] = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            int data = Integer.parseInt(datas[i]);
            nums[i] = data;
            dp[i] = data;
            int max_before_dp = 0;
            for(int j=i-1;j>=0;j--) if (nums[j]<data && dp[j]>max_before_dp ) max_before_dp = dp[j];
            dp[i] += max_before_dp;
            if (dp[i]>max_dp) max_dp = dp[i];
        }
        System.out.print(max_dp);
    }
}