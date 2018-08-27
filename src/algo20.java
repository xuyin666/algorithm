import java.util.HashMap;
import java.util.Stack;

public class algo20 {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        if(s.length()%2==1)
            return false;
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                st.push(ch);
            }
            else{
                if(validate(ch,st)==false)
                    return false;
            }
        }
        if(st.empty()==true)
            return true;
        else
            return false;
    }

    public boolean validate(char s,Stack<Character> sd){

        if(sd.empty()==true){
            return false;
        }
        else{
            if(sd.peek()==changeChar(s)){
                sd.pop();
                return true;
            }
            else
                return false;
        }
    }


    public char changeChar(char cc){
        if (cc =='}' ) {
            return '{';
        }
        if(cc == ')'){
            return '(';
        }
        if(cc == ']'){
            return '[';
        }
        return ' ';
    }
}
