

public class Main
{
    
    public static int  setBit(int n ,int i){
        int mask=(1<<i);
        return n|mask;
        
    }
    public static int clearBit(int n,int i){
        int mask=(~(1<<i));
        return n&mask;
    }
    public static int replace(int n ,int i, int val){
        int mask=(val<<i);
        n = clearBit(n,i);
        return n|mask;
    }
    public static int clearLastIBits(int n, int i){
        int mask=(-1<<(i+1));
        return n&mask;
    }
    public static int clearBitInRange(int n ,int i, int j){
        int a=(-1<<(j+1));
        int b=(1<<i)-1;
        int mask=(a|b);
        return n&mask;
    }
    public static int replaceBitsInRange(int n,int m,int i,int j){
        clearBitInRange(n,i,j);
        int mask=m<<i;
        return n|mask;
    }
    
	public static void main(String[] args) {
	    int n=11;
	    System.out.println(clearBitInRange(n,1,2));
	}
}
