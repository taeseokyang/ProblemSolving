class Node{
    char braket;
    int idx;
    Node(char braket, int idx){
        this.braket = braket;
        this.idx = idx;
    }
}

class Solution {
    public int longestValidParentheses(String s) {
        int len = s.length();
        int stack_len = 0;
        int dp[] = new int[len];
        Node stack[] = new Node[len];

        for(int i=0;i<len;i++){
            if (s.charAt(i) == '(') stack[stack_len++] = new Node('(',i);
            else if (stack_len != 0 && stack[stack_len - 1].braket == '(') {
                dp[stack[stack_len - 1].idx] = 1;
                dp[i] = 1;
                stack[(stack_len--) - 1] = null;
            }
        }
        int cnt = 0;
        int max_cnt = 0;
        for(int i=0;i<len;i++) {
            if (dp[i] == 1)cnt++;
            else cnt=0;
            if(max_cnt<cnt) max_cnt = cnt;
        }
        return max_cnt;
    }
}