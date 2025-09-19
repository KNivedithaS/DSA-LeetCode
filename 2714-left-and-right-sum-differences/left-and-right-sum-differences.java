class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] res=new int[nums.length];
        int i=0,ls=0,rs=0;
        while(i<nums.length){
            ls=0;
            rs=0;
        for(int j=0;j<i;j++){
            ls+=nums[j];
        }
        for(int k=nums.length-1;k>i;k--){
           
                rs+=nums[k];
           }
          res[i]=Math.abs(ls-rs);
          i++;
    }
    return res;
    }
}