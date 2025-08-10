public class Main{
    static boolean isUnique(int x){
        HashSet<Integer> u=new HashSet<Integer>();
        boolean unique=true;
        while(x!=0){
            if(!u.add(x%10)){
                unique=false;
                return unique;
            }
            x=x/10;
        }
        return unique;
    }
    public static void main(String[] args) {
        System.out.println(isUnique(191));
    }
}
