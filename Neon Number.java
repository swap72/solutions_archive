public class Main{
    static String isNeon(int x){
        int sq=x*x;
        int sum=0;
        while(sq!=0){
            sum=sum+sq%10;
            sq=sq/10;
        }
        return sum==x ? "Neon":"Not Neon";
    }
    public static void main(String[] args) {
        System.out.println(isNeon(9));
    }
}
