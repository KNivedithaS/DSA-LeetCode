class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] res=new int[nums.length];
        int ls=0,rs=0;
        for(int i=0;i<nums.length;i++){
            ls=0;
            rs=0;
           for(int k=0;k<nums.length;k++){
            if(i>k){
                ls+=nums[k];
            }
            if(i<k){
                rs+=nums[k];
            }
           }
          res[i]=Math.abs(ls-rs);
    }
    return res;
}
}