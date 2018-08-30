public class algo29 {
    public int divide(int dividend, int divisor) {
        if(dividend==0)
            return 0;
        boolean signe=true;
        if((dividend>0 && divisor<0) || (dividend<0 && divisor>0))
            signe=false;
        if(dividend==Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;
        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
        int shift;
        int result=0;
        while(a>=b){
            shift=0;
            while(a>=(b<<shift)){
                shift++;
            }
            a-=b<<(shift-1);
            result+=1<<(shift-1);
        }
        return (signe==true?result:-1*result);
    }
}
