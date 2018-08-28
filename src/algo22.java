import java.util.ArrayList;
import java.util.List;

public class algo22 {
    public List<String> generateParenthesis(int n) {
        List<String> ls=new ArrayList<>();
        String s1="";
        createPare(0,0,n,s1,ls);
        return ls;
    }


    public void createPare(int left,int right, int n,String s, List<String> lsl){
        if(left==right && left==n){
            lsl.add(s);
            return;
        }
        if(left<n){
            createPare(left+1,right,n,s+"(",lsl);
        }
        if(right<n && right<left){
            createPare(left,right+1,n,s+")",lsl);
        }
    }
}
/*总结：主要思路是递归，但是一下子想不到递归上面去，以后可以思考如果是列出所有的结果，都需要考虑一下递归。
在这里我用了一个递归函数 有变量left 和 right 分别代表两个方向的括号数量 如果左边的括号小于n 可以不断的加
但是如果 右边的括号小于n 不能不断的加 因为这要是合理的括号集 所以有个限制条件 right的括号数小于右边的且小于n
才能加右边的括号
* */