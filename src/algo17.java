import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class algo17 {
    public List<String> letterCombinations(String digits) {
        List<String> str= new ArrayList<String>();
        if(digits.length()==0)
            return str;
        HashMap<Character,String> map=new HashMap<Character, String>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        findCombination(str,"",digits,map,0);
        return str;
    }

    public void findCombination(List<String>str,String str1,String digits,HashMap<Character,String> map,int index){
        if(index==digits.length()) {
            str.add(str1);
            return;
        }

            String s1=map.get(digits.charAt(index));
            for (int i = 0; i < s1.length(); i++) {
                str1 = str1 + s1.charAt(i);
                findCombination(str, str1, digits, map, index + 1);
                str1 = str1.substring(0, str1.length()-1);
            }

    }

}
