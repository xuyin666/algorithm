public class algo28 {
    public int strStr(String haystack, String needle) {
        if(needle.equals(""))
            return 0;
        int hlen=haystack.length();
        int nlen=needle.length();
        if(hlen<nlen)
            return -1;

        for(int i=0;i<hlen-nlen+1;i++){
            int j=0;
            while(j<nlen){
                if(haystack.charAt(i+j)==needle.charAt(j))
                    j++;
                else
                    break;
            }
            if(j==nlen){
                return i;
            }
        }
        return -1;
    }
}
