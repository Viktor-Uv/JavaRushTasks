package en.javarush.task.pro.task09.task0908;

/* 
Binary to hexadecimal converter
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {

    // create hex and binary arrays:
    private static final List<String> binaryGroups = new ArrayList<>(List.of(
            "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
    ));
    private static final List<String> hexValues = new ArrayList<>(List.of(
            "0", "1", "2", "3", "4", "5", "6", "7",
            "8", "9", "a", "b", "c", "d", "e", "f"
    ));

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
        String hexNumber = "9d0fd092";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //write your code here
        String hex = "";

        // check input string validity
        if (binaryNumber == null || binaryNumber.matches(".*[^01].*|")) {
            return hex;
        }

        // check if inputs length is a multiple of 4
        if (binaryNumber.length() % 4 != 0) {
            // how many '0's to add in front of the binaryNumber to make its lengths a multiple of 4
            int additionalSymbols = 4 - binaryNumber.length() % 4;
            for (int i = 0; i < additionalSymbols; i++) {
                binaryNumber = "0" + binaryNumber;
            }
        }

        /*
        split input using regex: (?<=\G.{4})

         * The ?<= part is a positive lookbehind assertion, which means it checks
         *   if the preceding characters match a certain pattern, but does not consume them
         *   or include them in the match. For example, (?<=a)b matches “b” only if
         *   it is preceded by “a”, but does not include “a” in the match.

         * The \G part is an anchor that matches the position where the previous match ended,
         *   or the beginning of the input if there is no previous match.
         *   For example, \Gabc matches “abc” at the start of the input, or after another “abc”.

         * The .{4} part is a quantifier that matches any four characters, except line terminators.
         */
        String[] digitGroups = binaryNumber.split("(?<=\\G.{4})");

        for (int i = 0; i < digitGroups.length; i++) {
            int groupIndex = binaryGroups.indexOf(digitGroups[i]);
            hex += hexValues.get(groupIndex);
        }

        return hex;
    }

    public static String toBinary(String hexNumber) {
        //write your code here
        String binary = "";

        // check input string validity
        if (hexNumber == null || hexNumber.matches(".*[^0-9a-f].*|")) {
            return binary;
        }

        for (int i = 0; i < hexNumber.length(); i++) {
            int hexIndex = hexValues.indexOf( String.valueOf(hexNumber.charAt(i)));
            binary += binaryGroups.get(hexIndex);
        }

        return binary;
    }
}
