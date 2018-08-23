import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        algo17 aa=new algo17();
        List<String> str=new ArrayList<String>();
        str=aa.letterCombinations("235");
        for(int i=0;i<str.size();i++){
            System.out.println(str.get(i));
        }
    }
}
