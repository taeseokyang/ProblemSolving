import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ball_num = input.nextInt();
        int times = input.nextInt();
        int nums[] = new int[ball_num];

        for (int i=0;i<ball_num;i++) {
            nums[i] = i+1;
        }
        for (int i=0;i<times;i++) {
            int num1 = input.nextInt()-1;
            int num2 = input.nextInt()-1;
            int d = 0;
            d = nums[num1];
            nums[num1] = nums[num2];
            nums[num2] = d;
        }
        for (int i=0;i<ball_num;i++) {
            System.out.printf("%d ",nums[i]);
        }
    }
}