class Solution {
    public int romanToInt(String s) {
        int res=0;
        char[] sar={'M','D','C','L','X','V','I'};
        int[]  var={1000,500,100,50,10,5,1};
        for (int i = 0; i < s.length(); i++) {
            int value = 0, nextValue = 0;
            

            for (int j = 0; j < sar.length; j++) {
                if (s.charAt(i) == sar[j]) {
                    value = var[j];
                    break;
                }
            }
            
            if (i + 1 < s.length()) {
                for (int j = 0; j < sar.length; j++) {
                    if (s.charAt(i + 1) == sar[j]) {
                        nextValue = var[j];
                        break;
                    }
                }
            }
            if (value < nextValue) {
                res -= value;
            } else {
                res += value;
            }
        }
        return res;
    }
}