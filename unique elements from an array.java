
class Main{
    public static void main(String[] args) {
        int[] ar={5,5,7,6,1,9,0,41,71,0,4};
        ArrayList<Integer> ual =new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for (int e : ar) {
            hm.put(e, hm.getOrDefault(e, 0)+1);
        }
        
        for (int e : ar) {
            if(hm.get(e)==1){
                ual.add(e);
            }
        }
        System.out.println(ual);
    }
}
