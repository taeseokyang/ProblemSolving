import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    static int dp[][][] = new int[500][500][4];
    static int ways[][] = {{0,1},{-1,0},{0,-1},{1,0}};
    static String s_grid[] = new String[500];
    static int width = 0;
    static int height = 0;
    public int[] solution(String[] grid) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i<grid.length ;i++) s_grid[i] = grid[i];
        width = grid[0].length();
        height = grid.length;

        for (int i = 0 ;i<height;i++)
            for (int j = 0 ;j<width;j++)
                for (int k = 0 ;k<4;k++){
                    int y = i;
                    int x = j;
                    int way = k;
                    int times = 0;
                    while(true){
                        if (y==i && x==j && way == k && times != 0) break;
                        if (dp[y][x][way] == 1) {
                            times = 0;
                            break;
                        }
                        dp[y][x][way] = 1;
                        if (s_grid[y].charAt(x) == 'L') way = ((way-1)+4)%4 ;
                        else if (s_grid[y].charAt(x) == 'R') way = ((way+1)+4)%4 ;
                        int y_way = ways[(way+4)%4][0];
                        int x_way = ways[(way+4)%4][1];
                        y = ((y+y_way)+height)%height;
                        x = ((x+x_way)+width)%width;
                        times++;
                    }
                    if (times !=0) answer.add(times);
                }
        int real_answer[] = new int[answer.size()];
        for (int i = 0 ;i<answer.size();i++) real_answer[i] = answer.get(i);
        Arrays.sort(real_answer);
        return real_answer;
    }
}