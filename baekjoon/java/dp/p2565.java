import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Couple implements Comparable<Couple>{
    int l, r;
    Couple(int l, int r){
        this.l = l;
        this.r = r;
    }
    @Override
    public int compareTo(Couple c){
        if(this.l>c.l) return 1;
        else return -1;
    }
}


public class Main {
    static int dp[] = new int[500];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int lis = 0;
        List<Couple> nums = new ArrayList<>();
        for(int i=0;i<n;i++) {
            String datas[] = br.readLine().split(" ");
            nums.add(new Couple(Integer.parseInt(datas[0]),Integer.parseInt(datas[1])));
        }
        Collections.sort(nums);
        for(Couple c:nums) {
            int idx = bs(0,lis,c.r);
            if (idx >= lis ) lis++;
            dp[idx] = c.r;
        }
        System.out.print(n-lis);
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