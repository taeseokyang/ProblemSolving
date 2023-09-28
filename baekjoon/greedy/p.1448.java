import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int nums[] = new int[n];
        for (int i=0;i<n;i++)nums[i] =  Integer.parseInt(br.readLine());
        Arrays.sort(nums);
        for (int i=n-1;i>1;i--){
            if (nums[i]<nums[i-1]+nums[i-2]){
                System.out.print(nums[i]+nums[i-1]+nums[i-2]);
                return;
            }
        }
        System.out.print(-1);
    }
}