package lektion0406.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Drawing a rectangle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sm = reader.readLine();
        String sn = reader.readLine();
        int m = Integer.parseInt(sm);
        int n = Integer.parseInt(sn);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}