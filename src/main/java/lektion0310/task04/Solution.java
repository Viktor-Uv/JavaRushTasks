package lektion0310.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Positive and negative numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sn1 = reader.readLine();
        String sn2 = reader.readLine();
        String sn3 = reader.readLine();
        int n1 = Integer.parseInt(sn1);
        int n2 = Integer.parseInt(sn2);
        int n3 = Integer.parseInt(sn3);

        byte countN = 0;
        byte countP = 0;

        if (n1 > 0) {
            countP++;
        } else if (n1 < 0) {
            countN++;
        }

        if (n2 > 0) {
            countP++;
        } else if (n2 < 0) {
            countN++;
        }

        if (n3 > 0) {
            countP++;
        } else if (n3 < 0) {
            countN++;
        }

        System.out.println("Number of negative numbers: " + countN);
        System.out.println("Number of positive numbers: " + countP);
    }
}