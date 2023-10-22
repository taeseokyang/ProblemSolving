import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int way[][] = {{0,1},{-1,0},{0,-1},{1,0}};
    static int w = 0;
    static int h = 0;
    static int map[] = new int[26];
    static int nums[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String chars[] = line.split(" ");
        w = Integer.parseInt(chars[1]);
        h = Integer.parseInt(chars[0]);
        nums = new int[h][w];
        for(int i=0;i<h;i++) {
            line = br.readLine();
            for (int j=0;j<w;j++) nums[i][j] = line.charAt(j)-65;
        }
        System.out.print(dfs(0,0,0));
    }
    public static int dfs(int y, int x,int n){
        if (map[nums[y][x]] == 1) return n;
        map[nums[y][x]] = 1;
        int max_depth = 1;
        for(int i = 0 ; i< 4 ;i++)
            if (y+way[i][0]>= 0 && y+way[i][0]<h && x+way[i][1]>= 0 && x+way[i][1]<w) {
                int depth = dfs(y + way[i][0], x + way[i][1], n + 1);
                if (depth > max_depth) max_depth = depth;
            }
        map[nums[y][x]] = 0;
        return max_depth;
    }
}