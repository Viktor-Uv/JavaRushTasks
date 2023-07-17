package lektion0404.task04;

/*
Seeing dollars in your future
*/

public class Solution {
    public static void main(String[] args) {
        byte i = 0;
        byte j = 0;
        while (i < 10) {
            while (j < 10) {
                j++;
                System.out.print("$");
            }
            System.out.println();
            i++;
            j = 0;
        }
    }
}
