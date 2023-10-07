package en.javarush.task.pro.task09.task0906;

/* 
Binary converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //write your code here
        String binary = "";
        while (decimalNumber > 0) {
            binary = decimalNumber % 2 + binary;
            decimalNumber /= 2;
        }
        return binary;
    }

    public static int toDecimal(String binaryNumber) {
        //write your code here
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return 0;
        }
        int decimal = 0;
        for (int i = 0, length = binaryNumber.length(); i < length; i++) {
            int binaryDigit = binaryNumber.charAt(length - i - 1) == '0' ? 0 : 1;
            decimal += (int) (binaryDigit * Math.pow(2, i));
        }
        return decimal;
    }
}
