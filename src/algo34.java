public class algo34 {
    public int[] searchRange(int[] nums, int target) {
        if(nums==null || nums.length==0){
            return new int[]{-1,-1};
        }
        if(nums.length==1){
            if(nums[0]==target)
                return new int[]{0,0};
            else
                return new int[]{-1,-1};

        }
        int left=0;
        int right=nums.length-1;
        int index=0;
        while(left+1<right){
            int mid=(left+right)/2;
            if(target==nums[mid]){
                index=mid;
                break;
            }
            else if(target>=nums[mid]){
                left=mid;
            }
            else{
                right=mid;
            }
        }
        if(left+1>=right){
            if(nums[left]==target){
                index=left;
            }else if(nums[right]==target){
                index=right;
            }else{
                return new int[]{-1,-1};
            }
        }
        int i=index;
        int j=index;
        while(i>=0)
        {
            if(nums[i]==target)
                i--;
            else
                break;
        }
        while(j<=nums.length-1)
        {
            if(nums[j]==target)
                j++;
            else
                break;
        }
        return new int[]{i+1,j-1};
    }
}
