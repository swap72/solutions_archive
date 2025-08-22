class Main {
    public static void main(String[] args) {
        int ar[]={3,5,6,6,1,3,7};
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        int dup=0; int p=0;
        for (int e : ar) {
            if(!lhs.contains(e)){
                lhs.add(e);
                dup++;
            }
        }
        int[] res=new int[dup];
        for (int e : lhs) {
            res[p++]=e;
        }
        System.out.println(Arrays.toString(res));
    }
}
