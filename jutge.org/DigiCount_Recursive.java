import java.util.Scanner;

public class Main {
    public static int numberOfDigits(int n) {
        if (n < 10) return 1;
        return 1 + numberOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;           
            System.out.println(numberOfDigits(n));
        }
    }
}



/*

jutge.org has very strict judging constraints and also hidden test cases

can also use BigInteger for edge cases

*/
