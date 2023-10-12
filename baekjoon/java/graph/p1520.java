import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int way[][] = {{0,1},{1,0},{0,-1},{-1,0}};
    static int nums[][] = new int[500][500];
    static int dp[][] = new int[500][500];
    static int sx = 0;
    static int sy = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String datas[] = br.readLine().split(" ");
        sy = Integer.parseInt(datas[0]);
        sx = Integer.parseInt(datas[1]);
        for(int i=0;i<sy;i++) {
            datas = br.readLine().split(" ");
            for(int j=0;j<sx;j++) nums[i][j] = Integer.parseInt(datas[j]);
        }
        System.out.print(dfs(0,0));
    }
    public static int dfs(int y, int x) {
        int sumways = 0;
        for(int i=0;i<4;i++){
            if(x+way[i][1]>=0 && x+way[i][1]<sx && y+way[i][0]>=0 && y+way[i][0]<sy){
                if (nums[y][x]>nums[y+way[i][0]][x+way[i][1]]){
                    if (y+way[i][0] == sy-1 && x+way[i][1] == sx - 1)  sumways += 1;
                    else if (dp[y+way[i][0]][x+way[i][1]] == 0) sumways += dfs(y+way[i][0],x+way[i][1]);
                    else if (dp[y+way[i][0]][x+way[i][1]] != -1) sumways += dp[y+way[i][0]][x+way[i][1]];
                }
            }
        }
        if (sumways == 0) dp[y][x] = -1;
        else dp[y][x] = sumways;

//        System.out.print(y);
//        System.out.print(" ");
//        System.out.println(x);
//        for(int i=0;i<sy;i++) {
//            for(int j=0;j<sx;j++) {
//                System.out.print(dp[i][j]);
//                System.out.print(" ");
//
//            }
//            System.out.println(" ");
//        }

        return sumways;
    }
}
/*
<알고리즘>
DFS와 DP

왼쪽 위 지점을 시작으로 DFS를 시작, 각 노드에서는 4방향의 길 개수를 합하여 반환.
목적지에 도달하면 1을 반환, 돌아오는 과정에서 길들의 개수가 합해짐.
길들의 개수를 DP에 저장해 둔 후, 만약 이미 갔던 길을 가고자 한다면 그냥 DP값을 이용.
이때 불가능한 길이 판단되면 DP에 -1을 넣어두어, 불필요한 탐색을 피함.
*/
