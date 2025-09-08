import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int[] res=Arrays.copyOf(nums,nums.length);
        Arrays.sort(res);
        for(int i=0;i<res.length;i++){
            if(res[i]!=i){
                return i;
            }
        }
        return res[res.length-1]+1;
    }
}