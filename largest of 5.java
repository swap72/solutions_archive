/*

Largest of 5 numbers sequential approach

*/ 


public class Main {
    public static void main(String[] args) {
        int a=551, b=45312, c=8, d=28, e=84;
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        if (d > largest) largest = d;
        if (e > largest) largest = e;
        System.out.println("Largest: " + largest);
    }
}
