import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int len = s.length();
        int nums[] = new int[26];
        Arrays.fill(nums, -1);

        for (int i=0;i<len;i++) {
            if (nums[(int)s.charAt(i)-97]==-1){
                nums[(int)s.charAt(i)-97] = i;
            }
        }
        for (int i=0;i<26;i++) {
            System.out.printf("%d ",nums[i]);
        }
    }
}