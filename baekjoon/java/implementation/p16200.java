import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String datas[] = br.readLine().split(" ");
        int nums[] = new int[n];
        int cnt = 0;
        int team = 0;
        int main = 0;
        for(int i = 0;i<n;i++) nums[i] = Integer.parseInt(datas[i]);
        Arrays.sort(nums);
        for(int i = 0;i<n;i++){
            if(team == 0) {
                cnt++;
                main = nums[i];
            }
            team++;
            if (main == team) team = 0;
        }
        System.out.print(cnt);
    }
}