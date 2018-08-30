public class algo35 {
    public int searchInsert(int[] nums, int target) {
        if(nums==null || nums.length==0){
            return -1;
        }
        int left=0;
        int right=nums.length-1;
        if(target>nums[right])
            return right+1;
        if(target<nums[left])
            return left;
        while(left+1<right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                right=mid;
            }else if(nums[mid]>target){
                right=mid;
            }else{
                left=mid;
            }
        }
        if(nums[left]==target){
            return left;
        }
        if(nums[right]==target){
            return right;
        }
        return right;
    }
}
