import java.io.*;
import java.util.*;

public class Solution {

    private static boolean calculate(int num) {
        int len = (int) Math.sqrt(num);
        if (num == 1)
            return false;
        for (int i = 2; i <= len; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int num = 0;
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());
            if (calculate(num))
                bw.write("Prime\n");
            else
                bw.write("Not prime\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}