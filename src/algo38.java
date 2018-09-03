public class algo38 {
    public String countAndSay(int num){
        if(num==1){
            return "1";
        }
        else{
            String ss=countAndSay(num-1);
            String res="";
            int len=1;
            int i=1;
            while(i<ss.length()){
                if(ss.charAt(i)==ss.charAt(i-1)){
                    len++;
                }else{
                    res=res+String.valueOf(len)+String.valueOf(ss.charAt(i-1));
                    len=1;
                }
                i++;
            }
            res=res+String.valueOf(len)+String.valueOf(ss.charAt(i-1));
            return res;
        }
    }
}
