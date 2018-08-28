public class algo26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1)
            return nums.length;
        int size=0;
        for(int i=0;i<nums.length;i++){
            if(nums[size]!=nums[i]){
                size++;
                nums[size]=nums[i];
            }
        }
        return size+1;
    }
}


/* 这个思路是用双指针 一个遍历整个数组 一个用来控制不同数值的那个同一个数组 另设一个变量size=0
每个数值与它比较 相同就过 不同就嵌入它之后
* */