import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Couple implements Comparable<Couple>{
    int at, gt;
    Couple(int at, int gt){
        this.at = at;
        this.gt = gt;
    }
    @Override
    public int compareTo(Couple c){
        if(this.at>c.at) return 1;
        else return -1;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int time = 0;
        ArrayList<Couple> nums = new ArrayList<>();
        for(int i = 0;i<n;i++){
            String couple[] = br.readLine().split(" ");
            int at = Integer.parseInt(couple[0]);
            int gt = Integer.parseInt(couple[1]);
            nums.add(new Couple(at, gt));
        }
        Collections.sort(nums);
        for(int i = 0;i<n;i++){
            Couple now = nums.get(0);
            nums.remove(0);
            if (now.at>time) time = now.at + now.gt;
            else time += now.gt;
        }
        System.out.println(time);
    }
}