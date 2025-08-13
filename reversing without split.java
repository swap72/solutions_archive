class Main{
    static String rev(String x){
        return new StringBuilder(x).reverse().toString();
    }
    public static void main(String[] args) {
        String s="Ram is a good boy";
        StringTokenizer tk=new StringTokenizer(s," ");
        while (tk.hasMoreTokens()){
            System.out.println(rev(tk.nextToken()));
        }
    }
}
