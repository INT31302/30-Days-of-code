import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            list.add(br.readLine());
        }
        for (int i = 0; i < T; i++) {
            int len = list.get(i).length();
            for (int j = 0; j < len; j += 2) {
                bw.write(list.get(i).charAt(j));
            }
            bw.write(" ");
            for (int j = 1; j < len; j += 2) {
                bw.write(list.get(i).charAt(j));
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}