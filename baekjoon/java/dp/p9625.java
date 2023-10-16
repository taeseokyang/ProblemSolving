import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AandB{
    int a, b;
    AandB(int a, int b){
        this.a = a;
        this.b = b;
    }
}
public class Main {
    static AandB dp[] = new AandB[45];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n>=1) dp[0] = new AandB(0,1);
        if (n>=2) dp[1] = new AandB(1,1);
        for(int i=2;i<n;i++){
            dp[i] = new AandB(dp[i-1].a+dp[i-2].a,dp[i-1].b+dp[i-2].b);
        }
        System.out.print(dp[n-1].a+" "+dp[n-1].b);
    }

}