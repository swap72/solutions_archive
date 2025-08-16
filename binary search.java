class Main {
    static int search(int[] nums, int target) {
        int low=0; int high=nums.length-1;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(nums[mid]==target){
                return mid;
            }
            if(target>nums[mid]){
                low=mid+1;
            }
            if(target<nums[mid]){
                high=mid-1;
            }
        }
        return -404;
    }
    public static void main(String[] args) {
        int[] ar={1,3,4,6,9};
        System.out.println(search(ar,91));
    }
}


/*

Basically we are filtering the indexes by dividing our search areas 
this algorithm is designed in such a way 
that the mid variable will eventually store our target index number and return it.

*/
