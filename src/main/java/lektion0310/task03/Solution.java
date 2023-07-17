package lektion0310.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Positive number
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

        byte count = 0;

        if (n1 > 0) {
            count++;
        }
        if (n2 > 0) {
            count++;
        }
        if (n3 > 0) {
            count++;
        }

        System.out.println(count);
    }
}
