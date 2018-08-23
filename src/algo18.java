import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algo18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result =new ArrayList<>();
        if(nums.length<4)
            return result;
        Arrays.sort(nums);
        int i,j,m,n;
        int len=nums.length;
        int sum=0;
        for(i=0;i<len-3;i++){
            for(j=i+1;j<len-2;j++){
                for(m=j+1,n=len-1;m<n;){
                    sum=nums[i]+nums[j]+nums[m]+nums[n];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[m],nums[n]));
                    }
                    while(sum==target && m<n){
                        m++;
                        if(nums[m-1]!=nums[m])
                            break;
                    }
                    if(sum<target && m<n){
                        m++;
                    }
                    if(sum>target && m<n){
                        n--;
                    }
                }
                while(nums[j]==nums[j+1] && j<len-2){
                    j++;
                }
            }
            while(nums[i]==nums[i+1] && i<len-3){
                i++;
            }
        }
        return result;
    }
}
