import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int tokens[] = new int[v+1];
        int max_token = 0;
        int before_token = 1;
        int result = 1;
        for(int i=0;i<=v;i++){
            int t;
            if (i==v) t = n+1;
            else t = Integer.parseInt(br.readLine());
            int token = t-before_token;
            if (token == 0) token = 1;
            tokens[i] = token;
            if (token>max_token) max_token = token;
            before_token = t+1;
        }
        int dp[] = new int[max_token];
        if (max_token>=1) dp[0] = 1;
        if (max_token>=2) dp[1] = 2;
        for(int i=2;i<max_token;i++) dp[i] = dp[i-1]+dp[i-2];
        for(int i=0;i<=v;i++) result*=dp[tokens[i]-1];
        System.out.print(result);
    }
}