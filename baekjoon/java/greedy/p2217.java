import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nums[] = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            nums[i] = input.nextInt();
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int c = nums[i]*(n-i);
            if(c>max){
                max = c;
            }

        }
        System.out.print(max);
    }
}