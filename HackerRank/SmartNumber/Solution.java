/*This implementation of Solution is correct but will not work on the HackerRank IDE because of a rule - You should only modify one line. So the Answer is:

        if((val*val) == num)

Another implementation: 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean isSmartNumber(int num) 
    {
        int count=0;
        for(int i=0;i<num;i++)
        {
            if(num%i==0)
                count++;
        }    
        if(count%2==0)
        return true;
        else return false;
    }
    
    public static void main(String[] args) {
        int test_cases;
        Scanner in = new Scanner(System.in);
        test_cases = in.nextInt();
        int num;
        for(int i = 0; i < test_cases; i++){
            num = in.nextInt();
            boolean ans = isSmartNumber(num);
            if(ans){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}



