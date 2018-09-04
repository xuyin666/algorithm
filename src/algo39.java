import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algo39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        findCombination(res,temp,candidates,target,0);
        return res;
    }

    public void findCombination(List<List<Integer>> res,List<Integer> temp,int[] candidates,int target,int j){
        if(target<0)
            return ;
        if(target==0)
            res.add(new ArrayList<>(temp));
        for(int i=j;i<candidates.length;i++){
            temp.add(candidates[i]);
            findCombination(res,temp,candidates,target-candidates[i],i);
            temp.remove(temp.size()-1);
        }
    }
}
