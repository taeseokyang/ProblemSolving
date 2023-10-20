import java.util.ArrayList;
class Solution {
    public int solution(int n, int[] stations, int w) {
        int left = 1;
        int right= 0;
        int cnt =0;
        int reach = w*2+1;
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i=0;i<stations.length;i++){
            right = stations[i]-w;
            if (right<=0) right = 0;
            int length = right-left;
            if (length > 0)answer.add(length);
            left = stations[i]+w+1;
            if (left>n)left = n+1;
        }
        int length = (n+1)-left;
        if (length > 0)answer.add(length);
        for (int i=0;i<answer.size();i++){
            cnt += (answer.get(i)-1)/reach+1;
        }
        return cnt;
    }
}