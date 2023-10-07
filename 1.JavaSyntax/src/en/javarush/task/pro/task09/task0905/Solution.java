package en.javarush.task.pro.task09.task0905;

/* 
Octal converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Decimal number " + decimalNumber + " is equal to octal number " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Octal number " + octalNumber + " is equal to decimal number " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //write your code here
        return convertBase(decimalNumber, 10, 8);
    }

    public static int toDecimal(int octalNumber) {
        //write your code here
        return convertBase(octalNumber, 8, 10);
    }

    private static int convertBase(int number, int fromBase, int toBase) {
        // 5 * 10^0 + 2 * 10^1
        // 5 *  8^0 + 2 *  8^1
        int converted = 0;
        int i = 0;
        while (number > 0) {
            converted += (int) ( // cast result into integer and sum with previous
                    (number % toBase) * // get 'toBase' digits (from right to left)
                            Math.pow(fromBase, i) // add it to an appropriate rank
            );
            number /= toBase; // reduce source number by 'toBase' times
            i++;
        }
        return converted;
    }
}
