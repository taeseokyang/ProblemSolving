import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String datas[] = br.readLine().split(" ");
        int x = Integer.parseInt(datas[1]);
        int height[] = new int[x];
        datas = br.readLine().split(" ");
        for(int i = 0;i<x;i++) height[i] = Integer.parseInt(datas[i]);

        int dp[] = new int[x];
        int max = 0;
        int max_idx = 0;

        for (int i =0 ; i<x ; i++)
            if(height[i]>max){
                max = height[i];
                max_idx = i;
            }
        // left side max check
        int before_max = 0;
        for (int i =0 ; i<=max_idx ; i++){
            if (before_max<height[i]) before_max = height[i];
            dp[i] =  before_max;
        }
        // right side max check
        before_max = 0;
        for ( int i =x-1 ; i>max_idx ; i-- ){
            if (before_max<height[i]) before_max = height[i];
            dp[i] =  before_max;
        }
        int sum = 0;
        for ( int i = 0 ; i<x ; i++ ) sum += dp[i] - height[i];
        System.out.println(sum);
    }
}