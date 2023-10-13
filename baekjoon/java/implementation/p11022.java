import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String[] words = br.readLine().split(" ");
            int a = Integer.parseInt(words[0]);
            int b = Integer.parseInt(words[1]);
            System.out.println("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b));
        }
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
