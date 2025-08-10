public class Main {
    public static int findKthSmallest(int[] arr, int k) {
        // Max Heap for k elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            pq.offer(num); // Add element
            if (pq.size() > k) {
                pq.poll(); // Remove largest to keep size k
            }
        }
        return pq.peek(); // Root is k-th smallest
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(k + "-th smallest element is " + findKthSmallest(arr, k));
    }
}
