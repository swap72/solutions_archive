class Main {
    static int biggest(int[] ar, int k){
        Arrays.sort(ar);
        int uCount=1;
        if(k==1) return ar[ar.length-1];
        for (int i = ar.length-2; i>=0; i--) {
            if(ar[i]!=ar[i+1]){
                uCount++;
                if(uCount==k){
                    return ar[ar.length-k];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] ar={7,8,1,9,9,4,6}; 
        System.out.println(biggest(ar,3));
    }
}

/*

for a unique / non duplicate array directly return arrayLength-k 

*/
