import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        Long dp[] = new Long[1000000];
        dp[0] = 1L;
        dp[1] = 2L;
        dp[2] = 4L;
        int max_dp = 3;
        for(int i=0;i<n;i++){
            int m = Integer.parseInt(br.readLine());
            for(int j=max_dp;j<m;j++) dp[j] = (dp[j-1]+dp[j-2]+dp[j-3])%1000000009L;
            if(max_dp<m)max_dp = m;
            System.out.println(dp[m-1]);
        }
    }
}