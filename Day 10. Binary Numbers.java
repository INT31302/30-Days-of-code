import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String str = Integer.toBinaryString(n);
        int len = str.length();
        int cnt = 0;
        int max = 0;
        for(int i =0; i<len; i++){
            if(str.charAt(i)=='1'){
                cnt++;
            }else cnt = 0;
            max = max < cnt? cnt:max;
        }
        
        System.out.println(max);
        scanner.close();
    }
}