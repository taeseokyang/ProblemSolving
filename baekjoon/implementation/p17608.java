import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nums[] = new int[n];
        int max = 0;
        int cnt = 0;
        int in = 0;
        for(int i=0;i<n;i++){
            in = input.nextInt();
            nums[i] = in;
        }
        for(int i=n-1;i>=0;i--){
            if (nums[i] >max){
                max = nums[i];
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}