class Solution {
    static String gs;
    static int len;
    static int table[][];
    static List<List<String>> result;
    public List<List<String>> partition(String s) {
        result = new ArrayList<>();
        gs = s;
        len = gs.length();
        table = new int[len][len];
        for (int i = 0; i < len; i++) table[i][i] = 1;
        for (int i = 0; i < len - 1; i++)
            if (s.charAt(i) == s.charAt(i + 1)) table[i][i + 1] = 1;
            else table[i][i + 1] = 0;

        for (int i = 3; i < len + 1; i++) {
            for (int j = 0; j < len - i + 1; j++) {
                int start = j;
                int end = j + i - 1;
                if (s.charAt(start) == s.charAt(end) && table[start + 1][end - 1] == 1) table[start][end] = 1;
            }
        }
        dfs("",0);
        return result;
    }
    static void dfs(String substring, int now){
        for(int i = now;i<len;i++){
            if(table[now][i] == 1){
                String new_substring=substring+gs.substring(now,i+1)+" ";
                if(i == len-1) result.add(Arrays.asList(new_substring.split(" ")));
                else dfs(new_substring, i+1);
            }
        }
    }
}