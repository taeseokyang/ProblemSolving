import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int way[][] = {{0,1},{1,0},{0,-1},{-1,0}}; //방향 배열
    static int nums[][] = new int[500][500]; //데이터 베열
    static int passedway[][] = new int[500][500]; //탐색 했던 길 기록
    static int maxdp[][] = new int[500][500]; // 최대 횟수 기록
    static int sn = 0; // 전역 변수 n
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        sn = n;
        for(int i=0;i<n;i++) { // 데이터 입력 받기
            String line = br.readLine();
            String chars[] = line.split(" ");
            for(int j=0;j<n;j++) nums[i][j] = Integer.parseInt(chars[j]);
        }
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) if(passedway[i][j] == 0) dfs(i,j); // 모든 칸을 시작으로 DFS 수행. 이때 탐색 했던 곳은 하지 않음.
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) if (maxdp[i][j]>max) max = maxdp[i][j]; // 최대값 탐색
        System.out.print(max);
    }
    public static int dfs(int y, int x) {
        passedway[y][x] = 1; // 탐색 했다고 기록
        int totalmax = 1; // 4방향중 최대 값 찾기
        for(int i=0;i<4;i++){ // 4방향 탐색
            if(x+way[i][1]>=0 && x+way[i][1]<sn && y+way[i][0]>=0 && y+way[i][0]<sn){ // 유효한 위치 판단
                if (nums[y][x]<nums[y+way[i][0]][x+way[i][1]]){ // 더 큰지 판단
                    int waymax = 0; // 현재 방향의 최댓값
                    if(passedway[y+way[i][0]][x+way[i][1]]==0) // 탐색 안 했던 곳이면, 계속 해서 탐색, 재귀 들어 갈 수록 +1
                        waymax = 1+dfs(y+way[i][0],x+way[i][1]);
                    else // 탐색 했던 곳이면, 그 곳의 값을 이용해 현재 위치 최댓 값 저장.
                        waymax = maxdp[y+way[i][0]][x+way[i][1]]+1;
                    if (waymax>totalmax)totalmax = waymax; // 4방향중 최대 값 저장
                }
            }
        }
        maxdp[y][x] = totalmax;//maxdp 기록
        return totalmax;
    }
}
/*
해결 방법

첫번째 시도 - BFS와 DP
BFS를 사용하여 dp를 갱신해 나가는 코드를 작성하였으나, 시간초과
최악의 경우 n*n*n*n 임.

두번째 시도 - DFS
DFS는 BFS에 비하여 빠를줄 알았으나 지금 생각해 보면, 단순한 DFS도 BFS와 비숫함.

세번째 시도 - DFS에서 한번 갔던 길은 탐색x 그 정보를 이용해 지금 위치의 값 판단.
각각의 위치를 딱 한번씩만 탐색. 이미 탐색 했던 위치를 만나면 다시 탐색하지 않아도
그 값을 이용해 지금 위치의 값을 알 수 있음.
*/
