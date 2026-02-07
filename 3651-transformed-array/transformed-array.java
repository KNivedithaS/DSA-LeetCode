class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + nums[i]) % n;

            // handle negative modulo
            if (newIndex < 0) {
                newIndex += n;
            }

            res[i] = nums[newIndex];
        }

        return res;
    }
}
