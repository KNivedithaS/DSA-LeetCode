class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int cdt = 0;
        for (int num : nums) {
            if (c==0) {
                cdt = num;
            }
            if (num == cdt) {
                c++;
            } else {
                c--;
            }
        }
        return cdt;
    }
}