class Main {
    public static void main(String[] args) {
        int ar[]={3,5,6,6,1,3,7};
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        int unq=0; int p=0;
        for (int e : ar) {
            if(!lhs.contains(e)){
                lhs.add(e);
                unq++;
            }
        }
        int[] res=new int[unq];
        for (int e : lhs) {
            res[p++]=e;
        }
    }
}
