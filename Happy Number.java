class Solution {
    public boolean isHappy(int n) {
 HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;

            // Sum of squares of digits
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            
            n = sum; // updating n
        }

        return n == 1;
    }
}
