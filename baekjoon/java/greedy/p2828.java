import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int f = input.nextInt();
        int l = 1;
        int r = m;
        int cnt = 0;
        int q = 0;
        for (int i =0;i<f;i++){
            int a = input.nextInt();
            q = 0;
            if (r<a){
                q = a-r;
                r = a;
                l += q;
            }else if(l>a){
                q = l-a;
                l = a;
                r -= q;
            }
            cnt += q;
        }
        System.out.print(cnt);
    }
}