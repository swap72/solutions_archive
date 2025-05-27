public class Main{
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] brr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int product=1;
            for (int j = 0; j < arr.length; j++) {
                if(j!=i){
                     product=product*arr[j];
                }
            }
            brr[i]=product;
        }
        for (int i : brr) {
            System.out.print(i+" ");
        }
    }
}
/*
time complexity : O(n²)
but easy to understand
*/
