class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        ArrayList<Integer> cntarr = new ArrayList<>();
        int now = 0;
        int len = arr.length;
        Arrays.sort(arr);
        cntarr.add(1);
        for(int i=1;i<len;i++){
            if(arr[i] == arr[i-1])cntarr.set(now,cntarr.get(now)+1);
            else {
                cntarr.add(1);
                now++;
            }
        }
        Collections.sort(cntarr);
        len = cntarr.size();
        int output = len;
        for(int i=0;i<len;i++){
            if(cntarr.get(i)<=k){
                k -= cntarr.get(i);
                output--;
            }else{
                break;
            }
        }
        return output;
    }
}