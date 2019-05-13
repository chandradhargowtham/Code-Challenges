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
        String bi=(Integer.toBinaryString(n));//output is a binary number in string format
        String arr[]=bi.split("0");//create new array by splitting string at the char 0. we need consecutive 1's and no use with zero
        Arrays.sort(arr); // ascending sort done
        System.out.println(arr[arr.length-1].length()); // print the last value i.e ascending order
        scanner.close();
    }
}
