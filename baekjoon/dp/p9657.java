import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dp[] = new int[n];
        if (n>=1) dp[0] = 1;
        if (n>=2) dp[1] = 0;
        if (n>=3) dp[2] = 1;
        if (n>=4) dp[3] = 1;
        for(int i=4;i<n;i++)
            if(dp[i-1]==0 || dp[i-3]==0 || dp[i-4] == 0) dp[i] = 1;
            else dp[i] = 0;
        if (dp[n-1]==1) System.out.print("SK");
        else System.out.print("CY");
    }
}