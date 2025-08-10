public class Main{
    static int HappyNum(int x){
        HashSet<Integer> seen=new HashSet<Integer>();
        while(x!=1&&!seen.contains(x)){
            int sum=0;
            seen.add(x);
            while(x>0){
                int rem=x%10;
                sum=sum+(int)Math.pow(rem,2);
                x=x/10;
            }
            x=sum;
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println(HappyNum(19));
    }
}

