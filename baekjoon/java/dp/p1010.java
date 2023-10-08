import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());
        for(int k=0;k<times;k++){
            String bridge_nums = br.readLine();
            String bridge_nums_split[] = bridge_nums.split(" ");
            int left_side = Integer.parseInt(bridge_nums_split[0]);
            int right_side = Integer.parseInt(bridge_nums_split[1]);
            int dp_len = right_side-(left_side-1);
            int dp[] = new int[dp_len];
            for(int i=0;i<dp_len;i++)dp[i]=1;
            for(int i=0;i<left_side;i++)for(int j=1;j<dp_len;j++)dp[j] = dp[j]+dp[j-1];
            System.out.println(dp[dp_len-1]);
        }
    }
}