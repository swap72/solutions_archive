/*
Careful with Integer caching [-127  128] equals usually recommended 
*/

public class Main {
    static String PDivisors(Integer x){
        Integer sum = 0;
        for (int i = 1; i < x; i++) {
            if(x % i == 0){
                sum = sum + i;
            }
        }
        return sum.equals(x) ? "Perfect Number" : "Not Perfect Number";
    }

    public static void main(String[] args) {
        System.out.println(PDivisors(8128));
    }
}
