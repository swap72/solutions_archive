public class Main {
    public static void main(String[] args) {
        int n=5; int a=1;
        for (int i = 1; i <=n; i++) {
            for (int s = 1; s<=n-i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i%2+" ");
            }
            for (int j = i-1; j >=1; j--) {
                System.out.print(i%2+" ");
            }
            System.out.println();
        }
        
        for (int i = n-1; i >=1; i--) {
            for (int s = 1; s<=n-i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i%2+" ");
            }
            for (int j = i-1; j >=1; j--) {
                System.out.print(i%2+" ");
            }
            System.out.println();
        }
    }
}

/*

minimal change
just
int i = n; i >= 1; i--
instead of
i = 1; i <= n; i++

*/
Diamond Pattern
