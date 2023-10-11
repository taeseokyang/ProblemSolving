import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Long nums[] = new Long[n];
        String line = br.readLine();
        String chars[] = line.split(" ");
        for(int j=0;j<n;j++) nums[j] = Long.parseLong(chars[j]);
        Arrays.sort(nums);
        Long max = 0L;
        int last = n-1;
        if (nums.length%2==1){
            max = nums[n-1];
            last--;
        }
        for(int j=0;j<(last+1)/2;j++)if (max<nums[j]+nums[last-j])max = nums[j]+nums[last-j];
        System.out.print(max);

    }
}