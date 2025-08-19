public class Main {
    public static void main(String[] args) {
        int n = 5;

        // loop for top half and bottom half together
        for (int i = n; i >= 1; i--) {
            Pattern(i, n);
        }
        for (int i = 2; i <= n; i++) {
            Pattern(i, n);
        }
    }

    static void Pattern(int i, int n) {
        // spaces
        for (int s = 0; s < n - i; s++) System.out.print("  ");
        // increasing
        for (int j = 1; j <= i; j++) System.out.print(j + " ");
        // decreasing
        for (int j = i - 1; j >= 1; j--) System.out.print(j + " ");
        System.out.println();
    }
}
