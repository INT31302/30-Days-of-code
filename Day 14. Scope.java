import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int[] elements){
        this.elements = elements;
    }
    public void computeDifference(){
        int size = elements.length;
        for(int i = 0; i<size; i++){
            for(int j = i; j<size; j++){
                int sum = Math.abs(elements[i]-elements[j]);
                maximumDifference = maximumDifference < sum ? sum : maximumDifference;
            }
        }
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}