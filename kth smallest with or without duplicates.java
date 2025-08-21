// relatively simpler logic, considering the array contains unique elements.

class Main {
    static int kthSmallest(int[] a1, int k) {
        Arrays.sort(a1);          // sort ascending
        return a1[k - 1];         // k-th element directly
    }

    public static void main(String[] args) {
        int[] a1 = {5, 6, 1, 7, 8, 1, 1, 3, 4, 9};
        int[] a2={3,67,77,1,4};
        System.out.println(Arrays.toString(a1));
        System.out.println("3rd smallest (with duplicates) = " + kthSmallest(a1, 3));
        System.out.println(Arrays.toString(a2));
        System.out.println("3rd smallest (without duplicates) = " + kthSmallest(a2, 3));
    }
}

// kth smallest element when array contains duplicates

class Main {
    static int kthDistinctSmallest(int[] a1, int k) {
        Arrays.sort(a1); // sort array
        int distinctCount = 1; // a1[0] is the 1st distinct

        if (k == 1) return a1[0]; // special case

        for (int i = 0; i < a1.length - 1; i++) {
            if (a1[i] != a1[i + 1]) { // boundary between two distincts
                distinctCount++;
                if (distinctCount == k) {
                    return a1[i + 1]; // return the NEW distinct element
                }
            }
        }

        return -1; // if k > number of distinct elements, or if not found.
    }

    public static void main(String[] args) {
        int[] a1 = {5, 6, 1, 7, 8, 1, 1, 3, 4, 9};
        System.out.println(Arrays.toString(a1));
        System.out.println("3rd distinct smallest = " + kthDistinctSmallest(a1, 3));
        System.out.println("5th distinct smallest = " + kthDistinctSmallest(a1, 5));
        System.out.println("8th distinct smallest = " + kthDistinctSmallest(a1, 8));
    }
}
