class Solution {
    public void sortColors(int[] nums) {
            int i=0,j=0,k=nums.length-1;
        while(k>=j){
            if(nums[j]==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
            }
            else if(nums[j]==2){
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                k--;
            }
            else{
                j++;
            }
        }
    }
}