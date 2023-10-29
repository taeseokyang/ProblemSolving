import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums[] = br.readLine().split(" ");
        int time = Integer.parseInt(nums[0]);
        int drink = Integer.parseInt(nums[1]);
        if (drink == 0 && (time < 12 || time > 16)) System.out.print(320);
        else System.out.print(280);
    }
}