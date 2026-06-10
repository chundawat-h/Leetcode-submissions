class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e =nums.length-1;
        int mid = s+ (e-s)/2;
        while(s<=e){
            if(target < nums[mid]){
                e = mid -1;
            }
            else if(target > nums[mid]){
                s = mid+1;
            }
            else{
                return mid;
            }
            mid = s+ (e-s)/2;
        }
        return -1;

    }
}