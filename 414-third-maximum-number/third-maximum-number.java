class Solution {
    public int thirdMax(int[] nums) {
        long firstMax=Long.MIN_VALUE,secondMax=Long.MIN_VALUE,thirdMax=Long.MIN_VALUE;
        for(int num:nums){
            
            if(num>firstMax){
                thirdMax=secondMax;
                secondMax=firstMax;
                firstMax=num;
            }else if(num>secondMax && num!=firstMax){
                thirdMax=secondMax;
                secondMax=num;
            }else if( num>thirdMax && num!=secondMax && num!=firstMax){
                thirdMax=num;
            }
        }
        return thirdMax==Long.MIN_VALUE?(int)firstMax:(int)thirdMax;
    }
}