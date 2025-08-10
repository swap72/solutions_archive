/*
num & 1 checks for the right most bit is 1, if yes it's even and reutrns 0 
*/

public class Main {
    static String Parity(int x){
        return (x&1)==0 ? "Even":"Odd";
    }
    public static void main(String[] args) {
        System.out.println(Parity(52));
    }
}
