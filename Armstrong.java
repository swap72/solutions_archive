
class Main{
    static String Armstrong(Integer x){
        Integer count=0; Integer sum=0;
        Integer x1=x; Integer x2=x;
        while(x1!=0){
            count++;
            x1=x1/10;
        }
        while(x!=0){
            sum=sum+(int)Math.pow(x%10,count);
            x=x/10;
        }
        return sum.equals(x2) ? "Armstrong":"Not Armstrong";
    }
    public static void main(String[] args){
        System.out.println(Armstrong(9474));
    }
}
