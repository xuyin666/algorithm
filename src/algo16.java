import java.util.Arrays;

public class algo16 {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length<3)
            return Integer.MIN_VALUE;
        Arrays.sort(nums);
        int gap=Integer.MAX_VALUE;
        int i,j,k;
        int num_sum,diff;
        int res=0;
        /* 和3sum一样的思路 先稳住i 然后左右指针往中间靠
        算出 三个数之和与target的差 然后不停的比较 得出最近的那个数值 注意这里是比较绝对值！
        * */
        for(i=0;i<nums.length-2;i++){
            for(j=i+1,k=nums.length-1;j<k;){
                num_sum=nums[i]+nums[j]+nums[k];
                diff=Math.abs(num_sum-target);
                if(gap>diff){
                    res=num_sum;
                    gap=diff;
                }
                if(target==num_sum)
                    return target;
                else if(target<num_sum)
                    k--;
                else
                    j++;
            }
        }
        return res;
    }
}
