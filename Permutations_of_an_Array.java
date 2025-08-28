class Main{
    static int Permutation(int[] ar){
        int first=0;
        int count=0;
        while(first<ar.length){
            for (int i = 1; i < ar.length; i++) {
                int tmp=ar[first];
                ar[first]=ar[i];
                ar[i]=tmp;
                count++;
            }
            first++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] ar={29,31,67,17,81,19,11};
        System.out.println(Permutation(ar));
    }
}
