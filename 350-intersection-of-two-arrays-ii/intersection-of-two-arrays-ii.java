class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[1001];
        for(int i:nums1){
            arr[i]++;
        }
        int[] a = new int[Math.min(n,m)];
        int x = 0;
        for(int i:nums2){
            if(arr[i]!= 0){
                a[x] = i;
                x++;
                arr[i]--;
            }
        }
        int[] ans = new int[x];
        int k = 0;
        for(int i = 0;i<x;i++){
            ans[k] = a[i];
            k++;
        }
        return ans;
    }
}