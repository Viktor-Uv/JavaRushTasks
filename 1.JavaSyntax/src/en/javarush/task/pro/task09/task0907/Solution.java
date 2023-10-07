package en.javarush.task.pro.task09.task0907;

/* 
Hexadecimal converter
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //write your code here
        String hex = "";
        int base = 16;
        while (decimalNumber > 0) {
            hex = HEX.charAt(decimalNumber % base) + hex;
            decimalNumber /= base;
        }
        return hex;
    }

    public static int toDecimal(String hexNumber) {
        //write your code here
        if (hexNumber == null || hexNumber.isEmpty()) {
            return 0;
        }
        int base = 16;
        int decimal = 0;
        for (int i = 0, length = hexNumber.length(); i < length; i++) {
            String symbol = hexNumber.substring(length - i - 1, length - i); // symbols from right to left
            int hexValue = HEX.indexOf(symbol); // index value in HEX system of the given symbol
            decimal += (int) (hexValue * Math.pow(base, i));
        }
        return decimal;
    }
}
