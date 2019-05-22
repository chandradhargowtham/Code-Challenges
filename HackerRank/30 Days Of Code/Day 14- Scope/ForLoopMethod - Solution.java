import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    
public Difference(int[] elements)
{
this.elements=elements;
}
public void computeDifference()
{
    
    int diff=0;
    //Arrays.sort(elements);
    //maximumDifference= elements[elements.length-1]-elements[0];
    for(int i=0;i<elements.length;i++)
    {
    	System.out.println("I loop");
        for(int j=elements.length-1;j>=0;j--)
        {
        	System.out.println("J loop");
            diff= elements[i]-elements[j];
            System.out.println("diff= ei-ej "+diff);
            if(diff<0)
            diff*=(-1);
            if(diff>maximumDifference)
            {
            	System.out.println("Diff Before Swap: "+diff);
            maximumDifference=diff;
            System.out.println("Max Div after Swap: "+maximumDifference);
            }
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