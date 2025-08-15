public class Main {
    public static void main(String[] args) {
        int decimal = 25; // example decimal number
        String binary = decimalToBinary(decimal);
        System.out.println("Binary of " + decimal + " is: " + binary);
    }

    static String decimalToBinary(int num) {
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary; // get remainder and prepend to result
            num /= 2; // divide by 2
        }
        return binary.isEmpty() ? "0" : binary; // handle 0 case
    }
}
