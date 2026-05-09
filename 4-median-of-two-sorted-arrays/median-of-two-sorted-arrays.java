class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(m+n==0) return 0;
        int[] nums = new int[m+n];

        int i =0 ;
        int j = 0;
        int k =0;
        int limit = (m+n)/2;
        while (i<m && j<n && k <= limit){
            if(nums1[i]<nums2[j]){
                nums[k++] = nums1[i++];
            }
            else{
                nums[k++] = nums2[j++];
            }
        }
        while(i<m &&  k<=limit){
            nums[k++]= nums1[i++];
        }
        while(j<n && k<=limit){
            nums[k++]=nums2[j++];
        }

        if((m+n)%2==0) return ((nums[limit])+nums[limit-1])/2.0;
        else return nums[limit];
    }
}