import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Location{
    int y, x;
    Location(int y, int x){
        this.y = y;
        this.x = x;
    }
}
public class Main {
    static int w = 0;
    static int h = 0;
    static int dp[][];
    static int nums[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String chars[] = line.split(" ");
        w = Integer.parseInt(chars[1]);
        h = Integer.parseInt(chars[0]);
        nums = new int[h][w];
        dp = new int[h][w];
        for(int i=0;i<h;i++) {
            line = br.readLine();
            chars = line.split(" ");
            for (int j=0;j<w;j++) nums[i][j] = Integer.parseInt(chars[j]);
        }
        System.out.print(bfs());
    }
    public static int bfs(){
        ArrayList<Location> q = new ArrayList<Location>();
        q.add(new Location(0,0));
        while (!q.isEmpty()){
            Location now = q.get(0);
            q.remove(0);
            int y = now.y;
            int x = now.x;
            int reach = nums[y][x];
            for(int i =1;i<=reach;i++){
                if (x+i < w)
                    if( dp[y][x+i] == 0 || dp[y][x]+1 < dp[y][x+i] ){
                        dp[y][x+i] = dp[y][x]+1 ;
                        q.add(new Location(y,x+i));
                    }
                if (y+i < h)
                    if( dp[y+i][x] == 0 || dp[y][x]+1 < dp[y+i][x] ){
                        dp[y+i][x] = dp[y][x]+1 ;
                        q.add(new Location(y+i,x));
                    }
            }

        }
        return dp[h-1][w-1];
    }
}