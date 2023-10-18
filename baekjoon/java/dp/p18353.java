import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class Main {
    static int dp[] = new int[2000];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int lds = 0;
        String datas[] = br.readLine().split(" ");
        for(int i=n-1;i>=0;i--) {
            int data = Integer.parseInt(datas[i]);
            int idx = bs(0,lds,data);
            if (idx >= lds ) lds++;
            dp[idx] = data;
        }
        System.out.print(n-lds);
    }
    static int bs(int l, int r, int k){
        int m;
        while(l<r){
            m = (l+r)/2;
            if(dp[m]<k)l = m+1;
            else r = m;
        }
        return r;
    }
}